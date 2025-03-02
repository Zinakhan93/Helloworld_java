

public class Main {
    public  static void checkLeapYear( int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println (" Год является высокосным");
        } else {
            System.out.println (" Год  не является вискосным");
        }
     }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2021;
        checkLeapYear(year);

        System.out.println("Задача 2");
    }

}
