package com.xiancheng.zpb;

public class WWWBDtext {

	public static void main(String[] args) {
		WWWBD bd=new WWWBD();
		
		Thread th=new  Thread(bd, "����һ");
		Thread th1=new Thread(bd, "���ڶ�");
		Thread th2=new Thread(bd, "������");
		th.start();
		th1.start();
		th2.start();
		
		// TODO Auto-generated method stub

	}

}
