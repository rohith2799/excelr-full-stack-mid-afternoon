class T 
{
	T()
	{
		T(10);
		System.out.println("T()");
	}

	T(int i)
	{
		System.out.println("T(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		T t1 = new T();
		System.out.println("----------------");
		T t2 = new T(10);
		System.out.println("----------------");
		System.out.println("main end");
	}
}


//T.java:5: error: cannot find symbol
                T(10);
                ^
  symbol:   method T(int)
  location: class T
1 error