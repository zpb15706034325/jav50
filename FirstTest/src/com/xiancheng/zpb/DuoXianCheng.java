package com.xiancheng.zpb;

public class DuoXianCheng extends Thread {
	@Override
	public void run() {
		
		//获取当前线程的名字
	
		for(int i=1;i<=10;i++){
			try {
				//通过sleep方法可以进行间隔时间进行输出
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
			
		}
	}
}
