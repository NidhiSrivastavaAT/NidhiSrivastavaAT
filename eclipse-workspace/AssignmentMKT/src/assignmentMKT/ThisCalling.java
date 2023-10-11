package assignmentMKT;

public class ThisCalling {

	ThisCalling(int a, String b) {
		this();
		System.out.println("CONSTRUCTOR 1");
	}

	ThisCalling(boolean a) {
		this(0, "Nidhi");
		System.out.println("CONSTRUCTOR 2");

	}

	ThisCalling() {

		System.out.println("CONSTRUCTOR 3");

	}

	public static void main(String[] args) {

		ThisCalling tc = new ThisCalling(true);

	}

}
