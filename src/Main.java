public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }
        // задача 2
        int airTemperature = 5;
        if (airTemperature >= 5) {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        }
        // задача 3
        int speed = 60;
        if (speed >= 60) {
            System.out.println(" Скорость " + speed + " придется заплатить штраф");
        } else {
            System.out.println("Скорость " + speed + " можно ездить спокойно");
        }
        // задача 5
        int year = 15;
        boolean adultAccompanies = true;
        if (year < 5) {
            System.out.println("Если возраст ребенка равен " + year + ",то он не может кататься на аттракционе ");
        }
        if (year > 5 && year < 14) {
            if (adultAccompanies) {
                System.out.println("Ели возраст ребенка равен " + year + ",то он может кататься только в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + year + "и, если взрослого нет, то кататься нельзя");
            }
        }
        if (year > 14) {
            System.out.println("Если возраст ребенка равен " + year + ",то он может кататься без сопровождения взрослого");
        }

    }
}
