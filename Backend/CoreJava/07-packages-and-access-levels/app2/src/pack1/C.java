package pack1;
class B
{
	private int i;
}
class C extends B
{
	public static void main(String[] args) 
	{
		B b2 = new B();
		System.out.println(b1.i);
	}
}


//private memebers are not inheriting to the sub-class
/* Private - only limited to the class itself 
with in the class -Yes
same package sub class- No
*/