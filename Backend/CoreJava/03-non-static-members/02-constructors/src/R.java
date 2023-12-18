class R 
{
	R()
	{
		this(10);
		System.out.println("R()");
	}

	R(int i)
	{
		this(10,20);
		System.out.println("R(int)");
	}

	R(int i, int j)
	{
		this(true);
		System.out.println("R(int, int)");
	}

	R(boolean b)
	{
		System.out.println("R(boolean)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		R r1 = new R();
		System.out.println("----------------");
		R r2 = new R(10);
		System.out.println("----------------");
		R r3 = new R(10, 20);
		System.out.println("----------------");
		R r4 = new R(false);
		System.out.println("----------------");
		System.out.println("main end");
	}
}
