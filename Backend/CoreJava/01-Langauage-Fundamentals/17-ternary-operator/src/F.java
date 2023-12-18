class F 
{
	public static void main(String[] args) 
	{
		int firstNum = 10;
		int secondNum = 2;
		int thirdNum = 20;

		int min = (firstNum < secondNum) ? ((firstNum < thirdNum) ? firstNum :
		thirdNum) : secondNum;

		System.out.println("Minimum b/w " + firstNum + " and " + secondNum + " and " + thirdNum + " is " + min);
	}
}
