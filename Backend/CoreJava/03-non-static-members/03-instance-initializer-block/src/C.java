class C
{
	{
		System.out.println("IIB1");
	}

	C()
	{
		System.out.println("C()");
	}

	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("-----------");
		C c2 = new C();
		System.out.println("-----------");
	}

	{
		System.out.println("IIB2");
	}
}
