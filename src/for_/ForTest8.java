/*
[����] ForTest8.java
x�� y���� ���Ͻÿ�
��, x�� ���� 0�� �ԷµǸ� ���α׷��� �����Ͻÿ�

[������]
x�� �Է� : 2   
y�� �Է� : 5   

2�� 5���� xx 

x�� �Է� : 3
y�� �Է� : 4
   
3�� 4���� xx 

x�� �Է� : 0
���α׷��� �����մϴ�.
 */
package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i,x,y;
		
		// ���� ���� ���� while(true), for( ;true;), for( ; ; )
		while(true) {
			System.out.print(" x�� �Է� : ");
			x = Integer.parseInt(br.readLine());
			
			if(x==0)break;
			
			System.out.print(" y�� �Է� : ");
			y = Integer.parseInt(br.readLine());
			
			int mul=1;
			for(i=1; i<=y; i++) {
				mul*=x;		
			}//for
			 
			System.out.printf("%d�� %d���� %d�Դϴ�.",x,y,mul);
			System.out.println();
			System.out.println();
		}//while
		System.out.println("���α׷��� �����մϴ�.");

		
				
	}

}
