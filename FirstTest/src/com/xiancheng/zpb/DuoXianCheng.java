package com.xiancheng.zpb;

public class DuoXianCheng extends Thread {
	@Override
	public void run() {
		
		//��ȡ��ǰ�̵߳�����
	
		for(int i=1;i<=10;i++){
			try {
				//ͨ��sleep�������Խ��м��ʱ��������
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
			
		}
	}
}
