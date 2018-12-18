function createMask(headerC,content,foot){
	var oBody = document.getElementsByTagName('body')[0];
	var mask = document.createElement("div");
	mask.style.width = '100%';
	mask.style.height = '100%';
	mask.style.top = 0;
	mask.style.left = 0;
	mask.style.position = 'fixed';
	mask.style.zIndex = '999';
//				mask.style.padding = '30px 15px 0 15px';
	mask.style.background = 'rgba(0,0,0,0.5)';
	console.log(document.getElementsByTagName('body')[0]);
	oBody.appendChild(mask);
	
	
	var maskInner = document.createElement('div');
	maskInner.style.width = '90%';
	maskInner.style.textAlign = 'center';
	maskInner.style.background = '#fff';
	maskInner.style.borderRadius = '5px';
	
	maskInner.style.position = 'absolute';
	maskInner.style.left = '50%';
	maskInner.style.top = '50%';
	maskInner.style.transform = 'translate(-50%,-50%)';
	mask.appendChild(maskInner);
	
	var iconWrap = document.createElement('div');
	iconWrap.onclick = function(){
		document.body.removeChild(mask);
//					mask.style.display = 'none';
	}
	iconWrap.style.position = 'absolute';
	iconWrap.style.right = '10px';
	iconWrap.style.top = '20px';
	var chaIcon = document.createElement('i');
	chaIcon.setAttribute('class','iconfont icon-cha chaIcon');
	chaIcon.style.fontSize = '28px';
	chaIcon.style.color = '#c4c4c4';
	
	iconWrap.appendChild(chaIcon);
	console.log(iconWrap);
	maskInner.appendChild(iconWrap);
	
	var header = document.createElement('p');
	header.style.color = "#000000";
	header.style.textAlign = 'center';
	header.style.fontSize = '16px';
	header.style.paddingTop = '20px';
	header.innerHTML = headerC;
	maskInner.appendChild(header);
	
	var maskTop = document.createElement('div');
	maskTop.style.width = '100%';
	maskTop.style.lineHeight = '20px';
	
	maskTop.innerHTML = content;
	maskTop.style.color = '#000000';
	maskTop.style.boxSizing = 'border-box';
	maskTop.style.padding = '10px 15px 25px 15px';
	maskInner.appendChild(maskTop);
	
	var maskFoot = document.createElement('div');
	maskFoot.style.width = '100%';
	maskFoot.style.height = '47px';
	maskFoot.style.borderTop = '1px solid #cdcdcd';
	maskFoot.style.textAlign = 'center'; 
	maskFoot.style.lineHeight = '47px';
	maskFoot.innerHTML = foot;
	maskFoot.style.color = '#a7a7a7';
	maskFoot.style.fontSize = "15px";
	maskFoot.onclick = function(){
		document.body.removeChild(mask);
//					mask.style.display = 'none';
	}
	maskInner.appendChild(maskFoot);
}


