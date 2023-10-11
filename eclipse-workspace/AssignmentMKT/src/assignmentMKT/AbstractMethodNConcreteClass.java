package assignmentMKT;

abstract class AbstractClass

{
	abstract void absmethod1();
	abstract void absmethod2();
	void absmethod3() {
		System.out.println("Grandparent");
	}
}
class ConcreteClass extends AbstractClass
{
	void absmethod1()
	{
		System.out.println("Parent1");
	}
	void absmethod2() {
		
		System.out.println("Parent2");
	}
}

public class AbstractMethodNConcreteClass extends ConcreteClass {
	void absmethod1() {
		
		System.out.println("Childest");
	}
	public static void main(String[] args) {
		AbstractMethodNConcreteClass am1 = new AbstractMethodNConcreteClass();
		am1.absmethod1();
		am1.absmethod2();
		am1.absmethod3();
	}
	
	

}
