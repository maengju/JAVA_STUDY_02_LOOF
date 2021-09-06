/*
[문제] ForTest8.java
x의 y승을 구하시오
단, x의 값이 0이 입력되면 프로그램을 종료하시오

[실행결과]
x값 입력 : 2   
y값 입력 : 5   

2의 5승은 xx 

x값 입력 : 3
y값 입력 : 4
   
3의 4승은 xx 

x값 입력 : 0
프로그램을 종료합니다.
 */
package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i,x,y;
		
		// 무한 루프 종류 while(true), for( ;true;), for( ; ; )
		while(true) {
			System.out.print(" x값 입력 : ");
			x = Integer.parseInt(br.readLine());
			
			if(x==0)break;
			
			System.out.print(" y값 입력 : ");
			y = Integer.parseInt(br.readLine());
			
			int mul=1;
			for(i=1; i<=y; i++) {
				mul*=x;		
			}//for
			 
			System.out.printf("%d의 %d승은 %d입니다.",x,y,mul);
			System.out.println();
			System.out.println();
		}//while
		System.out.println("프로그램을 종료합니다.");

		
				
	}

}
