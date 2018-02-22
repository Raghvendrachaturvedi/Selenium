
public class Prime_1 {

	public static void main(String[] args) {
		int n=2; //number which is checked prime?
		int m=n/2;
		int flag =0;
		for (int i =2;i<m;i++){
			if (n%i==0){
				System.out.println("Number is not Prime");
				flag=1;
				break;
				
			}
		}if (flag == 0)
			
			System.out.println("Number is Prime number");

	}

}
