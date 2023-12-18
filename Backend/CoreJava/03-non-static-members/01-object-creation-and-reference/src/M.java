class M 
{
	void test1()
	{
		System.out.println("Hello World!");
	}

	static
	{
		M obj = new M();
		obj.test1();
	}		
}




//Till Java JDK 1.6 we could be able run a program wothout the main mthod, but
//from java JDK 1.7 complulsary we should be having the main method to run the class,because JVM will be looking for main method to run the class(intialize the class for running).