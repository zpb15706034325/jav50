/*实现人与电脑的简单对话：
    在控制台输入“你好”， 电脑回答：“你好，欢迎光临”并继续；
    输入“中午吃了什么饭”，回答：“米饭”并继续；
    输入“再见”，回答“再见”并退出循环*/


package Whilepoor;
import java.util.Scanner;

public class DoWhileEx {
	public static void main(String[] args) {
		Scanner temp=new Scanner(System.in);
		String see="";	
		do {
			System.out.println("请输入：");
			see=temp.next();
			if(see.equals("你好")){
				System.out.println("你好,欢迎光临");
			}
			if(see.equals("中午吃了什么饭")){
				System.out.println("米饭");
			}
			if(see.equals("再见")){
				System.out.println("再见");		
			}			
		}while(!see.equals("再见"));
		System.out.println("循环终止");
		temp.close();
	    
		
	
		
		
	}
	
	

}
