package assignmentMKT;

public class AssignmentNumDatatype {

	public static void add() {
		byte a = 2;
		byte b = 3;
		int c = a + b;

		System.out.println("Addition is " + c);
	}

	public static void sub() {
		byte a = 2;
		byte b = 3;
		int c = a - b;

		System.out.println("Subtraction is is " + c);
	}

	public static void mul() {
		byte a = 2;
		byte b = 3;
		int c = a * b;

		System.out.println("product is is " + c);
	}

	public static void div() {
		int a = 4;
		int b = 1;
		double c = b / a;

		System.out.println("Quotient  is " + c);
	}

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();

	}
}
