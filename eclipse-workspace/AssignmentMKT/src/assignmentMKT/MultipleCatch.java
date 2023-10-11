package assignmentMKT;

public class MultipleCatch {
	
	
	
	public static void main(String[] args)
	{
	
		String a[] = new String[3];
		a[0] = "Ram";
		
	
		try
	{//a[4]="Nidhi";	
			int p=10/0;
			System.out.println("IIB2");
	}
	
	catch (ArrayIndexOutOfBoundsException  exception)
		
	{
		
		System.out.println("EXCEPTION 1 CAUGHT");
		
	}
		
   catch (ArithmeticException  exception)
		{
			
			System.out.println("EXCEPTION 2 CAUGHT");
			
		}
	
	
		

	
	
	

}
}