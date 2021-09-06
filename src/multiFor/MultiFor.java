package multiFor;

public class MultiFor {

	public static void main(String[] args) {
		int i,j;
		
		for(i=2; i<=4; i+=2) {
			
			for(j=1; j<=3; j++) {
				System.out.printf("i = %d\t j= %d\n",i,j);
			}//for j
			System.out.println();
		}

	}

}
