class A
{
	public static void main(String[] args)
	{
		int i = 0;
		//The value remains same for the immediate usage, from the next usage modified value will be visible
		// i = i + 1;
		System.out.println(i++);//0
		System.out.println(i);//1
		System.out.println(i);//1
	}
}
/*
unary operators
--------------------
1. increment ++   var[post-increment] ex: i++  | [pre-increment]var ex: ++i
2. decrement --   var[post-decrement] ex: i-- | [pre-decrement]var ex: --i
*/

