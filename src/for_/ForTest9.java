/*
 문제 
 팩토리얼 계산 (system.in.read())
 
 [실행결과]
 x값 입력 : 2
 x!= 1*2
 */
package for_;

import java.io.IOException;

public class ForTest9 {

	public static void main(String[] args) throws IOException{
		
		int mul=1;
		int i;
		
		System.out.print(" x값 입력 : ");
		int fec = (System.in.read()-48);
		System.in.read();
		System.in.read();
		
		System.out.print("x!=");
		for(i=1; i<=fec; i++) {
			mul*=i;
			if(i==fec) {
				System.out.print(" "+i);
			}else System.out.print(" "+i+" *");	
		}
		System.out.print(" = "+mul);
		
	}
		

}

