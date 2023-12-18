class F 
{
	int i;

	static
	{
		System.out.println(i);
	}
}


//*F.java:7: error: non-static variable i cannot be referenced from a static context
                System.out.println(i);