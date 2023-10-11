package practiceMKT;

class One
{
	void method1()
	{
	}

}
class two extends One
{
	void method2()
	{
	}
}
class three extends two 
{
	void method3()

	{
	}
}
public class PracticeInClass extends three{

	public static void main(String[] args) {
		two t1		=new three();
		
		three t2=   new PracticeInClass();
		
		PracticeInClass t3  =      (PracticeInClass) t2;
	}

}
