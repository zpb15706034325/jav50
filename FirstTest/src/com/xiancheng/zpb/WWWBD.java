/*
 * ��дһ������ģ��һ����Ʊ��Ʊϵͳ����3����Ʊ�㣬��1������2000��Ʊ
 */

package com.xiancheng.zpb;

//import java.util.Random;

public class WWWBD implements Runnable {
       private int total=20;
	@Override
	public void run() {
		while(true){
			synchronized (this) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(total>=0){
					System.out.println(Thread.currentThread().getName()+":ʣ��Ʊ��"+total);
					total--;	
				}else{
					System.out.println("Ʊ������");
					//break;
					System.exit(0);
				}
					
			}
		}
		
	}
	
	
}
	/*private static  int data = 0 ;

    public static void main(String[] args) {
        for(int i = 0 ;i<2 ;i++){
            new Thread(new Runnable(){

                @Override
                public void run() {
                    data = new Random().nextInt();
                    System.out.println(Thread.currentThread().getName()+ " put random data:"+data);
                    new A().get() ;
                    new B().get() ;
                }

            }).start() ;
        }

    }

    static class A {
        public int get(){
            System.out.println("A from " + Thread.currentThread().getName()
                    + " get data :" + data);
            return data ;
        }
    }

    static class B{
        public int get(){
            System.out.println("B from " + Thread.currentThread().getName()
                    + " get data :" + data);
            return data ;
        }
    }
}
*/

