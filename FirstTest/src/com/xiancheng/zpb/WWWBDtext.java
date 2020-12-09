package com.xiancheng.zpb;

public class WWWBDtext {

	public static void main(String[] args) {
		WWWBD bd=new WWWBD();
		
		Thread th=new  Thread(bd, "窗口一");
		Thread th1=new Thread(bd, "窗口二");
		Thread th2=new Thread(bd, "窗口三");
		th.start();
		th1.start();
		th2.start();
		
		// TODO Auto-generated method stub

	}

}
