class Employee {
    private int employeeId;
    private String employeeName;
    private String employeeDepartment;
    private int employeeAge;
    private double employeeSalary;

    Employee(int employeeId, String employeeName, String employeeDepartment, int employeeAge, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}

class MainDriver 
{
    public static void main(String[] args) 
    {
        Employee emp1 = new Employee(101, "Rohith", "FULL-stack", 55, 2000.0);
        System.out.println(emp1.getEmployeeId());
        System.out.println(emp1.getEmployeeName());
        System.out.println(emp1.getEmployeeDepartment());
        System.out.println(emp1.getEmployeeAge());
        System.out.println(emp1.getEmployeeSalary());
        System.out.println("--------------------------------");
        emp1.setEmployeeId(1001);
        emp1.setEmployeeName("Priyanka");
        emp1.setEmployeeDepartment("DataScience");
        emp1.setEmployeeAge(30);
        emp1.setEmployeeSalary(3000.0);
        System.out.println(emp1.getEmployeeId());
        System.out.println(emp1.getEmployeeName());
        System.out.println(emp1.getEmployeeDepartment());
        System.out.println(emp1.getEmployeeAge());
        System.out.println(emp1.getEmployeeSalary());
    }
}