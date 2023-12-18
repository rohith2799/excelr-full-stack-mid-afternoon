package app2.pack1;
class B
{
	private int i;
	private static int j;

	private void test1()
	{
		System.out.println("from test1()");
	}
	private static void test2()
	{
		System.out.println("from test2()");
	}
}
class C extends B
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		//System.out.println(b1.i);
		//b1.test1();
		//System.out.println(B.j);
		//B.test2();
	}
}
//private members are not inheriting to the sub-class
/* Private - only limited to the class itself
Within the class - YES
same package sub class - NO
*/