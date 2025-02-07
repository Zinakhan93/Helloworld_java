import com.sun.jdi.Value;

public class Main {
    public static void main(String[] args) {
        //задача 1
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS  по ссылке");
        }
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // задача 2
        int clientOsFon = 1;
        int clientDeviceYear = 2012;
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
        // задача 3
        int year = 2025;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Год является высокосным");
        } else {
            System.out.println("Год  не является вискосным");
        }
        // задача 4
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + day);
        }
            if (deliveryDistance > 20 && deliveryDistance < 60) {
                System.out.println("Потребуетяс дней " + (day += 1));
        }
            if (deliveryDistance > 60 && deliveryDistance <= 100){
                System.out.println("Потребуется дней " + (day += 2));
            }else if (deliveryDistance > 100){
                System.out.println("К сожалению, доставки нет");

            }






    }
}
