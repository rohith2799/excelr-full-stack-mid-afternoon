class D 
{
	static int x;

	D()
	{
		x++;
	}

	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("A: " + d1.x);
		D d2 = new D();
		System.out.println("B: " + d2.x);
		D d3 = new D();
		System.out.println("D: " + d3.x);
		D d4 = new D();
		System.out.println("D: " + d4.x);
		D d5 = new D();
		System.out.println("E: " + d5.x);
		System.out.println("----------------");
		System.out.println("#: " + d1.x);
		System.out.println("#: " + d2.x);
		System.out.println("#: " + d3.x);
		System.out.println("#: " + d4.x);
		System.out.println("#: " + d5.x);
	}
}
