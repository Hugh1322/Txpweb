$(function() {
	
	//jq 和 zepto ajax全局设置（通用的）

	$.ajaxSettings.beforeSend = function() {
		showLoading();
	}
	$.ajaxSettings.complete = function() {
		hideLoading();
	}
	$.ajaxSettings.error = function() {
		BtnAlert("连接异常，请稍后重试！");
	}
	
	if(getParameter("terminalType") == "1" ||getParameter("terminalType") == "2") {
		
		$("header").hide(); //去掉头部
		
		$(".mui-content").css("margin-top", "-0.88rem");
		
	}
	
	//返回按钮
	$('.backToIndex').on('click', function() {
		
		var btnArray = ['取消', '确定'];
		mui.confirm('完成信用认证，可获取借款额度<br/>您确定要离开吗？', ' ', btnArray, function(e) {
			if(e.index == 1) {
				window.location.href = '../Home/index.html';
			} else {
				return;
			}
		});
		
	});
	
});

//设置html元素的font-size，方便rem布局--------------------------------------
var fontSize = document.documentElement.clientWidth / 7.5; //number类型
document.documentElement.style.fontSize = fontSize + 'px';

$(window).resize(function() { //窗口改变也设置html字体大小
	var fontSize = document.documentElement.clientWidth / 7.5; //number类型
	document.documentElement.style.fontSize = fontSize + 'px';
})
//设置html元素的font-size，方便rem布局--------------------------------------

var ajaxUrl = '/loanapp-api-web';

//获取info信息
//var userInfo = JSON.parse(window.localStorage.getItem('userInfo'));

//获取本地localStorage值
function seGetItem(str) {
	if(str !='null') {
		return window.localStorage.getItem(str)
	} else {
		return '';
	}

}



//查询认证到哪一步了
function getCurrentStep(status) {
	$.ajax({
		type: "post",
		url: ajaxUrl + '/v3/app/order/a3/appCheckLogin/getCurrentStep.do',
		dataType: "json",
		data: {
			"orderId": seGetItem("orderId")
		},
		success: function(data) {
			if(data.code == '000' && data.result) {
				if(data.result.currentStep == 1) { //当前步骤(1.身份认证,2.绑卡,3.联系信息,4.单位信息,5.运营商,6.芝麻信用,7.资料汇总)
					if(status){
						window.location.href = '../CreditCertification/personCertification.html?status='+status;
					}else{
						window.location.href = '../CreditCertification/personCertification.html';
					}
				} else if(data.result.currentStep == 2) {
					window.location.href = '../CreditCertification/bindCard.html';
				} else if(data.result.currentStep == 3) {
					window.location.href = '../CreditCertification/informationCertification.html';
				} else if(data.result.currentStep == 4) {
					window.location.href = '../CreditCertification/jobCertification.html';
				} else if(data.result.currentStep == 5) {
					window.location.href = ajaxUrl + '/v3/app/appCheckLogin/rongCarrier/collectuser.do?authChannel=4&orderId=' + seGetItem("orderId") + '&phone=' + seGetItem('phone');
				} else if(data.result.currentStep == 6) {
					window.location.href = ajaxUrl + '/v3/app/appCheckLogin/zmxy/zmmcportal.do?authChannel=4&orderId=' + seGetItem("orderId");
				} else if(data.result.currentStep == 7) {
					window.location.href = '../CreditCertification/index.html';
				}
			}else if(data.code=='-111'){
				
				var currHref = window.location.href;
				if(currHref.indexOf("/Home/") >= 0) {
					window.location.href = './login.html';
				}else{
					window.location.href = '../Home/login.html';
				}
				
				
			}else {
				BtnAlert(data.msg);
			}
		}
	});
}

//替换alert的弹框
function BtnAlert(content) {
	var oBody = document.getElementsByTagName('body')[0];
	var mask = document.createElement("div");
	var maskInner = document.createElement("div");
	var maskContent = document.createElement("div");
	mask.style.position = 'fixed';
	mask.style.width = '100%';
	mask.style.height = '100%';
	mask.style.top = '0';
	mask.style.left = '0';
	mask.style.zIndex = '9999';
	mask.style.overflow = 'hidden';

	maskInner.style.width = '250px';
	maskInner.style.position = 'absolute';
	maskInner.style.top = '50%';
	maskInner.style.left = '50%';
	maskInner.style.marginLeft = '-125px';
	maskInner.style.marginTop = '-30px';
	maskInner.style.background = 'rgba(0,0,0,0.5)';
	maskInner.style.borderRadius = '4px';
	maskInner.style.padding = '22px 15px';

	maskContent.style.textAlign = 'center';
	maskContent.style.fontSize = '15px';
	maskContent.style.color = '#fff';

	maskContent.innerHTML = content;
	oBody.appendChild(mask);
	mask.appendChild(maskInner);
	maskInner.appendChild(maskContent);

	setTimeout(function() {
		oBody.removeChild(mask);
	}, 2000);
}

