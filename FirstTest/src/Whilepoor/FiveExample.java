/*һ��1~10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ��.
 * ������1��ʹ��ѭ�������ۼӣ���1��10
      2���ж��ۼ�ֵ�Ƿ����20
      3���������20��������ѭ��������ӡ��ǰֵ
   �������100���������ܱ�9��������֮�ͣ�ÿ����ʾ5����;
   ������1~10֮�������ż����ƽ���� (����ʹ��continue)
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
				
	


