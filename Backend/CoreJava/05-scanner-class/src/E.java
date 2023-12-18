import java.util.Scanner;
class E
{
	public static void main(String[] args) 
	{
		System.out.println("Are you in the class?");
		Scanner sc = new Scanner(System.in);
		boolean status = sc.nextBoolean();
		if (status)
		{
			System.out.println("Good");
		}
		else
		{
			System.out.println("Focus");
		}
	}
}