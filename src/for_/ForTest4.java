/*
1~10까지의 합을 구하시오


*/



package for_;

public class ForTest4 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		int mul = 1;
		System.out.println("i \t sum \t mul");
		for(i=1; i<=10; i++) {
			sum+=i;
			mul*=i;
			System.out.printf("%d \t %d \t %d\n",i,sum,mul);
		}//for

	}

}
