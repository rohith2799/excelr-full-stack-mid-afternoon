class L
{
	public static void main(String[] args)
	{
		int i = 0;
		//single & or bitwise &
		if ((i++ == 0) & (i++ ==1))
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}