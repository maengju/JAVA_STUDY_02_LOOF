/*
[����]
�������� - PlusGame.java
- 2�ڸ��� ���ڷ� �����Ѵ� (10 ~ 99)
- �������� �� 5������ �����Ѵ�
- 1������ 20���� �����ȴ�

[������]
[���� 1] 12 + 95 = ���� �Է�
Ʋ�ȴ�...���� : 113
[���� 2 ]
[���� 5] 10 + 90 = ���� �Է�
������...�� ���߾��
����� �� x������ ���߾ xx�� �Դϴ�
*/


package for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusGame {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i,a,i2;
		int b = 20;
		int count = 0;
		String yn;

		while(true) {
			count=0;
			for(i=1; i<=5; i++) {//5����
				int rand1 = (int)(Math.random()*90)+10;
				int rand2 = (int)(Math.random()*90)+10;
				
				System.out.printf("[����%d] %d + %d = ",i,rand1,rand2);
				
				a = Integer.parseInt(br.readLine());
				
				if(a == (rand1+rand2)) {count++;
					System.out.println("�����Դϴ�!");}
				else {System.out.println("�ƽ��� Ʋ�ȳ׿� �ٽ�Ǯ�����");
						for(i2=1; i2<2; i2++) {
							System.out.printf("[����%d] %d + %d = ",i,rand1,rand2);
							
							a = Integer.parseInt(br.readLine());
							
							if(a == (rand1+rand2)) {count++;
							System.out.println("�����Դϴ�!");}
							else System.out.println("�ƽ��� Ʋ�ȳ׿� ������ "+(rand1+rand2)+"�Դϴ�.");
							}
				}
			}//for
			System.out.println();
			System.out.printf("����� �� %d ������ ���߾ %d�� �Դϴ�.",count,(b*count));
			
			System.out.print("1�� �� (Y/N) ? ");
			yn = br.readLine();
			
			if(yn.equals("N") || yn.equals("n")) break;
		}System.out.println("���α׷��� �����մϴ�");
	}

}
