package pack1;
class L
{
	private L()
	{
		System.out.println("L()");
	}

	L(int i)
	{
		System.out.println("L(int)");
	}
}
class M extends L
{
	M()
	{
		this(10);
		System.out.println("M()");
	}

	M(int i)
	{
		super(10);
		System.out.println("M(int)");
	}

	public static void main(String[] args) 
	{
		M obj1 = new M();
	}
} 
