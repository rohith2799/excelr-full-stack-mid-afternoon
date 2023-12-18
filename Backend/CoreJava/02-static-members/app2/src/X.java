class W
{
    static
    {
		System.out.println("W-SIB");
    }
	static void test1()
	{
		System.out.println("fromtest1");
	}
}
class X
{
	 public static void main(String[] args)
	 {
         System.out.println("------");
         W.test1();
		 W.test1();
		 W.test1();
         System.out.println("------");
	 }
	 static
	{
		 System.out.println("X-SIB");
	}
}


/* X-SIB
------
W-SIB
fromtest1
fromtest1
fromtest1
------ ->seperation.