/*
���� ���߱� ����

1 ~ 100 ������ ���ڸ� ���߸� ���� �˴ϴ�

[������]
���ڸ� �߻��߽��ϴ�...(75)
���� �Է� : 50
50���� Ů�ϴ�

���� �Է� : 80
80���� �۽��ϴ�.

...

���� �Է� : 75
������...xx������ ���߼̽��ϴ�.

�ٽ��Ͻðٽ��ϱ�?
 */

package while_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileTest2 {

	  public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int com, user, count=0;
	      int yn;
	      
	     while(true) {
		      com = (int)(Math.random()*100)+1;
		      System.out.println("���ڸ� �߻��߽��ϴ�");
		      
		      while(true) {count++;
		    	  System.out.print("���� �Է� : ");
			      user = Integer.parseInt(br.readLine());
			      if(com==user) {
			    	  System.out.print("�����Դϴ�!");break;
			      }else if(com>user) {
			    	  System.out.println(user+"���� Ů�ϴ�");
			      }else if(com<user) {
			    	  System.out.println(user+"���� �۽��ϴ�!");
			      }
		      }
		      System.out.printf(" %d������ ���߼̽��ϴ� ",count);
		      while(true) {
		            System.out.print("1�� �� (Y/N) ? ");
		            yn = br.read();
		            br.read();
		            br.read();
		            
		            if(yn=='Y' || yn=='y' || yn=='N' || yn=='n') break;
		         }//while
		         
		         if(yn=='N' || yn=='n') break;
		      }//while
		      System.out.println("���α׷��� �����մϴ�");
		   }

		}
/*
 Enter(����)
 1. Ŀ���� ������ ������ \r(13)
 2. �ٹٱ�			\n(10) 
 */
