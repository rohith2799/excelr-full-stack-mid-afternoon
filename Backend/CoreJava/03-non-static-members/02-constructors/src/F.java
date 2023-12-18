class F 
{
	int i;

	F(int i)
	{
		System.out.println("F()");
		i = 10;
	}

	public static void main(String[] args) 
	{
		F f1 = new F();
		System.out.println(f1.i);
		System.out.println("done");
	}
}
//What is the need od constructors??
//constructors are used to initialize objects.
// we can initialize the attributes.
//non-static members can be used without any reference variable in the non-static context.