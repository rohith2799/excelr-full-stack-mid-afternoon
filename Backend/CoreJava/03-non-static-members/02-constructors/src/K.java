class K 
{
	K()
	{
		System.out.println("K()");
	}
	
	K(int i)
	{
		System.out.println("K(int)");
	}

	K(int i, int j)
	{
	   System.out.println("K(int, int)");
	}

	public static void main(String[] args) 
	{
		K k1 = new K();
		System.out.println("-------------");
		K k2 = new K(10);
		System.out.println("-------------");
		K k3 = new K(10,20);
		System.out.println("-------------");
	}
}
