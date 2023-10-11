package inheritance;

public class UsingSuper extends Outer {

	public static void main(String[] args) {

		UsingSuper li = new UsingSuper();
		li.intmethodnew();
		System.out.println("between");
		li.intmethodnew();

		}

	private void intmethodnew() {
		// TODO Auto-generated method stub

	}

	/* void intmethodnew()

	{

		System.out.println("this is class inside");


	}*/

}

class Outer extends Outer2{


/*void intmethodnew()

	{

		System.out.println("this is class outside");
		//super.intmethodnew();

	}*/

}


class Outer2 {

	/*void intmethodnew()

	{

		System.out.println("this is class outside2");


	}*/

}

