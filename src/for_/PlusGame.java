/*
[숙제]
덧셈문제 - PlusGame.java
- 2자리의 숫자로 제공한다 (10 ~ 99)
- 문제수는 총 5문제를 제공한다
- 1문제당 20점씩 누적된다

[실행결과]
[문제 1] 12 + 95 = 직접 입력
틀렸다...정답 : 113
[문제 2 ]
[문제 5] 10 + 90 = 직접 입력
딩동뎅...참 잘했어요
당신은 총 x문제를 맞추어서 xx점 입니다
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
			for(i=1; i<=5; i++) {//5문제
				int rand1 = (int)(Math.random()*90)+10;
				int rand2 = (int)(Math.random()*90)+10;
				
				System.out.printf("[문제%d] %d + %d = ",i,rand1,rand2);
				
				a = Integer.parseInt(br.readLine());
				
				if(a == (rand1+rand2)) {count++;
					System.out.println("정답입니다!");}
				else {System.out.println("아쉽게 틀렸네요 다시풀어보세요");
						for(i2=1; i2<2; i2++) {
							System.out.printf("[문제%d] %d + %d = ",i,rand1,rand2);
							
							a = Integer.parseInt(br.readLine());
							
							if(a == (rand1+rand2)) {count++;
							System.out.println("정답입니다!");}
							else System.out.println("아쉽게 틀렸네요 정답은 "+(rand1+rand2)+"입니다.");
							}
				}
			}//for
			System.out.println();
			System.out.printf("당신은 총 %d 문제를 맞추어서 %d점 입니다.",count,(b*count));
			
			System.out.print("1번 더 (Y/N) ? ");
			yn = br.readLine();
			
			if(yn.equals("N") || yn.equals("n")) break;
		}System.out.println("프로그램을 종료합니다");
	}

}
