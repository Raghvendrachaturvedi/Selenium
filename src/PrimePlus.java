
public class PrimePlus {

	public static void main(String[] args) {
		
		int Number = 2;
		int m=Number/2;
		
		int flag = 0;
	
		
		for(int i=2;i<=m;i++){
			
			if(Number%i==0){
				System.out.println("Your Entered number is not a Prime number");
				flag =1;
				break;
				
			}
			
		}if(flag == 0)
			
			System.out.println("Entered number is Prime Number");
		
		
	}					

}
