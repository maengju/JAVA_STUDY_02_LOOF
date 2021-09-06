/*[실행결과]
  시작값입력 : 
  끝값입력 : 
   ~ 까지의 합 = 
   */
package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i;
		int sum=0;
		int count=0;
		System.out.print("시작값입력 : ");
		int start = Integer.parseInt(br.readLine());
		System.out.print("끝값 입력 : ");
		int end = Integer.parseInt(br.readLine());
		
		for(i=start; i<=end; i++) {
				sum+=i;
				System.out.print(i + "  ");
				count++; // 개수를 세주기 위해
				if(count%5==0)System.out.println();
					
		}
		System.out.printf("%d 까지의 %d 의 합은 : %d",start,end,sum );
		

	}

}
