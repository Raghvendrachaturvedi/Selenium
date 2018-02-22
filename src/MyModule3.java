
public class MyModule3 {


	
	public static void main(String[] args) {
		

		car c1 = new car();
		car c2 = new car();
		car c3 = new car();
		
		
		//System.out.println(car.wheel);
		
	car	d = new car("Hyundai",50000);
	
	System.out.println(d.mod);
	System.out.println(d.price);
		
	
		
	}
	

}

class car{
	
	String mod;
	static int wheel = 4;
	int price;
	String name;
	//constructor
	
	public car(String mod,int price){
		
		System.out.println("Value under the counstructor m is "+mod);
		System.out.println("Value under the counstructor p is "+price);
		
		System.out.println("Value under the counstructor mod is "+mod);
		System.out.println("Value under the counstructor price is "+price);
		
		this.mod =mod;
		this.price =price;
		
		
		System.out.println("NEW Value under the counstructor mod is "+mod);
		System.out.println("NEW Value under the counstructor price is "+price);
		
	}
	
	public car(){
		System.out.println("in car constructor");
	}
	
}




