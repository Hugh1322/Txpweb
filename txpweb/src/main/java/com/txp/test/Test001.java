package com.txp.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ce shi !!!!");

		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
				5,
				15,
				30,
				TimeUnit.MINUTES,
				new ArrayBlockingQueue<Runnable>(5));

		for(int i=0;i<3;i++) {
			threadPoolExecutor.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("run..." );
				}
			});
		}
		try {
			Thread.sleep(2000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(threadPoolExecutor.getCorePoolSize());
		System.out.println(threadPoolExecutor.getMaximumPoolSize());
		System.out.println(threadPoolExecutor.getActiveCount());
		System.out.println(threadPoolExecutor.getLargestPoolSize());
		System.out.println(threadPoolExecutor.getPoolSize());
		Thread thread2 = new Thread();
		System.out.println(thread2.getName());
	}
	
	public int prepare(int a,int b) {
		if(a>b) {
			return 1;
		}else {
			return 0;
		}
	}

	class T1 {
	}

}

class T2 {
	ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0,0,0,null,null);
}
