package practiceMKT;// method overriding with parameter

class LeraninheritanceC {

	 void intmethod(char c)

	{

		System.out.println("this is class C");

	}

}

class LeraninheritanceB extends LeraninheritanceC {

	void intmethod()

	{

		System.out.println("this is class B");

	}

}

class LeraninheritanceA extends LeraninheritanceB {

	void intmethod(double d)

	{

		System.out.println("this is class A");

	}

}

public class Leraninheritance extends LeraninheritanceA {

	public static void main(String[] args) {

		LeraninheritanceA li= new LeraninheritanceA();

		li.intmethod(2);
		li.intmethod('A');
		li.intmethod(9.89);


	}

}