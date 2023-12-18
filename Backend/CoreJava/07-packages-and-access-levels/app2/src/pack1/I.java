package pack1;
class H
{
	private H()
	{
		System.out.println("H()");
	}
}
class I extends H
{
	I()
	{
		//super();
		System.out.println("I()");
	}
}