/**
 * 调用微信SDK，初始化分享
 * 
 * @returns
 */
function initShare() {
	if(isWeixin()) {
		var url = location.href;
		if(url.indexOf("#") != -1) {
			url = url.substring(0, url.indexOf("#"));
		}
		$.post(
			ajaxUrl+"/v3/app/borrower/a6/getJssdkSignature.do", { "url": url },
			function(data) {
				wx.config({
					debug: false, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
					appId: data.result.appId, // 必填，公众号的唯一标识
					timestamp: data.result.timestamp, // 必填，生成签名的时间戳
					nonceStr: data.result.nonceStr, // 必填，生成签名的随机串
					signature: data.result.signature, // 必填，签名
					jsApiList: ["hideMenuItems", "onMenuShareTimeline", "onMenuShareAppMessage", "onMenuShareQQ"] // 必填，需要使用的JS接口列表
				});

				wx.ready(function() {
					// config信息验证后会执行ready方法，所有接口调用都必须在config接口获得结果之后，config是一个客户端的异步操作，所以如果需要在页面加载时就调用相关接口，则须把相关接口放在ready函数中调用来确保正确执行。对于用户触发时才调用的接口，则可以直接调用，不需要放在ready函数中。
					wx.hideMenuItems({
						// 要隐藏的菜单项，只能隐藏“传播类”和“保护类”按钮
						menuList: ["menuItem:share:weiboApp", "menuItem:favorite", "menuItem:share:facebook", "menuItem:share:QZone",
							"menuItem:editTag", "menuItem:delete", "menuItem:copyUrl", "menuItem:originPage", "menuItem:openWithQQBrowser", "menuItem:openWithSafari", "menuItem:share:email", "menuItem:share:brand"
						]
					});

					wx.onMenuShareTimeline({ //朋友圈
						title: '水象分期', // 分享标题
						link: 'http://www.beadwallet.com/app/loanh5/fenqi_download.html', // 分享链接
						imgUrl: 'https://www.beadwallet.com/app/loanh5/images/fenqi_wxfx_logo.png', // 分享图标
						desc: '邀请码：' + inviteCode,
						success: function() {

						}
					});

					wx.onMenuShareAppMessage({ //好友
						title: '水象分期', // 分享标题
						desc: '邀请码：' + inviteCode, // 分享描述
						link: 'http://www.beadwallet.com/app/loanh5/fenqi_download.html', // 分享链接
						imgUrl: 'https://www.beadwallet.com/app/loanh5/images/fenqi_wxfx_logo.png', // 分享图标
						type: '', // 分享类型,music、video或link，不填默认为link
						dataUrl: '', // 如果type是music或video，则要提供数据链接，默认为空
						success: function() {

						}
					});

					wx.onMenuShareQQ({ //朋友圈
						title: '水象分期', // 分享标题
						link: 'http://www.beadwallet.com/app/loanh5/fenqi_download.html', // 分享链接
						imgUrl: 'https://www.beadwallet.com/app/loanh5/images/fenqi_wxfx_logo.png', // 分享图标
						desc: '邀请码：' + inviteCode,
						success: function() {

						}
					});
				});
			},
			"json"
		);
	}
}

// 显示加载遮罩
function showLoading() {
	// 判断页面是否加载完成
	if(document.getElementsByTagName('body')[0] != null) {
		// 判断加载遮罩是否已创建
		if(document.getElementById('myLoading') == null) {
			var body = document.getElementsByTagName('body')[0];
			var loader = document.createElement('div');
			loader.className = 'loader';
			loader.setAttribute('id', 'myLoading');
			var loading = document.createElement('div');
			loading.className = 'loading';
			for(var i = 0; i < 8; i++) {
				var a = document.createElement('i');
				loading.appendChild(a);
			}
			loader.appendChild(loading);
			body.appendChild(loader);

		}
		document.getElementById('myLoading').style.display = 'block';
	}
}

