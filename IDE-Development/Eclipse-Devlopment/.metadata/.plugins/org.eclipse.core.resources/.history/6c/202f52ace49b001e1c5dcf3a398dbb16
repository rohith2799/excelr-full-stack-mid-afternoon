package pack1;
class D
{
	private void test1()
	{
		System.out.println("from D.test1()");
	}

	void test2()
	{
		System.out.println("from D.test2()");
	}
}
class E extends D
{
	public static void main(String[] args) 
	{
		D obj = new D();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}
/*default
same class - Yes
same package sub-class -Yes
same package non-sub-class -Yes
outside package - No
*/