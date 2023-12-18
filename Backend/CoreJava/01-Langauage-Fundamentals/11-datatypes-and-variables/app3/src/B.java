class B
{
	public static void main(String[] args) 
	{
		int i;
		int j = 10 + (i = 20);
		System.out.println(i);//20
		System.out.println(j);//30
	}
}
