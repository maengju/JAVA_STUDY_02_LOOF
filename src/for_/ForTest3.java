/*
 * 65~90������ ����(A ~ Z)�� 100�� �߻��Ͽ� ����Ͻÿ�
 * �� ���ٿ� 10���� �������� �Ͻÿ�
 * �׶��� A����
 * 
 * */

package for_;

public class ForTest3 {

	public static void main(String[] args) {
		int rand ;
		int i;
		int a=0;
		
		for(i=1; i<101; i++) {
			 //(int)(Math.random()* b-a+1) + a; //a~b���� ����
	        rand = (int)(Math.random()* 26) + 65; //65 ~ 90
			System.out.print((char)rand+" ");
			if(i%10==0)System.out.println();	
			if(rand=='A') a++;
			}
		System.out.println("\n�� A�� ���� "+a);		
	}

}
