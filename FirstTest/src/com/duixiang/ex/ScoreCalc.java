package com.duixiang.ex;

import java.util.Scanner;

/*
 * 一：编写成绩计算类（ScoreCalc）：属性：3门课成绩（Java、TE、DB），方法：计算平均成绩、显示平均成绩、计算总成绩、显示总成绩；
    编写测试类
 */
//计算机类 命名三门课的属性
public class ScoreCalc {
	double Java;
	double TE;
	double DB;
	//平均成绩的方法 返回平均成绩
	public  void  scores(double average){
		 System.out.println("平均成绩为："+(Java+TE+DB)/3);
	}
	//总成绩的方法  返回总成绩的方法
	public void score(double gpa){
		 System.out.println("总成绩为："+(Java+TE+DB));	
	}
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		ScoreCalc sco=new ScoreCalc();
		System.out.println("请输入Java成绩：");
		sco.Java=sc.nextDouble();
		System.out.println("请输入DB成绩：");		
		sco.DB=sc.nextDouble();
		System.out.println("请输入TE成绩：");
		sco.TE=sc.nextDouble();
		sco.score(0);
		sco.scores(0);
		
		
		
		
	}*/

}
