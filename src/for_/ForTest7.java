/*
 [����] ForTest7.java


[������]
-1+2-3+4-5+6-7+8-9+10 = xx
*/


package for_;

public class ForTest7 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for(i=1; i<=10; i++) {
			if(i%2!=0) {
				sum-=i;
				System.out.print("-"+i);
			}else {sum+=i;
			System.out.print("+"+i);
			}
		}//for
		System.out.println(" = " + sum);

	}

}
