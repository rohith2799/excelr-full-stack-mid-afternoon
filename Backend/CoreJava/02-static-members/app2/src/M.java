class M
{
	static int i;
	static void test()
	{
		System.out.println("from test: " + i);
	}
}
class N 
{
	public static void main(String[] args) 
	{
		System.out.println("from main: " + M.i);
		M.test();
	}
}
