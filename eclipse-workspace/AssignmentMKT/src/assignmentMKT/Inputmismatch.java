package assignmentMKT;

import java.util.Scanner;

public class Inputmismatch {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  value of a as an int");
		int a = sc.nextInt();

		System.out.println("Enter  value of a as an double");
		double b = sc.nextDouble();


		System.out.println("Enter  value of a as an byte");
		byte b1 = sc.nextByte();

		System.out.println("Enter  value of a as an long");
		long b11 = sc.nextLong();


	}

}
