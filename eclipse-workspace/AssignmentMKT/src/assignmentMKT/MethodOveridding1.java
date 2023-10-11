package assignmentMKT;


class MethodOveridding3

{
	void methodover1() {
		
		System.out.println("Grandparent");
	}
}

class MethodOveridding2 extends MethodOveridding3

{
	void methodover1() {
		
		System.out.println("parent");
	}
}

 class MethodOveridding1 extends MethodOveridding2{

	void methodover1() {
		
		System.out.println("childest");
	}

	public static void main(String[] args) {
		
		MethodOveridding1 mo1=new MethodOveridding1();
		mo1.methodover1();

	}

}
