class M 
{
	M(int i, int j)
	{
		System.out.println("M(int, int)");
	}

	M(int k, int l)
	{
		System.out.println("M(int, int)");
	}

	public static void main(String[] args) 
	{
		M m1 = new M(10, 20);
		System.out.println("done");
	}
}
