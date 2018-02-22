import java.util.Random;


public class RandomExample {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100));//0-99

		
		System.out.print("A");
		System.out.print("B");
		System.out.println("C");
		System.out.println("D");
	}

}
