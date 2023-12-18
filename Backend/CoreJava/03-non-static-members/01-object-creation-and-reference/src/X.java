class X 
{
	int i;

	static void test(X obj1, X obj2)
	{
		int temp = obj1.i;
		obj1.i = obj2.i;
		obj2.i = temp;	
	}
	public static void main(String[] args) 
	{
		X x1 = new X(), x2 = new X();
		x1.i = 10;
		x2.i = 20;
		System.out.println("before calling test(X,X): " + x1.i);
		System.out.println("before calling test(X,X): " + x2.i);
		X.test(x1, x2);
		System.out.println("after calling test(X,X): " + x1.i);
		System.out.println("after calling test(X,X): " + x2.i);
	}
}


//swapping the values