package practiceMKT;// method overriding

class D {
	 void intmethod()

	{
		System.out.println("this is class C");

	}

}
class C extends D {

	double intmethodnew(double d)

	{
		System.out.println("this is class B");
		return 6.66;
	}

}

class B extends C {

	 char intmethodnew(char c)

	{
		System.out.println("this is class A");

		return 'd';
	}

}

public class learningmethoveriddingwithreturntype extends B {

	public static void main(String[] args) {

		learningmethoveriddingwithreturntype li = new learningmethoveriddingwithreturntype();

		char dou = li.intmethodnew('x');
		System.out.println("I return a char  =  "+ dou);
        double dd=9.9;
		double ch =li.intmethodnew(dd);
		D cd=new D();
		cd.intmethod();

	}

}