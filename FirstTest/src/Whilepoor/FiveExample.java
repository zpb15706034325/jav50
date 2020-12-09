/*一：1~10之间的整数相加，得到累加值大于20的当前数.
 * 分析：1、使用循环进行累加，从1到10
      2、判断累加值是否大于20
      3、如果大于20，则跳出循环，并打印当前值
   二：求出100以内所有能被9整除的数之和，每行显示5个数;
   三：求1~10之间的所有偶数的平方和 (可以使用continue)
 * 
 */
package Whilepoor;

public class FiveExample {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++){
			if(i%2==0){
				sum+=i*i;
				continue;	
				
			}
		}
		System.out.println(sum);
		
	}}
		/*int sum=0;
		int o=0;
		for(int i=1;i<=100;i++){			
			if(i%9==0){
				sum+=i;
				System.out.print(i+"\t");
				o++;
				if(o%5==0){
					System.out.print("\n");			
									
				}		
			}		
			}
		System.out.println(sum);
		}
	}	*/
		
	
		
		
	
	
		/*int sum=0;
		for(int i=1;i<=10;i++){
			sum+=i;	
			if(sum>20){	
				System.out.println(i);	
				break;				
			}	
			}
				
		}*/
				
	


