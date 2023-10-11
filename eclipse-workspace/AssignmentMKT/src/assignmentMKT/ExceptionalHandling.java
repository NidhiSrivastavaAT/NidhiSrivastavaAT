package assignmentMKT;

public class ExceptionalHandling {
	
	
	
	public static void main(String[] args)
	{
	
		String a[] = new String[3];
		a[0] = "Ram";
	
		try
	{
		
			a[4]="Nidhi";
			
			System.out.println("IIB2");
	}
	
	catch (ArrayIndexOutOfBoundsException  ecxption)
	{
		
		System.out.println("EXCEPTION CAUGHT");
		
	}
	
	
		

	
	
	

}
}