class Z6
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(100, 200);
		System.out.println("main end");
	}
	static void test(int i, int j)
		{
			System.out.println("from test: " + i);
			System.out.println("from test: " + j);
	    }
}
