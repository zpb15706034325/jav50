 /* 要开发学校管理系统，其中的对象有教师类和学生类，各自的要求如下：
教师类
属性：姓名、性别、年龄、教授课程
方法：自我介绍、授课
学生类
属性：学号、姓名、性别、年龄
方法：自我介绍、学习*/

package com.duixiang.ex;

public class School {
	String name;
	char sex;
	int age;
	
	public void jianjie(String name, char sex,int age){
		if(age>16&&age<99) {
			System.out.println();
			this.age=16;
			
		
	}
		else {this.age=age;}
		
    	
	}
	}
	
	


