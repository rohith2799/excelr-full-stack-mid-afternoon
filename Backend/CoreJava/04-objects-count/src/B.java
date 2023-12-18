class B 
{
	static int x = 10;

	public static void main(String[] args) 
	{
		System.out.println("A: " + x);
		System.out.println("B: " + B.x);
		
		B b1 = new B();
		B b2 = new B();

		System.out.println("C: " + b1.x);
		System.out.println("D: " + b2.x);
	}
}
