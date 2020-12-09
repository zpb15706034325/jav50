/*某学员3门课成绩如右表所示，编程实现：
     1、Java课和html课的分数之差
     2、3门课的平均分 
     课程	分数
oracle	89
Java	90
html	60
*/
package com.zhaopengbo.test;

public class SecondExample 
{   
	static char oracle='A';  static double A=89;	
	static char Java='B';    static double B=90;
	static char html='C';    static double C=60;
	public static void main(String[] args)
	{
		double poor=A-C;
		System.out.print("请计算出Java课和html课的分数之差"+"\n"+poor+"\n");
		double average=(A+B+C)/3;
		System.out.print("请计算出3门课的平均分"+"\n"+average);
		
		
	}

}
