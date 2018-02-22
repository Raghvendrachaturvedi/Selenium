import java.util.Random;


public class ArrayFillingWithRandomNumber {

	public static void main(String[] args) {
		int RanArr[] = new int [10];
		
		 Random ran = new Random();
		 
		 for(int i=0;i<RanArr.length;i++){ 
			 
			 RanArr[i] = ran.nextInt(100);
			 
			 System.out.println( RanArr[i]);
			 
		 }
	}

}
