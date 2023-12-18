class Student
	{
    private int studentId;
    private String studentName;
    private String studentDepartment;
    private int studentAge;
    private double studentMarks;

    Employee(int studentId, String studentName, String studentDepartment, int studentAge, double studentMarks)
		{
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
        this.studentAge = studentAge;
        this.studentSalary = studentMarks;
    }

    public int getstudentId() {
        return studentId;
    }

    public void setEmployeeId(int studentId) {
        this.studentId = studentId;
    }

    public String getstudentName() 
	{
        return studentName;
    }

    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getstudentDepartment() {
        return studentDepartment;
    }

    public void setstudentDepartment(String studentDepartment)
	{
        this.studentDepartment = studentDepartment;
    }

    public int getstudentAge() {
        return studentAge;
    }

    public void setstudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public double getstudentMarks() {
        return studentMarks;
    }

    public void setstudentMarks(double studentMarks) {
        this.studentMarks = studentMarks;
    }
}

class MainDriver 
{
    public static void main(String[] args) 
    {
        Employee emp1 = new Employee(101, "Rohith", "FULL-stack", 55, 2000.0);
        System.out.println(emp1.getstudentId());
        System.out.println(emp1.getstudentName());
        System.out.println(emp1.getstudentDepartment());
        System.out.println(emp1.getstudentAge());
        System.out.println(emp1.getstudentMarks());
        System.out.println("--------------------------------");
        emp1.setEmployeeId(1001);
        emp1.setEmployeeName("Priyanka");
        emp1.setstudentDepartment("DataScience");
        emp1.setstudentAge(30);
        emp1.setEmployeeSalary(3000.0);
        System.out.println(emp1.getEmployeeId());
        System.out.println(emp1.getEmployeeName());
        System.out.println(emp1.getstudentDepartment());
        System.out.println(emp1.getstudentAge());
        System.out.println(emp1.getEmployeeSalary());
    }
}