package com.duixiang.ex;
public class Student extends School {
	String sh;
	public void sh() {
		sh="java";
		System.out.println("�γ�:"+sh);
	}
	@Override
	public void jianjie(String name,char sex,int age) {	
		super.jianjie(name, sex, age);
		sh="java";
		System.out.println("������"+name+"�Ա�"+sex+"���䣺"+age+"�γ̣�"+sh);
	}
	public void ther(){		
		System.out.println("�����ڿ�");
	}
}
