class U 
{
	int i ;

	static U test()
	{
		U obj = new U();
		obj.i = 10;
		return obj;
	}
	public static void main(String[] args) 
	{
		U u1 = test();
		System.out.println(u1.i);
	}
}