// 隐藏加载遮罩
function hideLoading() {
	// 判断页面是否加载完成
	if(document.getElementById('myLoading') != null) {
		var loading = document.getElementById('myLoading');
		loading.style.display = 'none';
	}
}

//读取cookies 
function getCookie(name) {
	var arr, reg = new RegExp("(^| )" + name + "=([^;]*)(;|$)");
	if(arr = document.cookie.match(reg))
		return unescape(arr[2]);
	else
		return null;
}

/**
 * 设置cookie
 * @example $.cookie('the_cookie', 'the_value');
 * @desc Set the value of a cookie.
 * @example $.cookie('the_cookie', 'the_value', {expires: 7, path: '/', domain: 'jquery.com', secure: true});
 * @desc Create a cookie with all available options.
 * @example $.cookie('the_cookie', 'the_value');
 * @desc Create a session cookie.
 */
function setCookie(name, value, options) {
	options = options || {};
	if(value == null) {
		value = '';
		options.expires = -1;
	}
	var expires = '';
	if(options.expires && (typeof options.expires === 'number' || options.expires.toUTCString)) {
		var date;
		if(typeof options.expires === 'number') {
			date = new Date();
			date.setTime(date.getTime() + (options.expires * 24 * 60 * 60 * 1000));
		} else {
			date = options.expires;
		}
		expires = '; expires=' + date.toUTCString(); // use expires attribute, max-age is not supported by IE
	}
	var path = options.path ? '; path=' + options.path : '';
	var domain = options.domain ? '; domain=' + options.domain : '';
	var secure = options.secure ? '; secure' : '';
	document.cookie = [name, '=', encodeURIComponent(value), expires, path, domain, secure].join('');
}

// 获取用户uuid
function getUUID() {
	return getCookie("cookie_uuid");
}
// 获取用户logintoken
function getLoginToken() {
	return getCookie("cookie_token");
}

// 工单是否结束
function isEnd(id) {
	// 发送ajax
	$.ajax({
		url: "/loanapp-api-web/app/my/appCheckLogin/findBwOrderByBwId.do",
		type: 'post',
		dataType: 'json',
		data: { 'loginToken': getLoginToken(), 'bwId': getUUID() },
		success: function(obj) {
			var status = obj.code;
			if(status == "000") {
				var result = obj.result;
				if(!result || result.statusId == 6 || result.statusId == 8) {
					$("#" + id).removeClass('disable');
					$("#" + id).removeAttr("disabled");
				} else {
					alert("您有一笔借款正在进行中，请不要重复提交信息。");
				}
			}
		}
	});
}

// 是否有正在进行中的工单
function hasInProgressOrder() {
	var res = true;
	$.ajax({
		url: "/loanapp-api-web/app/my/appCheckLogin/findBwOrderByBwId.do",
		type: "post",
		dataType: "json",
		data: { "loginToken": getLoginToken(), "bwId": getUUID() },
		async: false,
		success: function(obj) {
			if(obj.code == "000") {
				var result = obj.result;
				if(!result || result.statusId == 6 || result.statusId == 7 || result.statusId == 8) {
					// 拒绝状态特殊处理
					if(result && result.statusId == 7) {
						$.ajax({
							type: "post",
							url: "/loanapp-api-web/app/reject/record/findBwRejectRecord.do",
							dataType: "json",
							data: {
								"orderId": result.id
							},
							async: false,
							success: function(data) {
								if(data != null) {
									var createTime = data.result.createTime;
									// 判断是否超过拒绝时长
									if(new Date().getTime() > (createTime + 7862400000)) {
										res = false;
									}
								}
							}
						});
					} else {
						res = false;
					}
				}
			}
		}
	});
	return res;
}

//根据id获取name
function getStatusName(statusId) {
	if(statusId == 1) {
		return "草稿";
	} else if(statusId == 2 || statusId == 3) {
		return "审核中";
	} else if(statusId == 4) {
		return "签约";
	} else if(statusId == 5 || statusId == 11 || statusId == 12 || statusId == 14) {
		return "待放款";
	} else if(statusId == 6) {
		return "结束";
	} else if(statusId == 7) {
		return "审核未通过";
	} else if(statusId == 8) {
		return "撤回";
	} else if(statusId == 9) {
		return "还款中";
	} else if(statusId == 10) {
		return "";
	} else if(statusId == 13) {
		return "逾期";
	}
}

