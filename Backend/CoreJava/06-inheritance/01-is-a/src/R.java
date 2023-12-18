class O
{
	O()
	{
		System.out.println("O()");
	}

	O(int i)
	{
		this();
		System.out.println("O(int i)");
	}
}
class P extends O
{
	P()
	{
		super(10);
		System.out.println("P()");
	}

	P(int i)
	{
		this();
		System.out.println("P(int)");
	}
}
class Q extends P
{
	Q()
	{
		this(90);
		System.out.println("Q()");
	}

	Q(int i)
	{
		super(i);
		System.out.println("Q(int)");
	}
}
class R extends Q
{
	R()
	{
		this(90);
		System.out.println("R()");
	}

	R(int i)
	{
		super(100);
		System.out.println("R(int)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		O obj1 = new O();
		System.out.println("-------------");
		O obj2 = new O(10);
		System.out.println("-------------");
		P obj3 = new P();
		System.out.println("-------------");
		P obj4 = new P(100);
		System.out.println("-------------");
		Q obj5 = new Q();
		System.out.println("-------------");
		Q obj6 = new Q(1000);
		System.out.println("-------------");
		R obj7 = new R();
		System.out.println("-------------");
		R obj8 = new R(10000);
		System.out.println("-------------");
		System.out.println("main end");
	}
}