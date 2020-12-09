//有三个整数a, b, c，输出其中最大的一个数//
package Whilepoor;
import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {		
		Scanner op=new Scanner(System.in);
		System.out.println("请输入第一个值:");
		int a=op.nextInt();
		System.out.println("请输入第二个值:");
		int b=op.nextInt();
		System.out.println("请输入第三个值:");
		int c=op.nextInt();
		if(a>b) {
			if(b>c) {
				System.out.println(a);
			}else {
				System.out.println(c);
				
			}
		}else {
			if(a>c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
			op.close();
		}
	}
		/*if(a>b){
			if(b>c){
				System.out.println(a);				
				}else{
					System.out.println(c);				
			}
		}
		else if(c>b){
			 if(b>a){
				System.out.println(c);
			}else {
				System.out.println(a);				
		}
			 else{
				 System.out.println(b);
			 }
		*/			
	   
	}
	
			
		
	


