class C
{
	int i;

	void test1()
	{
		System.out.println("A-test1()");
	}
}
class D
{
	static C obj;

	static void test1(C ref)// ref = c1;
	{
		obj = ref;
	}

	void test2()
	{
		System.out.println("D-test2()");
		System.out.println(obj.i);
		obj.test1();
	}
		
	public static void main(String[] args) 
	{
		C c1 = new C();
		D d1 = new D();
		d1.test1(c1);
		d1.test2();
		System.out.println("done");
	}
}