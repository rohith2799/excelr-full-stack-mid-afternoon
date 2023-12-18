class M 
{
	static int i = 100;
	 public static void main(String[] args)
     {
        System.out.println("a: " + i);
        int i = 10;
        System.out.println("b: " + M.i);
		System.out.println("c: " + i);
        i = 20;
        System.out.println("d: " + M.i);
		System.out.println("e: " + i);
     }
}
