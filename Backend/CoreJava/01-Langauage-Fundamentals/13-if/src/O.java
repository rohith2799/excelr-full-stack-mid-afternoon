class O
{
	public static void main(String[] args)
	{
		boolean flag = true;
		if((flag = false) == false)
		{
			System.out.println("from if");
		}
		System.out.println("end of main: " + flag);
	}
}