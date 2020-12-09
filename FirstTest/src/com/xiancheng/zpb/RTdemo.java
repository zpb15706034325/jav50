package com.xiancheng.zpb;

import java.util.Scanner;

public class RTdemo {

	public static void main(String[] args) throws InterruptedException {
		
		RunnableText rt=new RunnableText();
		RunnableText rt1 =new RunnableText();
		Thread thr=new Thread(rt,"A");
		Thread thr1=new Thread(rt1,"B");
		thr.start();		
		thr1.start();
	

	}

}
