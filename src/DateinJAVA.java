import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class DateinJAVA {

	public static void main(String[] args) throws ParseException {
			
		String date = "10/02/2018";
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date d = df.parse(date);
		
		df = new SimpleDateFormat("MMM");
		String month = df.format(d);
		
		System.out.println(month);
		
		df = new SimpleDateFormat("YYYY");
		String year = df.format(d);
		System.out.println(year);
		
		df = new SimpleDateFormat("dd");
		
		String day = df.format(d);
		
		System.out.println(day);

	}

}
