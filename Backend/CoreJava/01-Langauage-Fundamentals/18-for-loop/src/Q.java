class Q
{
	public static void main(String[] args)
	{
		int i, j;
		for(i = 0, j = 20;
		(i < 15 || j > 15);
			i++, j--)
		{
			System.out.println(i + "," + j);
		}
		System.out.println(i + "," + j);
	}
}
/*
i = 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
j = 20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5

0:20
1:19
----
14:6
15:5

*/