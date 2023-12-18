class O 
{
	int i;

	public static void main(String[] args) 
	{
		O o1 =  new O();
		System.out.println(o1.i);
		O o2 =  new O();
		System.out.println(o2.i);
		o1.i = 10;
		o2.i = 20;
		System.out.println(o1.i);
		System.out.println(o2.i);
	}
}
