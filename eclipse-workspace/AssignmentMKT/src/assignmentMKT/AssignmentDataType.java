package assignmentMKT;

public class AssignmentDataType {

	public  AssignmentDataType()

	{
		System.out.println("1");
	}

	private  AssignmentDataType(int a)

	{

		System.out.println(a);
	}

	AssignmentDataType(int a,String r)

	{
		System.out.println("3");
		System.out.println(a);
		System.out.println(r);

	}

	public static void main(String[] args)
	{
		new AssignmentDataType();
		new AssignmentDataType(6);
		new AssignmentDataType(7,"Monsoon");

	}


}
