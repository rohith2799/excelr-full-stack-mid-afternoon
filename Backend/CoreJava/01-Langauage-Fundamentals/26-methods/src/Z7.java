class Z7
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
			i = 1000;
			j = 2000;
			System.out.println("from test: " + i);
			System.out.println("from test: " + j);
	    }
}