function createMaskB(headerC,content,foot,fn){
	console.log(111111111);
	var oBody = document.getElementsByTagName('body')[0];
	var mask = document.createElement("div");
	mask.style.textAlign = 'center';
	mask.style.width = '100%';
	mask.style.height = '100%';
	mask.style.top = 0;
	mask.style.left = 0;
	mask.style.position = 'fixed';
	mask.style.zIndex = '999';
    //mask.style.padding = '30px 15px 0 15px';
	mask.style.background = 'rgba(0,0,0,0.5)';
	console.log(document.getElementsByTagName('body')[0]);
	oBody.appendChild(mask);
	
	
	var maskInner = document.createElement('div');
	maskInner.style.width = '6.5rem';
	maskInner.style.background = '#fff';
	maskInner.style.borderRadius = '5px';
	
	maskInner.style.position = 'absolute';
	maskInner.style.left = '50%';
	maskInner.style.marginLeft = '-3.25rem';
	maskInner.style.top = '50%';
	maskInner.style.marginTop = '-2.1rem';
	mask.appendChild(maskInner);
	
	var iconWrap = document.createElement('div');
	iconWrap.onclick = function(){
		document.body.removeChild(mask);
    //mask.style.display = 'none';
	}
	iconWrap.style.position = 'absolute';
	iconWrap.style.right = '10px';
	iconWrap.style.top = '20px';
	
	var chaIcon = document.createElement('i');
	chaIcon.setAttribute('class','iconfont icon-cha chaIcon');
	chaIcon.style.fontSize = '28px';
	chaIcon.style.color = '#c4c4c4';
	
	iconWrap.appendChild(chaIcon);
	console.log(iconWrap);
	maskInner.appendChild(iconWrap);
	
	var header = document.createElement('p');
	header.style.textAlign = 'center';
	header.style.fontSize = '16px';
	header.style.color = '#000000';
	header.style.paddingTop = '30px';
	header.innerHTML = headerC;
	maskInner.appendChild(header);
	
	var maskTop = document.createElement('div');
	maskTop.style.width = '100%';
	maskTop.style.lineHeight = '20px';
	
	maskTop.innerHTML = content;
	maskTop.style.color = '#000000';
	maskTop.style.boxSizing = 'border-box';
	maskTop.style.padding = '10px 15px 25px 15px';
	maskInner.appendChild(maskTop);
	
	var maskFoot = document.createElement('div');
	maskFoot.style.background = "#46afff";
	maskFoot.style.borderRadius = '0 0 5px 5px';
	maskFoot.style.fontSize = "16px";
	maskFoot.style.width = '100%';
	maskFoot.style.height = '47px';
//			maskFoot.style.borderTop = '1px solid #cdcdcd';
	maskFoot.style.textAlign = 'center'; 
	maskFoot.style.lineHeight = '47px';
	maskFoot.innerHTML = foot;
	maskFoot.style.color = '#fff';
	maskFoot.setAttribute('id','footBtn');
	maskFoot.onclick = function(){
		document.body.removeChild(mask);
		fn;
//					mask.style.display = 'none';
	}
	maskInner.appendChild(maskFoot);
	console.log(maskInner);
}
		// document.getElementById('icon').onclick = function(){
		// 	createMaskB('借款费用明细','<p>123123213</p>','确定')
		// }
		
		
		
