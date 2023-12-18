class D
{
	{
		System.out.println("IIB1");
	}

	D()
	{
		
		System.out.println("D()");
	}

	D(int i)
	{
		this();
		System.out.println("D(int)");
	}

	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("-----------");
		D d2 = new D(10);
		System.out.println("-----------");
	}

	{
		System.out.println("IIB2");
	}
}