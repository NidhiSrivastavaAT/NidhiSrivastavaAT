package practiceMKT;

public class PracticeConstructor {

	public static void main(String[] args) {

		PracticeConstructor cons1 = new PracticeConstructor(5, "          ");
		PracticeConstructor cons2 = new PracticeConstructor("          ", 5);

		cons1.mymethod();
		cons2.mymethod();

	}

	PracticeConstructor(int a, String b)

	{

		System.out.println("main caled me" + b + a);

	}

	PracticeConstructor(String b, int a)

	{

		System.out.println("main caled me" + b + a);

	}

	void mymethod()

	{

		System.out.println("main caled method");
	}

}
