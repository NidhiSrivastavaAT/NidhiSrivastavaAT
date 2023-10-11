              package assignmentMKT;

class SuperCalling3 {
	SuperCalling3() {
		System.out.println("NON PARAM CONSTRUCTOR 3 ");
	}

	SuperCalling3(int a) {
		System.out.println("PARAM CONSTRUCTOR 3");
	}

	void methodover1() {

		System.out.println("Grandparent");
	}
}

class SuperCalling2 extends SuperCalling3

{
	SuperCalling2() {
		
		System.out.println("NON PARAM CONSTRUCTOR 2");
	}

	SuperCalling2(int a) {
		super(0);
		System.out.println("PARAM CONSTRUCTOR 2");
	}

	void methodover1() {

		System.out.println("parent1 ");
	}
}

class SuperCalling extends SuperCalling2 {
	SuperCalling() {

		
		System.out.println("NON PARAM CONSTRUCTOR 1");
	}

	SuperCalling(int x) {

		super(x);
		System.out.println("PARAM CONSTRUCTOR 1");
	}

	void methodover1() {
		System.out.println("childest");
	}

	public static void main(String[] args) {
		SuperCalling mo1 = new SuperCalling();
		SuperCalling mo2 = new SuperCalling('3');
		mo1.methodover1();

	}

}
