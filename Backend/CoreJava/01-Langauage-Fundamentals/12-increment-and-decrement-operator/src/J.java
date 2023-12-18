class J
{
	public static void main(String[] args)
	{
		int x = 0;
		
		int	y = x++ + x++ + x++ + x;//0 + 1 + 2 +3
		System.out.println(x);//3
		System.out.println(y);//6
	}
}
//x = 0, 1, 2