/*
 [문제] ForTest6.java
약수를 구하기

[실행결과]
숫자 입력 : 12      숫자 입력 : 11
1 2 3 4 6 12      1 11
12는 소수가 아니다.   11는 소수이다.

*/

package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest6 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i;
		int div = 1;
		int count = 0;
		System.out.print("숫자 입력 : ");
		int num = Integer.parseInt(br.readLine());
		
		for(i=num; i>0; i--) {
			div = num/i;
			if(num%i==0) {count++;
			System.out.print(div+ "  " );}					
		}//for
		
		System.out.println();
		if(count<=2) {
			System.out.println(num + "(은)는 소수이다.");
		}else System.out.println(num + "(은)는  소수가 아니다.");
		

	}

}
