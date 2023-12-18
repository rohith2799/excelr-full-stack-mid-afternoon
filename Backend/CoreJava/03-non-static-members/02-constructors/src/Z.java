class Z 
{
	static 
	{
		System.out.println("SIB1 begin");
		Z z1 = new Z();
		System.out.println("SIB1 end");
	}

	Z()
	{
		this(10);
		System.out.println("Z()");
	}

	Z(int i)
	{
		System.out.println("Z(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Z z1 = new Z();
		System.out.println("----------");
		Z z2 = new Z(20);
		System.out.println("----------");
		System.out.println("main end");
	}

	static 
	{
		System.out.println("SIB2 begin");
		Z z1 = new Z(10);
		System.out.println("SIB2 end");
	}
}