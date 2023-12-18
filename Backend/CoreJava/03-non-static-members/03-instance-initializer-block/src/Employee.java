class Employee 
{
	String employeeName, companyName;
	int rollNum;
	int age;

	Employee(String localEmployeeName, int localRollNum, int localAge)
	{

		employeeName = localEmployeeName;
		rollNum = localRollNum;
		age = localAge;
		//this.employeeName = employeeName;
		//this.rollNum = rollNum;
		//this.age = age;
		//System.out.println(employeeName);
		//System.out.println(rollNum);
		//System.out.println(age);
		//this always refers to current object
		//employeeName = employeeName;
		//rollNum = rollNum;
		//age = age;
	}

	{
		companyName = "xyz";
	}

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("john", 101, 32);
		System.out.println("--------------------------");
		Employee emp2 = new Employee("sharma", 102, 30);
		System.out.println("--------------------------");
		Employee emp3 = new Employee("Adam", 103, 45);
		System.out.println("--------------------------");
		Employee emp4 = new Employee("David", 104, 60);
		System.out.println("--------------------------");

		System.out.println(emp1.employeeName);
		System.out.println(emp1.companyName);
		System.out.println(emp1.rollNum);
		System.out.println(emp1.age);

		System.out.println("--------------------------");

		System.out.println(emp2.employeeName);
		System.out.println(emp2.companyName);
		System.out.println(emp2.rollNum);
		System.out.println(emp2.age);

		System.out.println("--------------------------");

		System.out.println(emp3.employeeName);
		System.out.println(emp3.companyName);
		System.out.println(emp3.rollNum);
		System.out.println(emp3.age);

		System.out.println("--------------------------");

		System.out.println(emp4.employeeName);
		System.out.println(emp4.companyName);
		System.out.println(emp4.rollNum);
		System.out.println(emp4.age);
	}//
}
