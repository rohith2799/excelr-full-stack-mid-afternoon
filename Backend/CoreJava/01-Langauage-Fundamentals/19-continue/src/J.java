class J
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			System.out.println(i);
			if(i == 2)
			{
			    System.out.println("current i value is 2: " + i);
			}
			if(i == 3)
			{
				System.out.println("current i value is 3: " + i);
			}
			else if(i == 5)
			{
			    System.out.println("current i value is 5: " + i);
		    }
		else
		   {
			System.out.println("current i value is other than 2, 3, 5 " + i);
		   }
	  }
   }
}