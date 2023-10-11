package assignmentMKT;

import java.util.Scanner;

public class AgeNestedIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age ");
		int age = sc.nextInt();

		if (age >= 18)

		{

			if (age >= 60)

			{

				System.out.println("person is a Senior Citizen ");

			}

			else

			{

				System.out.println("person is Person is an Adult  ");

			}

		}

		else

		{
			System.out.println("person is an Undersga ");
		}

	}

}
