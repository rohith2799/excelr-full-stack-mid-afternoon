class O 
{
	static int i = 100;
	public static void main(String[] args)
	{
		System.out.println("from O main: " + P.i);
	}
}
class P
{
	static int i = 200;
	public static void main(String[]args)
	{
		System.out.println("from P main: " O.i);
	}
}