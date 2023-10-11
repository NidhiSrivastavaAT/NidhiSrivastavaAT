package accessspecifier;

 class AccessSpecifier6 {
	public void method111 ()
	{System.out.println("method111");}

	private void method222 ()
	{System.out.println("method222");}
	protected void method333 ()
	{System.out.println("method333");}
	 void method444 ()
	{System.out.println("method444");}
}
 class AccessSpecifier5 {
	public void method111 ()
	{System.out.println("method111");}
	private void method222 ()
	{System.out.println("method222");}
	protected void method333 ()
	{System.out.println("method333");}
	 void method444 ()
	
	{System.out.println("method444");}
	 public static void main(String[] args)
	 
	 {
		 AccessSpecifier5 as100= new AccessSpecifier5();
		 as100.method111();
		 as100.method222();
		 as100.method333();
		 as100.method444();
		 AccessSpecifier6 as200=new AccessSpecifier6();
		 as200.method111();
		 as200.method333();
		 as200.method444();
	 }
}