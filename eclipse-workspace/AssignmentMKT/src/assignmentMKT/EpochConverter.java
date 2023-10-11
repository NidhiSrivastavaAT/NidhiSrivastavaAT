package assignmentMKT;

import java.util.Date;

public class EpochConverter {

	public static void main(String[] args) {
		
		Date d=new Date();
	
		System.out.println(d.getTime());
		
		Date c=new Date(d.getTime());
		
		System.out.println(c);
		
		String abhikidate=c.toString();
		System.out.println(abhikidate);
		System.out.println(abhikidate.substring(0,3));
		System.out.println(abhikidate.substring(4, 7));
		System.out.println(abhikidate.substring(8, 10));
		System.out.println(abhikidate.substring(11, 19));
		System.out.println(abhikidate.substring(24, 28));
		
		
		//Date c=new Date((getTime());
	}

}
