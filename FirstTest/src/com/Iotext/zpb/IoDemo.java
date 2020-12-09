package com.Iotext.zpb;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoDemo {
    public static void main(String[] args) throws IOException {
    	
    	File fis=new File("D:\\HELLO.TXT");
    	System.out.println(fis.exists());
    	int  temp;    
    	FileInputStream input=null;
    	try {
    		input=new FileInputStream(fis);	
    		byte[] by=new byte[1024];  
    		while((temp=input.read(by))!=-1){
    			String str=new String(by, 0, temp);
    			System.out.println(str);
    		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{  //不管上面程序怎么样 照样会执行这一步
		   input.close();
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
		/*File fis=new File("D:\\HELLO.TXT");
		//判断文件是否需要
		System.out.println(fis.exists());
		//删除文件
		System.out.println(fis.delete());
		//创建新的文件
		if(!(fis.exists())){
		  try {
			System.out.println(fis.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		  
		  
		}else{
			System.out.println(fis.delete());
		}
	}*/
}}

