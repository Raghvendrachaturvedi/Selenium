import java.util.Random;


public class ArrayRandomNumber {

	public static void main(String[] args) {
		
	int a[] = new int [10];
	
	Random r = new Random();
	for(int i=0;i<10;i++){
		a[i] = r.nextInt(100);
		System.out.println(a[i]);
		
	}
	
	}

}
