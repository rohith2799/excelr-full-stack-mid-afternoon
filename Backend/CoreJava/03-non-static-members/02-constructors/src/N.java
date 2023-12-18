class N
{
	N(int i, int j)
	{
		System.out.println("M(int, int)");
	}

	N(int k, double l)
	{
		System.out.println("N(int, double)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		N n1 = new N(10,20);
		N n2 = new N(10, 20.0);
		System.out.println("main end");
	}
}