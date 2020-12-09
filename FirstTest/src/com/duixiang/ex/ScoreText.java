package com.duixiang.ex;

import java.util.Scanner;

public class ScoreText {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		ScoreCalc sco=new ScoreCalc();
		System.out.println("请输入Java成绩：");
		sco.Java=sc.nextDouble();
		System.out.println("请输入DB成绩：");		
		sco.DB=sc.nextDouble();
		System.out.println("请输入TE成绩：");
		sco.TE=sc.nextDouble();
		sco.score(0);
		sco.scores(0);}
	}


