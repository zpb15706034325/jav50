package com.colletion.zpb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ColletionText {
	public static void main(String[] args) {	
		Student st= new Student(1, "��ΰ", '��', 32, "������ƽ");
		Student st1=new Student(1, "�����", '��', 34, "��������");
		Student st2=new Student(1, "�Ŵ���", '��', 33, "��������");
		//��������������(����.iterator())
		List<ColletionText> lis=new ArrayList<>();	
	    
		Iterator<Object> it=lis.iterator();
		//����
		while(it.hasNext()){
     	ColletionText ss=(ColletionText) it.next();
		System.out.println();		
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*// TODO Auto-generated method stub
		
		List<Object> lis=new ArrayList<>();	
		lis.add("С��"+"12222"+"������ƽ" ); 
		lis.add("272");
		lis.add(new Date());
		lis.add(22);
	
		System.out.println(lis.size());
		System.out.println(lis.get(1));
		for (Object object : lis) {
		   System.out.println(object);
		}*/
	}
}
