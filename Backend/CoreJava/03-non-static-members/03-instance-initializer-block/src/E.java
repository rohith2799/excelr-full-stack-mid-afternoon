class E
{
	static
	{
		System.out.println("SIB1");
	}

	{
		System.out.println("IIB1");
	}

	E()
	{
		//IIB
		System.out.println("E()");
	}

	E(int i)
	{
		this();
		System.out.println("E(int)");
	}

	public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println("-----------");
		E e2 = new E(10);
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
