package JavaPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date();
		System.out.println(d.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("d/M/yyyy");
		System.out.println(sdf.format(d));
		

	}

}
