class E
{
	public static void main(String[] args)
	{
		int i, j;
		for(i = 0; i < 2; i++)
		{
			System.out.println("loop1 begin: " + i);
			for(j = 0; j < 5; j++)
			{
				System.out.println("loop2 begin: " + j);
				if(j > 2)
				{
					break;
				}
				System.out.println("loop2 end: " + j);
			}
			System.out.println("loop1 end: " + i);
		}
		System.out.println("main end: " + i);
	}
}