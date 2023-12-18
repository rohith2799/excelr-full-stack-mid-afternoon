class J
{
	static int i;
	static
	{
		j = i;
	}
	static int j = 40;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
