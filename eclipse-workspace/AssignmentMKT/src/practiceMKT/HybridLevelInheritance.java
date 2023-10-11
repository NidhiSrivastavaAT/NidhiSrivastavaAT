package practiceMKT;

class Dlearn {
		 void intmethod()

		{
			System.out.println("this is class C");

		}

	}
	class Clearn extends D {

		double intmethodnew(double d)

		{
			System.out.println("this is class B");
			return 6.66;
		}

	}

	class Blearn extends C {

		 char intmethodnew(char c)

		{
			System.out.println("this is class A");

			return 'd';
		}

	}

	 class justlearn extends B {

		public static void main(String[] args) {

			justlearn lm=new justlearn();



		}

	}
