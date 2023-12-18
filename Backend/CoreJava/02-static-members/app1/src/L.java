class L
{
     static int i = 100;
	 public static void main(String[] args)
     {
        System.out.println("a: " + i);
        int i = 10;
        System.out.println("b: " + i);
        i = 20;
        System.out.println("c: " + i);
     }
}

/*
- if global and local variables are with the same name then local variable will be given the preference.
*/