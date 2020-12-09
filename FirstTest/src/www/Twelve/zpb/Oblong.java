package www.Twelve.zpb;
//矩形类

import java.util.Scanner;

 public class Oblong extends Imaging {
	Scanner sc=new Scanner(System.in);

	@Override
	public void girth() {
		System.out.println("请输入矩形的长：");
		Imaging.a=sc.nextDouble();
		System.out.println("请输入矩形的宽：");
		Imaging.b=sc.nextDouble();
		double girth=(a+b)*2;
		System.out.println("请输入矩形的周长："+girth);
		
		
	}

	@Override
	public void area() {
		System.out.println("请输入矩形的半径：");
		Imaging.r=sc.nextDouble();
			
		
	}

	@Override
	public void color() {
		System.out.println("请输入矩形的宽：");
	
		
		
	}

	
	
	
	
	

}
