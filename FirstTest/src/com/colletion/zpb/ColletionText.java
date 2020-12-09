package com.colletion.zpb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ColletionText {
	public static void main(String[] args) {	
		Student st= new Student(1, "张伟", '男', 32, "陕西兴平");
		Student st1=new Student(1, "张益达", '男', 34, "陕西咸阳");
		Student st2=new Student(1, "张大炮", '男', 33, "陕西西安");
		//创建迭代器对象(对象.iterator())
		List<ColletionText> lis=new ArrayList<>();	
	    
		Iterator<Object> it=lis.iterator();
		//遍历
		while(it.hasNext()){
     	ColletionText ss=(ColletionText) it.next();
		System.out.println();		
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*// TODO Auto-generated method stub
		
		List<Object> lis=new ArrayList<>();	
		lis.add("小明"+"12222"+"陕西兴平" ); 
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
