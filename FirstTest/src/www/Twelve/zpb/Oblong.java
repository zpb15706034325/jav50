package www.Twelve.zpb;
//������

import java.util.Scanner;

 public class Oblong extends Imaging {
	Scanner sc=new Scanner(System.in);

	@Override
	public void girth() {
		System.out.println("��������εĳ���");
		Imaging.a=sc.nextDouble();
		System.out.println("��������εĿ�");
		Imaging.b=sc.nextDouble();
		double girth=(a+b)*2;
		System.out.println("��������ε��ܳ���"+girth);
		
		
	}

	@Override
	public void area() {
		System.out.println("��������εİ뾶��");
		Imaging.r=sc.nextDouble();
			
		
	}

	@Override
	public void color() {
		System.out.println("��������εĿ�");
	
		
		
	}

	
	
	
	
	

}