// 获取请求参数
function getParameter(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if(r !== null) {
		return decodeURI(r[2]);
	}
	return null;
}
//金额
function toAmount(amount) {
	if(amount == null || amount == '' || amount == 0) {
		return "0.00";
	}
	return amount;
}

// 对Date的扩展，将 Date 转化为指定格式的String   
// 月(M)、日(d)、小时(h)、分(m)、秒(s)、季度(q) 可以用 1-2 个占位符，   
// 年(y)可以用 1-4 个占位符，毫秒(S)只能用 1 个占位符(是 1-3 位的数字)   
// 例子：   
// (new Date()).Format("yyyy-MM-dd hh:mm:ss.S") ==> 2006-07-02 08:09:04.423   
// (new Date()).Format("yyyy-M-d h:m:s.S")      ==> 2006-7-2 8:9:4.18   
Date.prototype.format = function(fmt) { //author: meizz   
	var o = {
		"M+": this.getMonth() + 1, //月份   
		"d+": this.getDate(), //日   
		"h+": this.getHours(), //小时   
		"m+": this.getMinutes(), //分   
		"s+": this.getSeconds(), //秒   
		"q+": Math.floor((this.getMonth() + 3) / 3), //季度   
		"S": this.getMilliseconds() //毫秒   
	};
	if(/(y+)/.test(fmt))
		fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	for(var k in o)
		if(new RegExp("(" + k + ")").test(fmt))
			fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
	return fmt;
}
//时间long转Date
function longToDate(long, formatStr) {
	if(long != null && long != '') {
		return new Date(long).format(formatStr);
	} else {
		return "";
	}
}
//日期追加天数、月数、年数
function dateAdd(interval, number, date) {
	/*
	 *   功能:实现VBScript的DateAdd功能.
	 *   参数:interval,字符串表达式，表示要添加的时间间隔.
	 *   参数:number,数值表达式，表示要添加的时间间隔的个数.
	 *   参数:date,时间对象.
	 *   返回:新的时间对象.
	 *   var   now   =   new   Date();
	 *   var   newDate   =   DateAdd("d",5,now);
	 *---------------   DateAdd(interval,number,date)   -----------------
	 */
	switch(interval) {
		case "y":
			{
				date.setFullYear(date.getFullYear() + number);
				return date;
				break;
			}
		case "q":
			{
				date.setMonth(date.getMonth() + number * 3);
				return date;
				break;
			}
		case "m":
			{
				date.setMonth(date.getMonth() + number);
				return date;
				break;
			}
		case "w":
			{
				date.setDate(date.getDate() + number * 7);
				return date;
				break;
			}
		case "d":
			{
				date.setDate(date.getDate() + (number - 1));
				return date;
				break;
			}
		case "h":
			{
				date.setHours(date.getHours() + number);
				return date;
				break;
			}
		case "m":
			{
				date.setMinutes(date.getMinutes() + number);
				return date;
				break;
			}
		case "s":
			{
				date.setSeconds(date.getSeconds() + number);
				return date;
				break;
			}
		default:
			{
				date.setDate(d.getDate() + number);
				return date;
				break;
			}
	}
}
// 常用验证
// val-要验证的值
// rule-验证规则，如果不支持当前规则，则返回失败。
function validate(val, rule) {
	var reg;
	if(rule == "digits") { // 数字
		reg = /^\d+$/;
	} else if(rule == "letters") { // 字母
		reg = /^[a-z]+$/i;
	} else if(rule == "date") { // 日期，格式:yyyy-mm-dd
		reg = /^\d{4}-\d{2}-\d{2}$/;
	} else if(rule == "time") { // 时间，00:00到23:59之间
		reg = /^([01]\d|2[0-3])(:[0-5]\d){1,2}$/;
	} else if(rule == "email") { // 邮箱
		reg = /^[\w\+\-]+(\.[\w\+\-]+)*@[a-z\d\-]+(\.[a-z\d\-]+)*\.([a-z]{2,4})$/i;
	} else if(rule == "url") { // 网址
		reg = /^(https?|s?ftp):\/\/\S+$/i;
	} else if(rule == "qq") { // QQ号码
		reg = /^[1-9]\d{4,}$/;
	} else if(rule == "IDcard") { // 身份证号码
		reg = /^(\d{15}$|^\d{18}$|^\d{17}(\d|X|x))$/;
		//var Validator = new IDValidator();
		//return Validator.isValid(val);
	} else if(rule == "tel") { // 电话号码
		reg = /^(?:(?:0\d{2,3}[\- ]?[1-9]\d{6,7})|(?:[48]00[\- ]?[1-9]\d{6}))$/;
	} else if(rule == "mobile") { // 手机号
		reg = /^1[34578]\d{9}$/;
	} else if(rule == "zipcode") { // 邮编
		reg = /^\d{6}$/;
	} else if(rule == "chinese") { // 汉字
		reg = /^[\u0391-\uFFE5]+$/;
	} else if(rule == "chineseName") { // 姓名
		reg = /^[\u4E00-\u9FA5]{2,8}(?:·[\u4E00-\u9FA5]{2,8})*$/;
	} else if(rule == "password") { // 密码，6-16位字符，不能包含空格
		reg = /^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$/;
	} else if(rule == "bankcard") { //银行卡号
		reg = /^(\d{16}|\d{19})$/;
	} else {
		return false;
	}
	return reg.test(val);
}
// 判断是否为微信浏览器
function isWeixin() {
	var ua = navigator.userAgent.toLowerCase();
	if(ua.match(/MicroMessenger/i) == "micromessenger") {
		return true;
	} else {
		return false;
	}
}
// 判断是否为QQ浏览器
function isQQ() {
	var ua = navigator.userAgent.toLowerCase();
	if(ua.match(/QQBrowser/i) == "qqbrowser") {
		return true;
	} else {
		return false;
	}
}
// String去除空格
String.prototype.trim = function() {
	return this.replace(/(^\s*)|(\s*$)/g, "");
}

