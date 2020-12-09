package com.Iotext.zpb;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class IoExample {
	public static void main(String[] args) throws IOException {
		
		//5.按行读写文件
		File file1=new File("D:\\HELLO.txt");
		File file2=new File("D:\\hellos.txt");
		try {
			FileReader fr=new FileReader(file1);
			FileWriter fw=new FileWriter(file2);
			BufferedReader br=new BufferedReader(fr);
			BufferedWriter bw=new BufferedWriter(fw);
			String s;
			while((s=br.readLine())!=null)
			{				
				bw.write(s+"\r\n");
		        bw.flush();
			}
			bw.close();br.close();
			fr.close();fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
		//6.序列化和反序列化对象
		
		/*GouZao gouzao=new GouZao();
		gouzao.setAge(25);
		gouzao.setName("赵鹏博");
		//对象序列化
		File fi=new File("D:\\HELLO.txt");
		FileOutputStream out=new FileOutputStream(fi);
		ObjectOutputStream ob=new ObjectOutputStream(out);
		ob.writeObject(gouzao);
		ob.flush(); ob.close(); out.close();
		//对象反序列化
		File fil=new File("D:\\hellos.txt");
		FileInputStream input=new FileInputStream(fi);
		ObjectInputStream object=new ObjectInputStream(input);
		GouZao  st;
		try {
			st = (GouZao)object.readObject();
			System.out.println(st.getAge()+st.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
		object.close();input.close();}*/
		
		
		
		
		//4.如何追加文件
		/*File fi=new File("D:\\hello.txt");
		try {
			String str="xiao";
			FileOutputStream out=new FileOutputStream(fi, true);
			BufferedOutputStream buff=new BufferedOutputStream(out);
			buff.write(str.getBytes());
			buff.flush();
			buff.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		*/
		//3.将一个java的源文件中的信息，写入到新创建的一个目标的java源文件中。
		/*File fi=new File("D:\\HELLO.txt");
		System.out.println(fi.exists());
		FileInputStream input=null;
		BufferedInputStream buff=null;
		File fil=new File("D:\\hellos.txt");
		FileOutputStream out=null;
		BufferedOutputStream buffer=null;
		try {
			input=new FileInputStream(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		buff=new BufferedInputStream(input);
		try {
			out=new FileOutputStream(fil);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		buffer=new BufferedOutputStream(out);
		byte []b=new byte[1024];
		int a;
		try {
			while((a=buff.read(b))!=-1) {
				buffer.write(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				buffer.flush();
				buffer.close(); buff.close();
				input.close();out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
				
			
		
		
		
		
		
		
		//2. 指定一个java的源文件，将信息原样输出到控制台。
		/*
		Scanner sc=new Scanner(System.in);
		File f=new File("D:\\HELLO.TXT");
		FileOutputStream in=new FileOutputStream(f,true);
		System.out.println("请输入内容");
		String str=sc.nextLine();
		in.write(str.getBytes());
		in.close();*/
		
		
		
		
		
		
		
	}
	//1．拷贝一个图片文件到另一个目录下
	/*
	File fi=new File("D:\\001.jpg");
	System.out.println(fi.exists());
	FileInputStream input=null;
	BufferedInputStream buff=null;
	
	
	File fil=new File("D:\\新建位图图像.bmp");
	FileOutputStream out=null;
	BufferedOutputStream buffer=null;
	try {
		input=new FileInputStream(fi);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	try {
		out=new FileOutputStream(fil);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	buff=new BufferedInputStream(input);
	buffer=new BufferedOutputStream(out);
	byte b[]=new byte[1024];
	int n;
	try {
		while((n=buff.read(b))!=-1) {
			buffer.write(b);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		buffer.flush();
		buff.close(); buffer.close();
		input.close();out.close();
	}
	}*/