function createMaskC (headerC) {
	console.log(111111111);
	var oBody = document.getElementsByTagName('body')[0];
	var mask = document.createElement("div");
	mask.setAttribute("id","maskC");
	mask.style.width = '100%';
	mask.style.height = '100%';
	mask.style.top = 0;
	mask.style.left = 0;
	mask.style.position = 'fixed';
	mask.style.zIndex = '999';
    //mask.style.padding = '30px 15px 0 15px';
	mask.style.background = 'rgba(0,0,0,0.5)';
	console.log(document.getElementsByTagName('body')[0]);
	oBody.appendChild(mask);
	
	
	var maskInner = document.createElement('div');
	maskInner.style.width = '90%';
	maskInner.style.background = '#fff';
	maskInner.style.borderRadius = '5px';
	
	maskInner.style.position = 'absolute';
	maskInner.style.left = '50%';
	maskInner.style.top = '50%';
	maskInner.style.transform = 'translate(-50%,-50%)';
	mask.appendChild(maskInner);
	
	var iconWrap = document.createElement('div');
	iconWrap.onclick = function(){
		document.body.removeChild(mask);
    //mask.style.display = 'none';
	}
	iconWrap.style.position = 'absolute';
	iconWrap.style.right = '10px';
	iconWrap.style.top = '15px';
	
	var chaIcon = document.createElement('i');
	chaIcon.setAttribute('class','iconfont icon-cha chaIcon');
	chaIcon.style.fontSize = '28px';
	chaIcon.style.color = '#c4c4c4';
	
	iconWrap.appendChild(chaIcon);
	console.log(iconWrap);
	maskInner.appendChild(iconWrap);
	
	var header = document.createElement('p');
	header.style.textAlign = 'center';
	header.style.fontSize = '16px';
	header.style.color = '#000000';
	header.style.paddingTop = '5px';
	header.style.paddingBottom = '35px';
	header.innerHTML = headerC;
	maskInner.appendChild(header);
	
//	var maskTop = document.createElement('div');
//	maskTop.style.width = '100%';
//	maskTop.style.lineHeight = '20px';
//	
//	maskTop.innerHTML = content;
//	maskTop.style.color = '#000000';
//	maskTop.style.boxSizing = 'border-box';
//	maskTop.style.padding = '0 15px 25px 15px';
//	maskInner.appendChild(maskTop);
//	
	console.log(11111111);
}
		
		// createMaskC("54646546465")
		
		
		function createMaskD (headerC,content,footLeft,footRight,fn){
			console.log(111111111);
			var oBody = document.getElementsByTagName('body')[0];
			var mask = document.createElement("div");
			mask.style.width = '100%';
			mask.style.height = '100%';
			mask.style.top = 0;
			mask.style.left = 0;
			mask.style.position = 'fixed';
			mask.style.zIndex = '999';
		    //mask.style.padding = '30px 15px 0 15px';
			mask.style.background = 'rgba(0,0,0,0.5)';
			console.log(document.getElementsByTagName('body')[0]);
			oBody.appendChild(mask);
			
			
			var maskInner = document.createElement('div');
			maskInner.style.width = '90%';
			maskInner.style.background = '#fff';
			maskInner.style.borderRadius = '5px';
			
			maskInner.style.position = 'absolute';
			maskInner.style.left = '50%';
			maskInner.style.top = '50%';
			maskInner.style.transform = 'translate(-50%,-50%)';
			mask.appendChild(maskInner);
			
			var iconWrap = document.createElement('div');
			iconWrap.onclick = function(){
				document.body.removeChild(mask);
		    //mask.style.display = 'none';
			}
			iconWrap.style.position = 'absolute';
			iconWrap.style.right = '10px';
			iconWrap.style.top = '10px';
			
			var chaIcon = document.createElement('i');
			chaIcon.setAttribute('class','iconfont icon-cha chaIcon');
			chaIcon.style.fontSize = '28px';
			chaIcon.style.color = '#c4c4c4';
			
			iconWrap.appendChild(chaIcon);
			console.log(iconWrap);
			maskInner.appendChild(iconWrap);
			
			var header = document.createElement('p');
			header.style.textAlign = 'center';
			header.style.fontSize = '16px';
			header.style.paddingTop = '10px';
			header.innerHTML = headerC;
			maskInner.appendChild(header);
			
			var maskTop = document.createElement('div');
			maskTop.style.width = '100%';
			maskTop.style.lineHeight = '20px';
			
			maskTop.innerHTML = content;
			maskTop.style.textAlign = 'center';
			maskTop.style.color = '#000000';
			maskTop.style.boxSizing = 'border-box';
			maskTop.style.padding = '0 15px 25px 15px';
			maskInner.appendChild(maskTop);
			
			var maskFootL = document.createElement('div');
			maskFootL.style.float = 'left';
//			maskFootL.style.background = "#46afff";
			maskFootL.style.borderRadius = '0 0 5px 5px';
			maskFootL.style.width = '49.5%';
			maskFootL.style.height = '47px';
			maskFootL.style.fontSize = '16px';
//			maskFoot.style.borderTop = '1px solid #cdcdcd';
			maskFootL.style.textAlign = 'center'; 
			maskFootL.style.lineHeight = '47px';
			maskFootL.innerHTML = footLeft;
			maskFootL.style.color = '#46afff';
			maskFootL.style.borderTop = '1px solid #f1f1f1';
			maskFootL.style.borderRight = '1px solid #f1f1f1';
			maskFootL.onclick = function(){
				document.body.removeChild(mask);
		//					mask.style.display = 'none';
			}
			var maskFootR = document.createElement('div');
			maskFootR.style.float = 'right';
//			maskFootR.style.background = "#46afff";
			maskFootR.style.borderRadius = '0 0 5px 5px';
			maskFootR.style.width = '50%';
			maskFootR.style.height = '47px';
			maskFootR.style.fontSize = '16px';
//			maskFoot.style.borderTop = '1px solid #cdcdcd';
			maskFootR.style.textAlign = 'center'; 
			maskFootR.style.lineHeight = '47px';
			maskFootR.innerHTML = footRight;
			maskFootR.style.color = '#000000';
			maskFootR.style.borderTop = '1px solid #f1f1f1';
			maskFootR.onclick = function(){
				document.body.removeChild(mask);
		//					mask.style.display = 'none';
			}
			maskInner.appendChild(maskFootL);
			maskInner.appendChild(maskFootR);
			maskFootL.onclick = function(){
				mask.style.display = 'none';
				fn(this);
			}
			console.log(11111111);
		}