// 是否存在登录
function isLogin() {
	var loginToken = getLoginToken();
	if(loginToken == null || loginToken == "undefined" || loginToken == "") {
		window.location.href = getLoginUrl();
	}

	$.ajax({
		url: "/loanapp-api-web/app/borrower/loginCheck.do",
		type: 'post',
		dataType: 'json',
		async: false,
		data: {
			'loginToken': loginToken
		},
		success: function(obj) {
			var status = obj.code;
			if(status != "000") {
				window.location.href = getLoginUrl();
			}
		}
	});
}

function getLoginUrl() {
	var loginUrl = "../Home/login.html";
	var currHref = window.location.href;
	if(currHref.indexOf("/Home/") >= 0) {
		loginUrl = "login.html";
	}
	return loginUrl;
}

function xjq_active() {
	$(this).addClass("COLOR").siblings().removeClass("COLOR");
	$(this).find("span").css("display", "block");
}

function hideLayer() {
	$(".Layer").hide()
}

function getRootPath() {
	// 获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
	var curWwwPath = window.document.location.href;
	// 获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
	var pathName = window.document.location.pathname;
	var pos = curWwwPath.indexOf(pathName);
	// 获取主机地址，如： http://localhost:8083
	var localhostPaht = curWwwPath.substring(0, pos);
	// 获取带"/"的项目名，如：/uimcardprj
	var projectName = pathName
		.substring(0, pathName.substr(1).indexOf('/') + 1);
	return(localhostPaht + projectName + "/");
}

/**
 * 加法
 */
Number.prototype.add = function(arg) {
	var r1, r2, m;
	try { r1 = this.toString().split(".")[1].length } catch(e) { r1 = 0 }
	try { r2 = arg.toString().split(".")[1].length } catch(e) { r2 = 0 }
	m = Math.pow(10, Math.max(r1, r2))
	return(this * m + arg * m) / m
}
/**
 * 减法
 */
Number.prototype.sub = function(arg) {
	return this.add(-arg);
}

/**
 * 乘法
 */
Number.prototype.mul = function(arg) {
	var m = 0,
		s1 = this.toString(),
		s2 = arg.toString();
	try { m += s1.split(".")[1].length } catch(e) {}
	try { m += s2.split(".")[1].length } catch(e) {}
	return Number(s1.replace(".", "")) * Number(s2.replace(".", "")) / Math.pow(10, m);
}

/**
 * 除法
 */
Number.prototype.div = function(arg) {
	var t1 = 0,
		t2 = 0,
		r1, r2;
	try { t1 = this.toString().split(".")[1].length } catch(e) {}
	try { t2 = arg.toString().split(".")[1].length } catch(e) {}
	with(Math) {
		r1 = Number(this.toString().replace(".", ""))
		r2 = Number(arg.toString().replace(".", ""))
		return(r1 / r2) * pow(10, t2 - t1);
	}
}

