class C
{
	public static void main(String[] args) 
	{
		int i;
		int j = 10 + (i = 2) + i;
		System.out.println(i);//2
		System.out.println(j);//14
	}
}
