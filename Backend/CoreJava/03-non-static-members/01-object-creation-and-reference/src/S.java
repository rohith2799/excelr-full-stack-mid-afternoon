class S 
{
	int i;

	static void test(S obj)
	{
		obj.i = 20;
	}

	public static void main(String[] args) 
	{
		S s1 = new S();
		s1.i = 10;
		System.out.println("before calling test(S): " + s1.i);
		//call by reference or pass by reference
		//changed in the destination would reflect to the source
		//its like we are sending the key to object itself by supplying the reference.
		//if you are sending a reference there would be a 100% chance to modify the objects data members.
		test(s1);
		System.out.println("after calling test(S): " + s1.i);
	}
}