function createMaskF(headerC,content,foot,fn){
	console.log(111111111);
	var oBody = document.getElementsByTagName('body')[0];
	var mask = document.createElement("div");
	mask.style.textAlign = 'center';
	mask.style.width = '100%';
	mask.style.height = '100%';
	mask.style.top = 0;
	mask.style.left = 0;
	mask.style.position = 'fixed';
	mask.style.zIndex = '999';
    //mask.style.padding = '30px 15px 0 15px';
	mask.style.background = 'rgba(0,0,0,0.5)';
	console.log(document.getElementsByTagName('body')[0]);
	oBody.appendChild(mask);
	
	
	var maskInner = document.createElement('div');
	maskInner.style.width = '90%';
	maskInner.style.height = '350px';
	maskInner.style.overflow = 'hidden';
	maskInner.style.background = '#fff';
	maskInner.style.borderRadius = '5px';
	
	maskInner.style.position = 'absolute';
	maskInner.style.left = '50%';
	maskInner.style.top = '50%';
	maskInner.style.transform = 'translate(-50%,-50%)';
	mask.appendChild(maskInner);
	
	var iconWrap = document.createElement('div');
	iconWrap.onclick = function(){
		document.body.removeChild(mask);
    //mask.style.display = 'none';
	}
	iconWrap.style.position = 'absolute';
	iconWrap.style.right = '10px';
	iconWrap.style.top = '20px';
	
	var chaIcon = document.createElement('i');
	chaIcon.setAttribute('class','iconfont icon-cha chaIcon');
	chaIcon.style.fontSize = '25px';
	chaIcon.style.color = '#c4c4c4';
	
	iconWrap.appendChild(chaIcon);
	console.log(iconWrap);
	maskInner.appendChild(iconWrap);
	
	var header = document.createElement('p');
	header.style.textAlign = 'center';
	header.style.fontSize = '16px';
	header.style.color = '#000000';
	header.style.paddingTop = '10px';
	header.innerHTML = headerC;
	maskInner.appendChild(header);
	
	var maskTop = document.createElement('div');
	maskTop.style.width = '100%';
	maskTop.style.lineHeight = '20px';
	maskTop.style.height = '300px';
	maskTop.style.position = 'absolute';
	maskTop.style.top = '50px';
	maskTop.style.left = 0;
	maskTop.style.overflow = 'scroll';
	
	maskTop.innerHTML = content;
	maskTop.style.color = '#000000';
	maskTop.style.boxSizing = 'border-box';
	maskTop.style.padding = '10px 25px 25px 25px';
	maskInner.appendChild(maskTop);
	
	var maskFoot = document.createElement('div');
	maskFoot.style.position = 'absolute';
	maskFoot.style.bottom = 0;
	maskFoot.style.background = "#46afff";
	maskFoot.style.borderRadius = '0 0 5px 5px';
	maskFoot.style.fontSize = "16px";
	maskFoot.style.width = '100%';
	maskFoot.style.height = '47px';
//			maskFoot.style.borderTop = '1px solid #cdcdcd';
	maskFoot.style.textAlign = 'center'; 
	maskFoot.style.lineHeight = '47px';
	maskFoot.innerHTML = foot;
	maskFoot.style.color = '#fff';
	maskFoot.setAttribute('id','footBtn');
	maskFoot.onclick = function(){
		document.body.removeChild(mask);
		fn;
//					mask.style.display = 'none';
	}
	maskInner.appendChild(maskFoot);
}

