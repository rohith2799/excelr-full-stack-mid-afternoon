class G 
{
	static int count;

	{
		count += 1;
	}


	public static void main(String[] args) 
	{
		G g1 = new G();
		G g2 = new G();
		G g3 = new G();
		G g4 = new G();
		G g5 = new G();

		System.out.println("Number of Object created for G class: "+count);
	}
}
