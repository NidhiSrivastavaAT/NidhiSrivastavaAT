package assignmentMKT;

public class LogicalOperators {

	public static void main(String args[])

	{

		int a = 10;
		int b = 20;

		allexe(a, b);
		nonexe(a, b);
	}

	static void allexe(int a, int b) {
		if (a > 0 && b > 0) {
			System.out.println("BLOCK OF C1");

		}

		if (a > 0 || b > 0) {
			System.out.println("BLOCK OF C1");

		}

		if (!(a < 0 && b > 0)) {
			System.out.println("BLOCK OF C1");

		}

		if (!(a < 0 && b < 0)) {
			System.out.println("BLOCK OF C1");

		}

	}

	static void nonexe(int a, int b) {
		if (a < 0 && b < 0) {
			System.out.println("BLOCK OF C2");

		}

		if (a < 0 || b < 0) {
			System.out.println("BLOCK OF C3");

		}

		if (!(a > 0 && b > 0)) {
			System.out.println("BLOCK OF C4");

		}

		if (!(a > 0 && b > 0)) {
			System.out.println("BLOCK OF C5");

		}

	}
}
