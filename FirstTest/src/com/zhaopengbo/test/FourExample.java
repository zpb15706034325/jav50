/*���������Ŀ��Գɼ�����ʾ������
�ɼ�==100�֣��ְָ���������
�ɼ�>=90�֣����������MP4
90��>�ɼ�>=60�֣���������򱾲ο���
�ɼ�<60�֣�ʲô������*/

package com.zhaopengbo.test;

public class FourExample {
	public static void main(String[] args){
		int score=56;
		if(score==100){
			System.out.println("�ְָ���������");
		}else if(score>=90){
			System.out.println("���������MP4");
		}else if(score>=60&&score<90){
			System.out.println("��������򱾲ο���");
	}else{
		System.out.println("ʲô������");
		}
	}


}
