//����������a, b, c�������������һ����//
package Whilepoor;
import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {		
		Scanner op=new Scanner(System.in);
		System.out.println("�������һ��ֵ:");
		int a=op.nextInt();
		System.out.println("������ڶ���ֵ:");
		int b=op.nextInt();
		System.out.println("�����������ֵ:");
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
	
			
		
	


