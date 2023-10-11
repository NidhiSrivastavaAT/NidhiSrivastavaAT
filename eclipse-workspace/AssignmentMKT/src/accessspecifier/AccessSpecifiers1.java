package accessspecifier;

import package2.AccessSpecifier2;

public class AccessSpecifiers1 extends AccessSpecifier2 {
	
	
	public  static void main(String [] args)
	
	{
		
		method3();
		method4();//same class all accesible

		
		AccessSpecifiers1 as1=new AccessSpecifiers1();
		as1.method11();
		as1.method33();
		as1.method1();
		as1.method2();
	}
	
	
	public  void method1 ()
	{System.out.println("method1");}
	private   void method2 ()
	{System.out.println("method2");}
	protected static void method3 ()
	{System.out.println("method3");}
	  static void  method4 ()
	{System.out.println("method4");}
}
