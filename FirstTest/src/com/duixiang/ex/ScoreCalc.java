package com.duixiang.ex;

import java.util.Scanner;

/*
 * һ����д�ɼ������ࣨScoreCalc�������ԣ�3�ſγɼ���Java��TE��DB��������������ƽ���ɼ�����ʾƽ���ɼ��������ܳɼ�����ʾ�ܳɼ���
    ��д������
 */
//������� �������ſε�����
public class ScoreCalc {
	double Java;
	double TE;
	double DB;
	//ƽ���ɼ��ķ��� ����ƽ���ɼ�
	public  void  scores(double average){
		 System.out.println("ƽ���ɼ�Ϊ��"+(Java+TE+DB)/3);
	}
	//�ܳɼ��ķ���  �����ܳɼ��ķ���
	public void score(double gpa){
		 System.out.println("�ܳɼ�Ϊ��"+(Java+TE+DB));	
	}
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		ScoreCalc sco=new ScoreCalc();
		System.out.println("������Java�ɼ���");
		sco.Java=sc.nextDouble();
		System.out.println("������DB�ɼ���");		
		sco.DB=sc.nextDouble();
		System.out.println("������TE�ɼ���");
		sco.TE=sc.nextDouble();
		sco.score(0);
		sco.scores(0);
		
		
		
		
	}*/

}
