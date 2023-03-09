package Programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDate {

	public static void main(String[] args) throws ParseException {


		String str="12-Nov-2022";
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		
		Date date = sdf.parse(str);
		
		System.out.println(date);

	}

}
