package practiceMKT;//assignment on abstract

public class LearnabstractA extends LearnabstractB{

	public static void main(String[] args) {
		div();
		mul();
		sub();
		LearnabstractA la=new LearnabstractA();
	    la.add();

	}
	static void div()

	{
		System.out.println("C1 div");
	}
	 @Override
	void  add()
	{
		System.out.println("C1 add");
	}

}
   abstract class LearnabstractB extends LearnabstractC

    {
	   static void mul ()
   {
	   System.out.println("C2 mul");
   }
    @Override
	abstract void  add();
    }

abstract  class LearnabstractC

	{

	abstract void  add();

	static void sub()

	{System.out.println("C3 sub");}

	}