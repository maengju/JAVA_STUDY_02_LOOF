/*
 * 1~15단 4개씩 출력하시오
 * 
 * 
 * */

package multiFor;

public class MultiForExample {

	public static void main(String[] args) {
		int i,j,k;
		
		for(i=1; i<16; i+=4) {
			for(j=1; j<16; j++){
				for(k=i; k<i+4; k++) {
					if(k==16)break;
					else System.out.printf("%d X %d = %d\t",k,j,(k*j));
				}
				System.out.println();
			}
			System.out.println();
		}
		

	}

}
