package assignmentMKT;

import java.util.Scanner;

public class AreaRST {

	public static void main(String[] args) {


		Scanner sc= new Scanner (System.in);

		System.out.println("Enter L ");
	     int l=	sc.nextInt();
	     System.out.println("Enter H ");
		 int h=sc.nextInt();


		System.out.println("Enter Side of a Square ");
		int ss=sc.nextInt();




		System.out.println("Enter height of a Triangle  ");
		int ht=sc.nextInt();

		System.out.println("Enter base of a Triangle  ");
		int bt=sc.nextInt();



		double ar= l*h;
		double as= ss*ss;
		double at= 0.5*ht*bt;

		System.out.println("Area of the Rectangle  is " +  ar);
		System.out.println("Area of the Square is " +  as);
		System.out.println("Area of the Triangle is " +  at);

		// TODO Auto-generated method stub






	}

}
