class N
{
	static int i = test1();
	static int j = test2();
	static int k = test3();
	static int l = test4();
	
	static 
	{
		System.out.println("SIB1: " + "i: " + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
		i += 1;
		j += i;
		i += k;
		j += l;
		main(null);
		System.out.println("SIB1: again: " + "i: " + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
		i += 2;
		j += i;
		i += k;
		j += l;
	}

	static 
	{
		System.out.println("SIB2: " + "i: " + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
		k += 10;
		l += k;
		i += k;
		j += l;
		main(null);
		System.out.println("SIB2: again: " + "i: " + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
		k += 20;
		l += k;
		i += k;
		j += l;
	}

	public static int test1()
	{
		System.out.println("test1: " + "i: " + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
		i += 3;
		j += i;
		i += k;
		j += l;
		main(null);
		System.out.println("test1 again: " + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
		i += 4;
		j += i;
		i += k;
		j += l;
		return i + j + 15;
	}

	public static int test2()
	{
		System.out.println("test2: " + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
		i += 6;
		j += i;
		i += k;
		j += l;
		main(null);
		System.out.println("test2 again:" + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
		i += 7;
		j += i;
		i += k;
		j += l;
		return i + j + k + l + 18;
	}

	public static void main(String[] args)
	{
		System.out.println("main begin: " + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
		i += 9;
		j += i;
		k += 10;
		l += k;
		i += k;
		j += l;
		System.out.println("main end: " + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
	}

	static 
	{
		System.out.println("SIB3: " + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
		i += k;
		j += l;
		main(null);
		System.out.println("SIB3 again " + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
		i += k;
		j += l;
	}

	public static int test3()
	{
		System.out.println("test3: " + "i: " + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
		i += 30;
		j += i;
		i += k;
		j += l;
		main(null);
		System.out.println("test3 again: " + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
		i += 40;
		j += i;
		i += k;
		j += l;
		return i + j + 12;
	}

	public static int test4()
	{
		System.out.println("test4: " + "i: " + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
		i += 13;
		j += i;
		i += k;
		j += l;
		main(null);
		System.out.println("test4 again: " + "i: " + i + ", " + "j: " + j + "k: " + k + ", " + "l: " + l);
		i += 14;
		j += i;
		i += k;
		j += l;
		return i + j + 16;
	}
}