package com.duixiang.ex;

import java.util.Scanner;

public class ScoreText {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		ScoreCalc sco=new ScoreCalc();
		System.out.println("������Java�ɼ���");
		sco.Java=sc.nextDouble();
		System.out.println("������DB�ɼ���");		
		sco.DB=sc.nextDouble();
		System.out.println("������TE�ɼ���");
		sco.TE=sc.nextDouble();
		sco.score(0);
		sco.scores(0);}
	}


