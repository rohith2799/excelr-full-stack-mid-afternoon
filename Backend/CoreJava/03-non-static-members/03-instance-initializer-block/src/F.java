class F
{
	static
	{
		System.out.println("SIB1");
	}

	{
		System.out.println("IIB1");
	}

	F()
	{
		//IIB
		System.out.println("F()");
	}

	F(int i)
	{
		this();
		System.out.println("F(int)");
	}

	F(int i, int j)
	{
		this(j);
		System.out.println("F(int,int)");
	}

	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println("-----------");
		F f2 = new F(10);
		System.out.println("-----------");
		F f3 = new F(10,20);
		System.out.println("-----------");
	}

	{
		System.out.println("IIB2");
	}

	static
	{
		System.out.println("SIB2");
	}
}
