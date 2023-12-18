class S
{
	static 
	{
		System.out.println("SIB-S");
	}
	public static void main(String[] args) 
	{
		System.out.println("S-main");
	}
}
class T
{
	static
	{
		System.out.println("SIB-T");
	}
	public static void main(String[]args)
	{
		System.out.println("T-main-begin");
		S.main(null);
		S.main(args);
		System.out.println("T-main-end");
	}
}