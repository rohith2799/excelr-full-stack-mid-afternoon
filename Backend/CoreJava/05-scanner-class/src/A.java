import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your first name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Welcome: " +name);
	}
}

//next() - reads the complete token in the form of a String
//token - A single charater or a group of characters without any space.
// Stremas in java - input, output, error