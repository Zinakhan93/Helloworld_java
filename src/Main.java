import com.sun.jdi.Value;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        // задача 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        // задача 3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        // задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // задача 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является вискокосным");
        }
        // задача 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        // задача 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        // задача 8
        int salari = 29000;
        int totalSalary = 0;
        for (int i = 1; i < 13; i++) {
            totalSalary = totalSalary + salari;
            System.out.println("Месяц " + i + " сумма накоплений ровна " + totalSalary);
        }
        // задача 10
        int number = 2;
        for (int i = 1; i < 11; i++) {
            System.out.println(number + "*" + i + " = " + number * i);
        }
        // задача 9
        int money = 29000;
        int totalMoney = 0;
        for (int i = 0; i < 12; i++) {
            totalMoney = totalMoney + totalMoney / 100;
            totalMoney = totalMoney + money;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalMoney);
        }

    }
}
