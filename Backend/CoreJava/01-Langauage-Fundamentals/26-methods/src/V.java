class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(test());
		System.out.println("main end");
	}
	static int test()
		{
			System.out.println("from test begin");
			if (true)
			{
				return 100; 
			}
			System.out.println("from test end");
			return 200;
	    }
}


