package com.duixiang.ex;
public class Student extends School {
	String sh;
	public void sh() {
		sh="java";
		System.out.println("课程:"+sh);
	}
	@Override
	public void jianjie(String name,char sex,int age) {	
		super.jianjie(name, sex, age);
		sh="java";
		System.out.println("姓名："+name+"性别："+sex+"年龄："+age+"课程："+sh);
	}
	public void ther(){		
		System.out.println("正在授课");
	}
}
