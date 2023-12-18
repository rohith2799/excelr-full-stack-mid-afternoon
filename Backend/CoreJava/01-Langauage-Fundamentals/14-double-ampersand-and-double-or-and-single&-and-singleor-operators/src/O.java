class O
{
	public static void main(String[] args)
	{
		int i = 0;
		boolean flag = (!(!(!((i++ == 0) && (i++ == 0) & (i++ == 0) & (i++ == 0)) && ((i++ == 4) | (i++ 
			== 6)))));
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}