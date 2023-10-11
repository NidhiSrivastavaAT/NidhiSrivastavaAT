package assignmentMKT;

import java.util.Scanner;

public class SixCOnditionalOp {

	public static void main(String args[])

	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter boolean value of a");
		boolean a = sc.nextBoolean();

		System.out.println("Enter boolean value of b");
		boolean b = sc.nextBoolean();


		System.out.println("Enter boolean value of c");
		boolean c = sc.nextBoolean();

		if (a && b) {

			System.out.println("A and B true");
		}

		else if (a || b)

		{

			System.out.println("A OR B true");

		}
		else if (a && c)

		{

			System.out.println("a and C true");

		}
		else if (a || c)

		{

			System.out.println("A OR C true");

		}
		else if (c || b)

		{

			System.out.println("C OR B true");

		}

		else {
			System.out.println("both false ");
		}

	}

}
