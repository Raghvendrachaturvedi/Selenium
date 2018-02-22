
public class PrimeNumber {


	public static void main(String[] args) {
		 int n =2; //Number to be checked Prime or Not
		 int m;
		 m= n/2;
		 
		 int flag =0;
		 
		 for(int i=2;i<=m;i++){
			 if (n%i==0){
				 System.out.println("Ooops!! This is Not A Prime Number");
				 flag =1;
				 break;
			 }
			 			}
		 if (flag==0){
				System.out.println("Yes!! This is Prime Number");
		 } 
		 
		 
	}

}
