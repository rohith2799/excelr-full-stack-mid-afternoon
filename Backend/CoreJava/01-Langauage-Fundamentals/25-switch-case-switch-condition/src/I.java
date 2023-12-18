class I
{
	public static void main(String[] args) 
	{
		int i = 10;
		switch(i)
		{
			case 2:
				System.out.println("from case 2");
				break;
			case 3:
				System.out.println("from case 3");
				break;
			default:
				System.out.println("from default 1");
			default:
				System.out.println("from default 2");
		}
	}
}
//* Only one default case can be excuted 