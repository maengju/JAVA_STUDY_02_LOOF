/*
 [���� ���]
 ���ϴ� ���� �Է��ϼ���
 7*1 = 7
 7*2 = 14
 .
 .
 .
 .
 .
 7*9 = 63
 */
package for_;

import java.io.IOException;

public class ForTest2 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("���ϴ� ���� �Է����ּ���.");
		
		int dan = (System.in.read()-48);
		
		System.in.read();
		System.in.read();
		
		int i;
		
		for (i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", dan,i,(dan*i));
		}

	}

}
