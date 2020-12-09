/*编写一个程序，该程序可以接收一个整数n ，创建线程，一个线程输出并计算1+…+n，编程序，该程序可以接收一
另一个线程每隔1秒写一个出第*个hello world”，两个工作要同时进行。输出“我是一个线程，正在输入*/

package com.xiancheng.zpb;

import java.util.Scanner;

public class RunnableText implements Runnable{	
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);	
		System.out.println("请输入一个整数:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
			try {				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+sum);
			System.out.println("输出第"+i+"个hello world");
		}
	}
		
	}


