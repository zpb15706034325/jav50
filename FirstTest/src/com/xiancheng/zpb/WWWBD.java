/*
 * 编写一个程序，模拟一个机票售票系统：有3个售票点，在1天卖出2000张票
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
					System.out.println(Thread.currentThread().getName()+":剩余票数"+total);
					total--;	
				}else{
					System.out.println("票已售完");
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

