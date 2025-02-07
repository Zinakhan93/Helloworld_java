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
        // задача 4
        int person = 25;
        if (person >= 2 && person <= 6) {
            System.out.println("Если возраст человека " + person + ",то ему нужно ходить в школу");
        }
        if (person >= 7 && person <= 17) {
            System.out.println("Если возраст человека " + person + ",то ему нужно ходить в школу");
        }
        if (person >= 18 && person <= 24) {
            System.out.println("Если возраст человека " + person + ",то его место в университете");
        } else if (person > 24) {
            System.out.println("Если человеку больше " + person + ",то ему пора ходить на работу");
        }
        // задача 6
        int people = 103;
        if (people < 102 && people <= 60) {
            System.out.println("В вагоне " + people + " человек, есть сидячее место");
        }else if (people < 102 && people >60){
            System.out.println("В вагоне " + people + " человек, нет сидячих мест");
        } else if (people >102){
            System.out.println("Вагон полностью забит");
        }
        // задача 7
        int one = 5;
        int too = 8;
        int three = 3;
        if ( one > too && one > three ){
            System.out.println("Число " + one + " самое большое");
        }else if (too > one && too > three){
            System.out.println(" Число " + too + " самое большое");
        }else {
            System.out.println("Число " + three + " самое большое");
        }



    }


}