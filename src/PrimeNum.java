
public class PrimeNum {

	public static void main(String[] args) {
		int PN = 2;
		int d =PN/2;
		int flag = 0;
		for (int i=2;i<d;i++){
			if(PN%i == 0){
				
				System.out.println("Number is not Prime");
				flag = 1;
				break;
				
			}
			
		} if(flag == 0)
			System.out.println("Prime Numer");

	}

}
