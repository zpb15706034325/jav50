/*��дһ�����򣬸ó�����Խ���һ������n �������̣߳�һ���߳����������1+��+n������򣬸ó�����Խ���һ
��һ���߳�ÿ��1��дһ������*��hello world������������Ҫͬʱ���С����������һ���̣߳���������*/

package com.xiancheng.zpb;

import java.util.Scanner;

public class RunnableText implements Runnable{	
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);	
		System.out.println("������һ������:");
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
			System.out.println("�����"+i+"��hello world");
		}
	}
		
	}