function createMaskG(headerC,content,foot,fn){
	console.log(111111111);
	var oBody = document.getElementsByTagName('body')[0];
	var mask = document.createElement("div");
	mask.style.textAlign = 'center';
	mask.style.width = '100%';
	mask.style.height = '100%';
	mask.style.top = 0;
	mask.style.left = 0;
	mask.style.position = 'fixed';
	mask.style.zIndex = '999';
    //mask.style.padding = '30px 15px 0 15px';
	mask.style.background = 'rgba(0,0,0,0.5)';
	console.log(document.getElementsByTagName('body')[0]);
	oBody.appendChild(mask);
	
	
	var maskInner = document.createElement('div');
	maskInner.style.width = '90%';
	maskInner.style.height = '50%';
	maskInner.style.overflow = 'scroll';
	maskInner.style.background = '#fff';
	maskInner.style.borderRadius = '5px';
	
	maskInner.style.position = 'absolute';
	maskInner.style.left = '50%';
	maskInner.style.top = '50%';
	maskInner.style.transform = 'translate(-50%,-50%)';
	mask.appendChild(maskInner);
	
	var iconWrap = document.createElement('div');
	iconWrap.onclick = function(){
		document.body.removeChild(mask);
    //mask.style.display = 'none';
	}
	iconWrap.style.position = 'absolute';
	iconWrap.style.right = '10px';
	iconWrap.style.top = '20px';
	
	var chaIcon = document.createElement('i');
	chaIcon.setAttribute('class','iconfont icon-cha chaIcon');
	chaIcon.style.fontSize = '28px';
	chaIcon.style.color = '#c4c4c4';
	
	iconWrap.appendChild(chaIcon);
	console.log(iconWrap);
	maskInner.appendChild(iconWrap);
	
	var header = document.createElement('p');
	header.style.textAlign = 'center';
	header.style.fontSize = '16px';
	header.style.color = '#000000';
	header.style.paddingTop = '30px';
	header.innerHTML = headerC;
	maskInner.appendChild(header);
	
	var maskTop = document.createElement('div');
	maskTop.style.width = '100%';
	maskTop.style.lineHeight = '20px';
	
	maskTop.innerHTML = content;
	maskTop.style.color = '#000000';
	maskTop.style.boxSizing = 'border-box';
	maskTop.style.padding = '10px 15px 25px 15px';
	maskInner.appendChild(maskTop);
	
	var maskFoot = document.createElement('div');
	maskFoot.style.background = "#46afff";
	maskFoot.style.borderRadius = '0 0 5px 5px';
	maskFoot.style.fontSize = "16px";
	maskFoot.style.width = '100%';
	maskFoot.style.height = '47px';
//			maskFoot.style.borderTop = '1px solid #cdcdcd';
	maskFoot.style.textAlign = 'center'; 
	maskFoot.style.lineHeight = '47px';
	maskFoot.innerHTML = foot;
	maskFoot.style.color = '#fff';
	maskFoot.setAttribute('id','footBtn');
	maskFoot.onclick = function(){
		document.body.removeChild(mask);
		fn;
//					mask.style.display = 'none';
	}
	maskInner.appendChild(maskFoot);
	console.log(11111111);
}

function toast(content){
	var oBody = document.getElementsByTagName('body')[0];
	var mask = document.createElement("div");
	mask.style.textAlign = 'center';
	mask.style.width = '200px';
	mask.style.paddingTop = '25px';
	mask.style.color = '#fff';
	mask.style.background = 'rgba(0,0,0,0.5)';
	mask.style.height = '70px';
	mask.style.borderRadius = '7px';
	mask.style.top = '50%';
	mask.style.left = '50%';
	mask.style.transform = 'translate(-50%,-50%)';
	mask.style.position = 'fixed';
	mask.style.zIndex = '999';
	mask.innerHTML = content;
	oBody.appendChild(mask);
	setTimeout(function(){
		oBody.removeChild(mask);
	},2000)
}


