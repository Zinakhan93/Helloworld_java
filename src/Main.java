import java.util.Random;

public class Main {
    private final static Random RANDOM = new Random();
    private final static String[] NAMES = {"Иван", "Петр", "Андрей", "Михаил", "Павел", "Олег"};
    private final static String[] SURNAMES = {"Иванов", "Петров", "Михайлов", "Павлов", "Олегов"};
    private final static String[] PATRONYMIC_NAMES = {"Иванович", "Петрович", "Михайлович", "Павлович", "Олегович"};

    private final static Employee[] EMPLOYEES = new Employee[10];

    private static void initEmployees() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            String fullName = SURNAMES[RANDOM.nextInt(0, SURNAMES.length)] + " "
                    + NAMES[RANDOM.nextInt(0, NAMES.length)] + " "
                    + PATRONYMIC_NAMES[RANDOM.nextInt(0, PATRONYMIC_NAMES.length)];
            EMPLOYEES[i] = new Employee(fullName, RANDOM.nextInt(1, 6), RANDOM.nextInt(50000, 100000));
        }
    }

    public static void main(String[] args) {
        initEmployees();
        print();
        System.out.println("Сумма зп всех сотрудников: " + " " + calculateSumOfSalaries());
        System.out.println("Сотрудник с минимальной зарплатой: " + findEmployeeMinSalaries());
        System.out.println("Сотрудник с максимальной зарплатой:" + findEmployeeMaxSalaries());
        System.out.println("Среднее значение зарплат: " + calculateAwerageOfSalaries());
        printFullNames();

    }

    private static void print() {
        for (Employee i : EMPLOYEES) {
            System.out.println(i);
        }
    }
    private static double calculateSumOfSalaries() {
        double sum = 0;
        for (Employee i : EMPLOYEES) {
            sum += i.getSalary();
        }
        return sum;
    }
    private static Employee findEmployeeMinSalaries() {
        Employee employeeMinSalaries = null;
        for (Employee i : EMPLOYEES) {
            if (employeeMinSalaries==null || i.getSalary() < employeeMinSalaries.getSalary()){
                employeeMinSalaries = i;
            }
        }
        return employeeMinSalaries;
    }
    private static Employee findEmployeeMaxSalaries() {
        Employee employeeMaxSalaries = null;
        for (Employee i : EMPLOYEES) {
            if (employeeMaxSalaries==null || i.getSalary() > employeeMaxSalaries.getSalary()){
                employeeMaxSalaries = i;
            }
        }
        return employeeMaxSalaries;
    }
    private static double calculateAwerageOfSalaries() {
       return calculateSumOfSalaries()/EMPLOYEES.length;
    }
    private static void printFullNames() {
        for (Employee i : EMPLOYEES) {
            System.out.println(i.getFullName());
        }
    }




}


