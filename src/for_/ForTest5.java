/*[������]
  ���۰��Է� : 
  �����Է� : 
   ~ ������ �� = 
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
		System.out.print("���۰��Է� : ");
		int start = Integer.parseInt(br.readLine());
		System.out.print("���� �Է� : ");
		int end = Integer.parseInt(br.readLine());
		
		for(i=start; i<=end; i++) {
				sum+=i;
				System.out.print(i + "  ");
				count++; // ������ ���ֱ� ����
				if(count%5==0)System.out.println();
					
		}
		System.out.printf("%d ������ %d �� ���� : %d",start,end,sum );
		

	}

}
