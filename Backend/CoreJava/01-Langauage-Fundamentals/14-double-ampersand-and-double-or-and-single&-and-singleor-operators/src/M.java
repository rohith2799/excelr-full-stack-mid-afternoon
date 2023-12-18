class M
{
	public static void main(String[] args)
	{
		int i = 0;
		//bitwise OR
		if ((i++ == 0) | (i++ == 0))
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}