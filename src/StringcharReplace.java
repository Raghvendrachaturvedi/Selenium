
public class StringcharReplace {

	public static void main(String[] args) {
		String name = "Raghvendra";
		System.out.println(name);
		// want to e should be replaced by x

		String newname = name.substring(0, 5)+'x'+name.substring(6, name.length());
		System.out.println(newname);
		
		//Same program using stringbuilder
		
		StringBuilder myname = new StringBuilder("Raghvendra");
		myname.setCharAt(5, 'x');
		System.out.println(myname);
	}

}
