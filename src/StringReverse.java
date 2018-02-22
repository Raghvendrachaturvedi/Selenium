public class StringReverse {

	public static void main(String[] args) {
//Program to Reverse the string without using 3rd string
		String a = "one";
		String b = "two";
		
//		System.out.println(b.length());
		a = a + b;
//		System.out.println(a);
		
//		System.out.println(a.length());
//		System.out.println(b.length());
		b = a.substring(0, (a.length() - b.length()));
		
		a= a.substring(b.length());
//		a = a.substring(3); //begin index is 3 
		

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
