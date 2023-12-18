class B 
{
	B()
	{
		System.out.println("B()");
	}

	{
		System.out.println("IIB");
	}

	B(int i)
	{
		System.out.println("B(int)");
	}

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("-----------");
		B b2 = new B(10);
		System.out.println("-----------");
	}
}
