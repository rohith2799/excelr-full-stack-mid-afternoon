class D
{
	D()
	{
		System.out.println("D() begin");
		for (int i = 1; i <= 10; i++)
		{
			System.out.println("from loop: " + i);
		}
		System.out.println("D() end");
}

	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("done");
	}
}
//inside the costructor body we can keep any no. of statements are any valid statements