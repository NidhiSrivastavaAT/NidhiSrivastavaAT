package assignmentMKT;

import java.util.Scanner;

public class Fourmethodscanner {

	public static void main(String main[])

	{
		add();
		sub();
		mul();
		quo();

	}

	static void add()

	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  value of a");
		int a = sc.nextInt();
		System.out.println("Enter  value of b");
		byte b = sc.nextByte();
		int sum = a + b;
		System.out.println("Sum is " + sum);

	}

	static void sub()

	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  value of a");
		double a = sc.nextDouble();
		System.out.println("Enter  value of b");
		byte b = sc.nextByte();
		double sub = a - b;
		System.out.println("sub is " + sub);

	}

	static void mul()

	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  value of a");
		int a = sc.nextInt();
		System.out.println("Enter  value of b");
		byte b = sc.nextByte();
		int mul = a * b;
		System.out.println("Mul is " + mul);

	}

	static void quo()

	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  value of a");
		double a = sc.nextDouble();
		System.out.println("Enter  value of b");
		byte b = sc.nextByte();
		double quotient = a / b;
		System.out.println("Quotient is " + quotient);

	}

}