//通过状态验证对应html页面
function checkHtmlByStatus(status) {

	if(status == undefined) {
		alert('订单状态异常！');
		return false;
	}
	//alert(status);
	var map = {};
	map[1] = 'willLoad.html';
	map[6] = 'willLoad.html';
	map[2] = 'inReviewed.html';
	map[3] = 'inReviewed.html';
	map[4] = 'successReviewed.html';
	map[5] = 'inGiving.html';
	map[11] = 'inGiving.html';
	map[12] = 'inGiving.html';
	map[14] = 'inGiving.html';
	map[7] = 'failReviewed.html';
	map[8] = 'currentFailReviewed.html';
	map[9] = 'inRepayment.html';
	map[13] = 'overTime.html';
	var url = location.href //当前url
	statusUrl = map[status]; //通过状态获取url

	if(url.indexOf(statusUrl) == -1) {
		var url = '../Home/' + statusUrl;
		//	alert(url);
		window.location.href = url;

	} else {
		return true;
	}
}

//跳转到借款页面
function toPageByUrl(url) {
	window.location.href = url
}

//foot跳转绑定
function bandFootBtn(ifBor, ifRe, ifMine) {
	if(ifMine) {
		$('#foot-mine').on('click', function() {
			toPageByUrl('../Mine/index.html');
		});
	}
	if(ifRe) {
		$('#foot-repay').on('click', function() {
			toPageByUrl('../Repayment/index1.html');
		});
	}
	if(ifBor) {
		$('#foot-borrow').on('click', function() {
			toPageByUrl('index.html');
		});
	}
}

//封装弹框
function Mask(title,obj,foot,fn){
	var oBody = document.getElementsByTagName('body')[0];
	var MaskBox = document.createElement("div");
	MaskBox.className = 'MaskBox';
	oBody.appendChild(MaskBox);
	var midBox = document.createElement("div");
	midBox.className = 'midBox';
	MaskBox.appendChild(midBox);
	var h3 = document.createElement("h3");
	midBox.appendChild(h3);
	h3.innerHTML=title;
	
	var close = document.createElement("div");
	close.className = 'closeBox';
	close.innerHTML = 'x';
	midBox.appendChild(close);
	
	close.onclick=function(){
		MaskBox.style.display='none';
	}
	
	var content = document.createElement("div");
	content.className = 'contentBox';
	midBox.appendChild(content);
	
	for(var key in obj){
		var muiRow = document.createElement("div");
		muiRow.className = 'mui-row';
		muiRow.innerHTML = '<span class="mui-col-sm-5 mui-col-xs-5">'+key+'</span><span class="mui-col-sm-3 mui-col-xs-3"></span><span class="mui-col-sm-4 mui-col-xs-4"><em>'+obj[key]+'</em>元</span>';
		content.appendChild(muiRow);	
	}
	var footBtn = document.createElement("div");
	footBtn.className = 'footBtn';
	footBtn.innerHTML = foot;
	midBox.appendChild(footBtn);
	
	footBtn.onclick=function(){
		MaskBox.style.display='none';
	}
	if(fn){
		fn();
	}
	
}

function Mask1(title,obj,foot,fn){
	var oBody = document.getElementsByTagName('body')[0];
	var MaskBox = document.createElement("div");
	MaskBox.className = 'MaskBox';
	oBody.appendChild(MaskBox);
	var midBox = document.createElement("div");
	midBox.className = 'midBox';
	MaskBox.appendChild(midBox);
	var h3 = document.createElement("h3");
	midBox.appendChild(h3);
	h3.innerHTML=title;
	
	var close = document.createElement("div");
	close.className = 'closeBox';
	close.innerHTML = 'x';
	midBox.appendChild(close);
	
	close.onclick=function(){
		MaskBox.style.display='none';
	}
	
	var content = document.createElement("div");
	content.className = 'contentBox';
	midBox.appendChild(content);
	
	for(var key in obj){
		var muiRow = document.createElement("div");
		muiRow.className = 'mui-row';
		muiRow.innerHTML = '<span class="mui-col-sm-5 mui-col-xs-5">'+key+'</span><span class="mui-col-sm-3 mui-col-xs-3"></span><span class="mui-col-sm-4 mui-col-xs-4"><em>'+obj[key]+'</em></span>';
		content.appendChild(muiRow);	
	}
	var footBtn = document.createElement("div");
	footBtn.className = 'footBtn';
	footBtn.innerHTML = foot;
	midBox.appendChild(footBtn);
	
	footBtn.onclick=function(){
		MaskBox.style.display='none';
	}
	if(fn){
		fn();
	}
	
}




