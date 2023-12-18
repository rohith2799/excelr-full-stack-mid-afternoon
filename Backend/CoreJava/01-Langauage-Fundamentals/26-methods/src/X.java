class X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(test() + test());
		System.out.println("main end");
	}
	static int test()
		{
			System.out.println("from test");
				return 100;
	    }
}
