/*
 * 1. 学生管理系统中需要对学生进行管理，要求如下：
   a.可以存储学生信息（学号、姓名、性别、年龄、地址） 
   b.可以获取学生的总数
   c.可以逐条打印每个学生的信息
  请选用合适的存储结构，编码实现。
 */
package com.colletion.zpb;

public class Student {
	private int xuehao;
	private String xingming;
	private char xingbie;
	private int age;
	private String dizhi;
	public Student(int xuehao,String xingming,char xingbie,int age,String dizhi){		
	}
	public int getXuehao() {
		return xuehao;
	}	
	public String getXingming() {
		return xingming;
	}	
	public char getXingbie() {
		return xingbie;
	}
	public int getAge() {
		return age;
	}	
	public String getDizhi() {
		return dizhi;
	}
	

}
