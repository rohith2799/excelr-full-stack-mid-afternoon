class U
{
	static int i;
	static int j = i = 10;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
