public class Main {
    public static void main(String[] args) {
        //задача 1
        int clientOs  = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS  по ссылке");
        }
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // задача 2
        int clientOsFon = 1;
        int clientDeviceYear = 2012;
        if ( clientOsFon == 0 && clientDeviceYear <= 2015 ) {
            System.out.println("Установите облегченную версию приложения для IOS");
        }else if ( clientOsFon ==0) {
            System.out.println("Установите версию приложения для IOS  по ссылке");
        }
        if (clientOsFon == 1 && clientDeviceYear <= 2015){
            System.out.println("Установите облегченную версию приложения для Android");
        }else if (clientOsFon == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }




    }
}
