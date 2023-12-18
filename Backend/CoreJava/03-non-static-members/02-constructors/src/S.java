class S 
{
	S()
	{
		System.out.println("S()");
		this(10);
	}

	S(int i)
	{
		System.out.println("S(int)");
	}

	public static void main(String[] args) 
	{
		System.out.println("mian begin");
		S s1 = new S();
		System.out.println("----------------");
		S s2 = new S(10);
		System.out.println("----------------");
		System.out.println("mian end");
	}
}
