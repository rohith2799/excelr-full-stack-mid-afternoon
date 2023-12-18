class G 
{
	int i;
	boolean j =false;

	G()
	{
		System.out.println("G()");
		i = 10;
	}

	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println(g1.i);
		System.out.println(g1.j);
		System.out.println("done");
	}
}