function createMaskM(headerC,content,foot,fn){
	console.log(111111111);
	var oBody = document.getElementsByTagName('body')[0];
	var mask = document.createElement("div");
	mask.style.textAlign = 'center';
	mask.style.width = '100%';
	mask.style.height = '100%';
	mask.style.top = 0;
	mask.style.left = 0;
	mask.style.position = 'fixed';
	mask.style.zIndex = '999';
    //mask.style.padding = '30px 15px 0 15px';
	mask.style.background = 'rgba(0,0,0,0.5)';
	console.log(document.getElementsByTagName('body')[0]);
	oBody.appendChild(mask);
	
	
	var maskInner = document.createElement('div');
	maskInner.style.width = '90%';
	maskInner.style.background = '#fff';
	maskInner.style.borderRadius = '5px';
	
	maskInner.style.position = 'absolute';
	maskInner.style.left = '50%';
	maskInner.style.top = '50%';
	maskInner.style.transform = 'translate(-50%,-50%)';
	mask.appendChild(maskInner);
	
	
	var header = document.createElement('p');
	header.style.textAlign = 'center';
	header.style.fontSize = '16px';
	header.style.color = '#000000';
	header.style.paddingTop = '30px';
	header.innerHTML = headerC;
	maskInner.appendChild(header);
	
	var maskTop = document.createElement('div');
	maskTop.style.width = '100%';
	maskTop.style.lineHeight = '20px';
	
	maskTop.innerHTML = content;
	maskTop.style.color = '#aaaaaa';
	maskTop.style.boxSizing = 'border-box';
    maskTop.style.fontSize = '14px';
	maskTop.style.padding = '25px 15px 40px 15px';
	maskInner.appendChild(maskTop);
	
	var maskFoot = document.createElement('div');
	maskFoot.style.background = "#46afff";
	maskFoot.style.borderRadius = '0 0 5px 5px';
	maskFoot.style.fontSize = "16px";
	maskFoot.style.width = '100%';
	maskFoot.style.height = '47px';
//			maskFoot.style.borderTop = '1px solid #cdcdcd';
	maskFoot.style.textAlign = 'center'; 
	maskFoot.style.lineHeight = '47px';
	maskFoot.innerHTML = foot;
	maskFoot.style.color = '#fff';
	maskFoot.setAttribute('id','footBtn');
	maskFoot.onclick = function(){
		document.body.removeChild(mask);
		fn;
//					mask.style.display = 'none';
	}
	maskInner.appendChild(maskFoot);
	console.log(11111111);
}

function createMaskN(headerC,content,foot,fn){
	var oBody = document.getElementsByTagName('body')[0];
	var mask = document.createElement("div");
	mask.style.width = '100%';
	mask.style.height = '100%';
	mask.style.top = 0;
	mask.style.left = 0;
	mask.style.position = 'fixed';
	mask.style.zIndex = '999';
	mask.style.background = 'rgba(0,0,0,0.5)';
	console.log(document.getElementsByTagName('body')[0]);
	oBody.appendChild(mask);
	
	
	var maskInner = document.createElement('div');
	maskInner.className='location_centre'
	maskInner.style.width = '90%';
	maskInner.style.textAlign = 'center';
	maskInner.style.background = '#fff';
	maskInner.style.borderRadius = '5px';
	
	maskInner.style.position = 'absolute';
	maskInner.style.left = '50%';
	maskInner.style.top = '50%';
	maskInner.style.transform = 'translate(-50%,-50%)';
	mask.appendChild(maskInner);
	
	var iconWrap = document.createElement('div');
	iconWrap.onclick = function(){
		document.body.removeChild(mask);
	}
	iconWrap.style.position = 'absolute';
	iconWrap.style.right = '10px';
	iconWrap.style.top = '20px';
	var chaIcon = document.createElement('i');
	chaIcon.setAttribute('class','iconfont icon-cha chaIcon');
	chaIcon.style.fontSize = '28px';
	chaIcon.style.color = '#c4c4c4';
	
	iconWrap.appendChild(chaIcon);
	console.log(iconWrap);
	maskInner.appendChild(iconWrap);
	
	var header = document.createElement('p');
	header.style.color = "#000000";
	header.style.textAlign = 'center';
	header.style.fontSize = '16px';
	header.style.paddingTop = '20px';
	header.innerHTML = headerC;
	maskInner.appendChild(header);
	
	var maskTop = document.createElement('div');
	maskTop.style.width = '100%';
	maskTop.style.lineHeight = '20px';
	
	maskTop.innerHTML = content;
	maskTop.style.color = '#000000';
	maskTop.style.boxSizing = 'border-box';
	maskTop.style.textAlign = 'left';
	maskTop.style.padding = '10px 30px 25px 30px';
	maskInner.appendChild(maskTop);
	
	var maskFoot = document.createElement('div');
	maskFoot.style.width = '100%';
	maskFoot.style.height = '47px';
	maskFoot.style.borderTop = '1px solid #cdcdcd';
	maskFoot.style.textAlign = 'center'; 
	maskFoot.style.lineHeight = '47px';
	maskFoot.innerHTML = foot;
	maskFoot.style.color = '#a7a7a7';
	maskFoot.style.fontSize = "15px";
	maskFoot.onclick = function(){
		document.body.removeChild(mask);
		fn();
	}
	maskInner.appendChild(maskFoot);
}