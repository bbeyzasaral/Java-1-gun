package ödevler;

public class loopDemo {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			System.err.println(i);
		}
		// 2 arttırarak yazdırma
		for(int i=2;i<10;i+=2) {
			System.err.println(i);
		}
		
		System.out.println("for döngüsü bitti");
		
		
		int i =1;
		while (i<10) {
			System.out.println(i);
			i+=2;
			
		}
		System.out.println("while döngüsü bitti");
		
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		} while (j<10);
		System.out.println("do-while döngüsü bitti");
		
	}
		

}
