package Whilepoor;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double score[]=new double[5];
		for(int i=0;i<score.length;i++){
			System.out.println("请输入成绩：");	
			score[i]=sc.nextDouble();
	}
		int res=0;
		boolean falg=false;
		for(int i=0;i<score.length;i++){
			if(score[i]==80){
				falg=true;
				res++;
				continue;
			}
		}
		if(falg){
			System.out.println("包含80分");
		}
		else{
			System.out.println("不包含80分");
		}
		System.out.println("包含80分的人数："+res);
		}
}


