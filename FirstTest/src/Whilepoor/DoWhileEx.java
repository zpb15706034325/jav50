/*ʵ��������Եļ򵥶Ի���
    �ڿ���̨���롰��á��� ���Իش𣺡���ã���ӭ���١���������
    ���롰�������ʲô�������ش𣺡��׷�����������
    ���롰�ټ������ش��ټ������˳�ѭ��*/


package Whilepoor;
import java.util.Scanner;

public class DoWhileEx {
	public static void main(String[] args) {
		Scanner temp=new Scanner(System.in);
		String see="";	
		do {
			System.out.println("�����룺");
			see=temp.next();
			if(see.equals("���")){
				System.out.println("���,��ӭ����");
			}
			if(see.equals("�������ʲô��")){
				System.out.println("�׷�");
			}
			if(see.equals("�ټ�")){
				System.out.println("�ټ�");		
			}			
		}while(!see.equals("�ټ�"));
		System.out.println("ѭ����ֹ");
		temp.close();
	    
		
	
		
		
	}
	
	

}
