package while_;

public class DoWileTest {

	public static void main(String[] args) {
		
		int a= 0;
		do {
			a++;
			System.out.print(a+" ");
			
		}while(a<10);
		System.out.println("\n");
		//A~Z까지 출력하시오
		//단 1줄에 1개씩 출력
		
		char b = 'A';
		int count=0;
		
		do {
			System.out.print(b + " ");
			b++;
			count++;
			if(count%7==0) {System.out.println();}
			}while(b<='Z');
	}
	

}
