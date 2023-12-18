class E 
{
	E()
	{
		System.out.println("E()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		E e1 = new E();
		E e2 = new E();
		System.out.println("main end");
	}
}


// we can a constructor any no of times.
//constructor execution is object-creation wise	