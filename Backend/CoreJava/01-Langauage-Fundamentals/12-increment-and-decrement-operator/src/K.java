class K
{
	public static void main(String[] args)
	{
		int i = 0;
		int j = i++ + i + i-- + i +
			    i-- + i++ + i-- + i +
			    i++ + i-- + i + i++;
		System.out.println(i);//0
		System.out.println(j);//-3
	}
}

//i = 0, 1, 0, -1, 0, -1, 0