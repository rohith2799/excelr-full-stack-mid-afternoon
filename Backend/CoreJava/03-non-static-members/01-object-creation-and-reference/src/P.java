class P
{
	static int j;
	int i;
	
	public static void main(String[] args)	
	{
		System.out.println(j);
		j = 10;
		System.out.println(j);
		P.j = 20;
		System.out.println(j);

		int j = 100;
		System.out.println(j);
		System.out.println(P.j);
		System.out.println(P.j);
		System.out.println(P.j);
		System.out.println(P.j);
		System.out.println(P.j);
		int i = 10;
		System.out.println(i);
		P obj1 = new P();
		P obj2 = new P();
		P obj3 = new P();
		System.out.println("-------------");
		System.out.println(obj1.i = 10);
		System.out.println(obj2.i);
		System.out.println(obj3.i);
		System.out.println(i);


		P p1 = new P();
		P p2 = p1;
		System.out.println(p1.i);
		System.out.println(p2.i);
		p1.i = 10;
		System.out.println(p2.i);
		p2.i = 20;
		System.out.println(p1.i);
	}
}
//one object can be refered by any no. of references.
//but one reference can only point to one object at a time.