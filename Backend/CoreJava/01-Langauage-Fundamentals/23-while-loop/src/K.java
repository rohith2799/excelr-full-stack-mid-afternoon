class K
{
	public static void main(String[] args)
	{
		int i = 0;
		while(i < 5)
		{
			System.out.println("loop1 begin: " + i);
			int j = 0;
			while(j < 5)
			{
				j++;
				System.out.println("loop2 begin: " + i + ", " + j);
				if(j > 1)
				{
					break;
				}
				System.out.println("loop2 end: " + i + ", " + j);
			}
			System.out.println("loop1 end: " + i);
			i++;
		}
	}
}