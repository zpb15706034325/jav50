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
		
		//5.���ж�д�ļ�
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
	
		//6.���л��ͷ����л�����
		
		/*GouZao gouzao=new GouZao();
		gouzao.setAge(25);
		gouzao.setName("������");
		//�������л�
		File fi=new File("D:\\HELLO.txt");
		FileOutputStream out=new FileOutputStream(fi);
		ObjectOutputStream ob=new ObjectOutputStream(out);
		ob.writeObject(gouzao);
		ob.flush(); ob.close(); out.close();
		//�������л�
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
		
		
		
		
		//4.���׷���ļ�
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
		//3.��һ��java��Դ�ļ��е���Ϣ��д�뵽�´�����һ��Ŀ���javaԴ�ļ��С�
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
				
			
		
		
		
		
		
		
		//2. ָ��һ��java��Դ�ļ�������Ϣԭ�����������̨��
		/*
		Scanner sc=new Scanner(System.in);
		File f=new File("D:\\HELLO.TXT");
		FileOutputStream in=new FileOutputStream(f,true);
		System.out.println("����������");
		String str=sc.nextLine();
		in.write(str.getBytes());
		in.close();*/
		
		
		
		
		
		
		
	}
	//1������һ��ͼƬ�ļ�����һ��Ŀ¼��
	/*
	File fi=new File("D:\\001.jpg");
	System.out.println(fi.exists());
	FileInputStream input=null;
	BufferedInputStream buff=null;
	
	
	File fil=new File("D:\\�½�λͼͼ��.bmp");
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




