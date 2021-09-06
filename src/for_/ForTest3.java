/*
 * 65~90사이의 난수(A ~ Z)를 100개 발생하여 출력하시오
 * 단 한줄에 10개씩 나오도록 하시오
 * 그때의 A개수
 * 
 * */

package for_;

public class ForTest3 {

	public static void main(String[] args) {
		int rand ;
		int i;
		int a=0;
		
		for(i=1; i<101; i++) {
			 //(int)(Math.random()* b-a+1) + a; //a~b까지 난수
	        rand = (int)(Math.random()* 26) + 65; //65 ~ 90
			System.out.print((char)rand+" ");
			if(i%10==0)System.out.println();	
			if(rand=='A') a++;
			}
		System.out.println("\n총 A의 개수 "+a);		
	}

}
