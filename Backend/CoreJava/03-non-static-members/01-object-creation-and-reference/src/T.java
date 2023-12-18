class T
{
	int i;

	static void test(int i)
	{
		i = 20;
	}

	public static void main(String[] args) 
	{
		T t1 = new T();
		t1.i = 10;
		System.out.println("before calling test(int): " + t1.i);
		//call by value / pass by value
		//change in the destination would not be reflecting to the source.
		//we are not sending a reference instead just the value, in this case there is no chance of modification to the object.
		T.test(t1.i);
		System.out.println("after calling test(int): " + t1.i);
	}
}
