class M
{
	static int i = test1();
	static int j = test2();
	
	static 
	{
		System.out.println("SIB: " + "i: " + i + ", " + "j: " + j);
		i += 1;// i = i + 1
		j += i;// j = j + i
		main(null);
		System.out.println("SIB again: " + "i: " + i + ", " + "j: " + j);
		i += 2;
		j += i;
	}

	public static int test1()
	{
		System.out.println("test1: " + "i: " + i + ", " + "j: " + j);
		i += 3;
		j += i;
		main(null);
		System.out.println("test1 again: " + "i: " + i + ", " + "j: " + j);
		i += 4;
		j += i;
		return i + j + 5;
	}

	public static int test2()
	{
		System.out.println("test2: " + "i: " + i + ", " + "j: " + j);
		i += 6;
		j += i;
		main(null);
		System.out.println("test2 again:" + "i:" + i + "," + "j:" + j);
		i += 7;
		j += i;
		return i + j + 8;
	}

	public static void main(String[] args)
	{
		System.out.println("main begin: " + "i: " + i + ", " + "j: " + j);
		i += 9;
		j += i;
		System.out.println("main end: " + "i: " + i + ", " + "j: " + j);
	}
}