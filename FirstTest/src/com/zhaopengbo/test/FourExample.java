/*输入赵明的考试成绩，显示所获奖励
成绩==100分，爸爸给他买辆车
成绩>=90分，妈妈给他买MP4
90分>成绩>=60分，妈妈给他买本参考书
成绩<60分，什么都不买*/

package com.zhaopengbo.test;

public class FourExample {
	public static void main(String[] args){
		int score=56;
		if(score==100){
			System.out.println("爸爸给他买辆车");
		}else if(score>=90){
			System.out.println("妈妈给他买MP4");
		}else if(score>=60&&score<90){
			System.out.println("妈妈给他买本参考书");
	}else{
		System.out.println("什么都不买");
		}
	}


}
