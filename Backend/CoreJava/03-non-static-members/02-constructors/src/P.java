class P 
{
	P()
	{
		System.out.println("P()");
	}

	P(int i)
	{
		this();
		System.out.println("P(int)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		P p1 = new P();
		System.out.println("----------------");
		P p2 = new P(10);
		System.out.println("----------------");
		System.out.println("main end");
	}
}


// we can use this () statement inside a constructor
// we can use this () statement inside a method
// this is also a key word
//this calling statement used to call the current class constructors, if it is used within a constructor