
public class RevrseSWithoutFunction {

	public static void main(String[] args) {
		String name = "Raghvendra";
		
		System.out.println(name.charAt(0));
		
		for(int i= name.length()-1;i>=0;i--){
			System.out.print(name.charAt(i));
		}
	}

}
