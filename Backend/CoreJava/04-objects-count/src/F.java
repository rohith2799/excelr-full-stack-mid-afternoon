class F 
{
	static int x;

	F()
	{
		x++;
	}

	F(int i)
	{
		x++;
	}
	
	F(int i,int j)
	{
		x++;
	}
	
	{
		x++;
	}

	{
		x++;
	}
	
	public static void main(String[] args) 
	{
		F f1 = new F();
		F f2 = new F(10);
		F f3 = new F(10,20);
		F f4 = new F();
		F f5 = new F(10);
		F f6 = new F(10,20);
		System.out.println(f1.x);
		System.out.println(f2.x);
		System.out.println(f3.x);
		System.out.println(f4.x);
		System.out.println(f5.x);
		System.out.println(f6.x);
	}
}
