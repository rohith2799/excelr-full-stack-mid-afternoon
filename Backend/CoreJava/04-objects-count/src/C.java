class C 
{
	int x;

	C()
	{
		x++;
	}

	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("A: " + c1.x);
		C c2 = new C();
		System.out.println("B: " + c2.x);
		C c3 = new C();
		System.out.println("C: " + c3.x);
		C c4 = new C();
		System.out.println("D: " + c4.x);
		C c5 = new C();
		System.out.println("E: " + c5.x);
	}
}
