class I 
{
	static int i;
	static
	{
		i = j;
	}
	static int j = 40;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}

/* -> before j declaration its not possible to modify 
