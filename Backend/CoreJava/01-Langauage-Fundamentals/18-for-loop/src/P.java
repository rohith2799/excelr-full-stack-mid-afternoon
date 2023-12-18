class P
{
	public static void main(String[] args)
	{
		int i, j;
		for(i = 0, j = 10; j > 2; j--, i++)
		{
			System.out.println(i + ":" + j);
		}
		System.out.println(i + ":" + j);
	}
}
// i = 0,1,,2,3,4,5,
// J = 10,9,8,7,6