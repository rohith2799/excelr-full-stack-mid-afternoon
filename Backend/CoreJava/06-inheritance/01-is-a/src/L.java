class J
{
	int i;
	static int j;

	static void method1()
	{
		System.out.println("from method1()");
	}
	void test1()
	{
		System.out.println("from test1()");
	}
}
class K extends J
{
	int k;
	static int l;

	static void method1()
	{
		System.out.println("from method2");
	}
	void test2()
	{
		System.out.println("from test2()");
	}
}
class L extends K
{
	int m;
	static int n;

	static void method3()
	{
		System.out.println("from method3");
	}

	void test3()
	{
		System.out.println("from test3()");
	}

	public static void main(String[] args) 
	{
		L obj = new L();
		System.out.println(obj.i + ", " + L.j + ", " + obj.k + ", " + L.l + ", " + obj.m + ", " + L.n);
		obj.test1();
		L.method1();
		obj.test2();
		L.method2();
		obj.test3();
		L.method3();
	}
}