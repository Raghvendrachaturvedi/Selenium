
public class FibonicciSeries {

	public static void main(String[] args) {
		int a =0;
		int b=1;
		int c;
		System.out.print(a + " " +b);
		
		
		for(int i=1;i<=8;i++){
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}

	}

}
