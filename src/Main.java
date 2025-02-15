import com.sun.jdi.Value;

public class Main {
    public static void main(String[] args) {
        // задача 1
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2459000) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
            i++;
        }
        //задача 2
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println();
        //задача 3
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        for (int year = 0; year <= 10; year++) {
            population = population + population / 1000 * 17 - population / 1000 * 8;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        // задача 4
        int pay = 15000;
        int totalPay = 0;
        for (int month = 0; totalPay <= 12_000_000; month++) {
            totalPay = totalPay + totalPay / 100 * 7;
            totalPay = totalPay + pay;
            System.out.println("Месяц " + month + " " + totalPay);
        }
        // задача 5 (та же, что и 4 задача, только доблем условный опреатор if + к переменным добавила цифры)
        int pay1 = 15000;
        int totalPay2 = 0;
        for (int month = 1; totalPay2 <= 12_000_000; month++) {
            totalPay2 = totalPay2 + totalPay2 / 100 * 7;
            totalPay2 = totalPay2 + pay1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " " + totalPay2);
            }
        }
        // задача 6
        int pay3 = 15000;
        int totalPay3 = 0;
        int totalYear = 9 * 12;
        for (int monht = 0; monht <= 106; monht++) {
            totalPay3 = totalPay3 + totalPay3 / 100 * 7;
            totalPay3 = totalPay3 + pay3;
            if (monht % 6 == 0) {
                System.out.println(monht + " " + totalPay3);
            }
        }
        // задача 7
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница " + friday + " число. Необходимо  подготовичть  отчет");
            friday += 7;
        }
        // задача 8
        int yeaBefore = 2024 - 200;
        int yearAfter = 2024 + 100;
        int year = 0;
        for (year = yeaBefore; year < yearAfter; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }


    }
}
