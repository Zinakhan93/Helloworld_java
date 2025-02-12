import com.sun.jdi.Value;

public class Main {
    public static void main(String[] args) {
        // задача 1
        int salary = 15000;
        int total = 0;
        int i = 0;
        while ( total <= 2459000) {
            total=total+salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
            i++;
        }

        //



    }
}
