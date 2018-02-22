
public class Fibbi {

	public static void main(String[] args) {
		int a = 0;
		int b=1;
		int n=5;
		
		System.out.print(a+","+b);
		
		for(int i=1;i<=n;i++){
			int c =a+b;
			System.out.print(","+c);
			a=b;
			b=c;
			
		}

	}

}
