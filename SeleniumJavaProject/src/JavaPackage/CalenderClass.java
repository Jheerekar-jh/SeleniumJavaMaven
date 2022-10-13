package JavaPackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sd= new SimpleDateFormat("d/M/YYY hh:mm:ss a");
		System.out.println(sd.format(cal.getTime()));

	}

}
