class A
{
	static int i = 10;
	static int j = 20;
	static int k = i +++ j ;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}


//i got increment to 11 j becomes 20 k will become 30