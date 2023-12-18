class W 
{
	static 
	{
		System.out.println("SIB1");
	}

	W()
	{
		System.out.println("W()");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		W w1 = new W();
		System.out.println("-----------");
		W w2 = new W();
		System.out.println("------------");
		System.out.println("main end");
	}
}
