class J 
{
	static int i;
	static void test ()
	{
		System.out.println("from test: " + J.i);
	}
	public static void main(String[] args)
	{
		System.out.println("main: " + J.i);
		J.i = 10;
		J.test();
	}
}