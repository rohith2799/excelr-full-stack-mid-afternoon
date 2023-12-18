class E 
{
	void test1()//
	{
		System.out.println("from test1");
	}
	static void test2()
	{
		test1();
		System.out.println("from test2");
	}
}


//* without reference variable we cant access non statoc variable.