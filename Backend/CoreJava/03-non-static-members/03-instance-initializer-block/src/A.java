class A 
{
	A()
	{
		System.out.println("A()");
	}

	//Instance Initialization Block - IIB
	//if there is a common implementation for all the objects then we can keep that inside the IIB block.
	//All the IIB blocks gets execuetd from top to bottom for one object creation before the execution of constructor only once.

	{
		System.out.println("IIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 = new A();
		System.out.println("--------------");
		A a2 = new A();
		System.out.println("main end");
	}
}
