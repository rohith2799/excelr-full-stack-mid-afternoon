class E 
{
	static int x;

	E()
	{
		x++;
	}

	E(int i)
	{
		x++;
	}
	
	E(int i,int j)
	{
		x++;
	}

	public static void main(String[] args) 
	{
		E e1 = new E();
		E e2 = new E(10);
		E e3 = new E(10,20);
		E e4 = new E();
		E e5 = new E(10);
		E e6 = new E(10,20);
		System.out.println(e1.x);
		System.out.println(e2.x);
		System.out.println(e3.x);
		System.out.println(e4.x);
		System.out.println(e5.x);
		System.out.println(e6.x);
	}
}
