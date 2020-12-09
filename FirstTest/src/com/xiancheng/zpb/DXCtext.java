package com.xiancheng.zpb;

public class DXCtext {

	public static void main(String[] args) {
		//new:创建一个线程
		DuoXianCheng dx=new DuoXianCheng();
		DuoXianCheng dx1=new DuoXianCheng();
		//通过start方法使线程处于就绪状态
		dx.start();
		dx1.start();
		//通过对象直接调run方法运行的是主线程main 直接调用start方法运行的是子线程占用资源小 运行速度快
		//dx.run();
		
		

	}

}
