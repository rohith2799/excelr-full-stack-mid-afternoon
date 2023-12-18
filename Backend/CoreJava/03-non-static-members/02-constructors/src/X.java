class X
{
	static 
	{
		System.out.println("SIB1");
	}

	X()
	{
		System.out.println("X()");
	}

	X(int i)
	{
		this();
		System.out.println("X(int)");
	}
		
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		X x1 = new X();
		System.out.println("----------");
		X x2 = new X();
		System.out.println("----------");
		System.out.println("main end");
	}

	static 
	{
		System.out.println("SIB2");
	}
}
