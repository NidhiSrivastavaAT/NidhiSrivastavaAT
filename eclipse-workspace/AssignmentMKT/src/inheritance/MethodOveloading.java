package inheritance;//MethodOveridding

 class Zoom1 {

	void methodofParent() {

		System.out.println("Methodofchild");
	}

}

class Zoom2 extends Zoom1{

	@Override
	void methodofParent()

	{
		System.out.println("Methodofchild");
	}

}

class Zoom3 extends Zoom2

{
	public static void main(String[] args) {



		Zoom3 cc=new Zoom3();
		cc.methodofParent();


	}

}
