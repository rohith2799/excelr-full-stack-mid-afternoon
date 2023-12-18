class H 
{
	int i;

	H(int k)
	{
		System.out.println("H(int)");
		i = k;
	}

	public static void main(String[] args) 
	{
		H h1 = new H(10);
		System.out.println("----------");
		H h2 = new H(20);
		System.out.println("----------");
		H h3 = new H(30);
		System.out.println("----------");
		System.out.println(h1.i);
		System.out.println(h2.i);
		System.out.println(h3.i);
	}
}
