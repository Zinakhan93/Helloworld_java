public class Employee {
    private static int idGenerator = 1;

    private final int id;
    private final String fullName;
    private int department;
    private double salary;


    public Employee(String fullName, int department, double salary) {
        id = idGenerator++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return    "id=" + id + " " +
                "department=" + department +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
