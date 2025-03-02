import java.time.LocalDate;

public class Main {
    public  static void checkLeapYear( int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println (" Год является высокосным");
        } else {
            System.out.println (" Год  не является вискосным");
        }
     }
     public static void downloadАpplication ( int clientOsFon, int clientDeviceYear){
         if (clientOsFon == 0 && clientDeviceYear <= 2015) {
             System.out.println("Установите облегченную версию приложения для IOS");
         } else if (clientOsFon == 0) {
             System.out.println("Установите версию приложения для IOS  по ссылке");
         }
         if (clientOsFon == 1 && clientDeviceYear <= 2015) {
             System.out.println("Установите облегченную версию приложения для Android");
         } else if (clientOsFon == 1) {
             System.out.println("Установите версию приложения для Android по ссылке");
         }

     }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2021;
        checkLeapYear(year);

        System.out.println("Задача 2");
        int clientOsFon = 1;
        int clientDeviceYear = LocalDate.now().getYear();
        downloadАpplication(clientOsFon,clientDeviceYear);

        System.out.println("Задача 3");

    }

}
