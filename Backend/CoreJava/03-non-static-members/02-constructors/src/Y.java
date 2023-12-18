class Y 
{
	Y()
	{
		Y y1 = new Y(10);
		System.out.println("Y()");
	}

	Y(int i)
	{
		Y y1 = new Y(10,20);
		System.out.println("Y(int)");
	}

	Y(int i, int j)
	{
		System.out.println("Y(int, int)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Y y1 = new Y();
		System.out.println("----------");
		Y y2 = new Y(10);
		System.out.println("----------");
		Y y3 = new Y(10,20);
		System.out.println("----------");
		System.out.println("main end");
	}
}
