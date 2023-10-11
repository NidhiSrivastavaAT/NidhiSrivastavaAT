package assignmentMKT;

public class SIBIIB {

	{

		System.out.println("IIB2");
	}
	static {

		System.out.println("SIB2");
	}
	static {
		System.out.println("SIB3");
	}
	{

		System.out.println("IIB1");
	}
	SIBIIB() {

		System.out.println("Constructor");
	}
	static {

		System.out.println("SIB1");
	}
	public static void main(String[] args) {

		System.out.println("MM Starts ");
		SIBIIB s = new SIBIIB();
		System.out.println("MM Ends");

	}

}
