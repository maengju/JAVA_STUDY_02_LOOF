package for_;

public class ForTest {

	public static void main(String[] args) {
		int i;
		
		for(i=1; i<=10; i++) {
			System.out.println("안녕하세요." + i);
		}//for
		
		
		System.out.println("탈출 i = " + i);
		
		for(i=10; i>0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(i='A'; i<='Z'; i++) {
			System.out.print((char)i + " ");
		}
	
	}

}

//컴파일이 자동으로 이루어 진다.

