public class Main {
    public static void main(String[] args) {
        // задача №1
        int a = 1000000;
        System.out.println("Значение пременной a с типом int " + " равно " + a);
        byte b = 125;
        System.out.println("Значение пременной b  с типом byte " + " равно " + b);
        short c = 30000;
        System.out.println("Значение пременной c  с типом short " + " равно " + c);
        long d = 250000000;
        System.out.println("Значение пременной d  с типом long " + " равно " + d);
        float e = 3.25F;
        System.out.println("Значение пременной e  с типом float " + " равно " + e);
        double i = 2.67;
        System.out.println("Значение пременной i  с типом double " + " равно " + i);
        // задача № 2
        double w = 27.12;
        System.out.println(w);
        long q = 987_678_965_549L;
        System.out.println(q);
        float r = 2.786F;
        System.out.println(r);
        short t = 569;
        System.out.println(t);
        short o = -159;
        System.out.println(o);
        short p = 27897;
        System.out.println(p);
        byte v = 67;
        System.out.println(v);
        // задача №3
        int lyudmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int totalStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int totalPaper = 480;
        int everyStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + everyStudent + " листов бумаги");
        // задача № 4
        byte productivityPerMinute= 16 /2;
        int productivityTwentyMinutes = 20 * productivityPerMinute;
        System.out.println(" За 20 минут машина произвела " + productivityTwentyMinutes + " бутылок");
        int productivityDay = productivityTwentyMinutes * 3 * 24;
        System.out.println(" За сутки машина произвела " + productivityDay + " бутылок");
        int productivityThreeDays = productivityDay * 3;
        System.out.println(" За 3 дня машина произвела " + productivityThreeDays + " бутылок");
        int productivityMonth = productivityThreeDays * 10;
        System.out.println(" За месяц машина произвела " + productivityMonth + " бутылок");
        // задача № 5
        byte totalСolors = 120;
        byte classWhite = 2;
        byte classBrown = 4;
        int oneClass = classWhite + classBrown;
        int totalClass = totalСolors / oneClass;
        int whitePaint = totalClass * classWhite;
        int brownPant = totalClass * classBrown;
        System.out.println("В школе, где " + totalClass + " классов нужно  " + whitePaint + " банок белой краски и  " + brownPant + " банок коричневой краски.");
        // задача № 6
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int totalFoodGrams = (banana + milk + iceCream + eggs);
        double totalFoodKilograms = totalFoodGrams / 1000.0;
        System.out.println(totalFoodGrams + " грамм и  " + totalFoodKilograms + " килограмм");
        // задача №7
        short loseWeight = 7000;
        short process1 = 250;
        short process2 = 500;
        float resultProcess1 = loseWeight / process1;
        System.out.println(" Если тераять каждый день по " + process1 + " то на похудение спортсмена уйдет " + resultProcess1 + " дней");
        float resultProcess2 = loseWeight / process2;
        System.out.println(" Если тераять каждый день по " + process2 + " то на похудение спортсмена уйдет " + resultProcess2 + " дней");
        float averageValue = (resultProcess1 + resultProcess2) / 2;
        System.out.println(" В среднем потребуется " + averageValue + " дней");
        // задача №8
        int masha = 67760;
        int denis = 83690;
        int christina = 76230;
        double percent= 0.1;
        double newSalarymasha = masha * percent + masha;
        double salaryYearmasha = masha * 12;
        double newSalaryYearmasha = newSalarymasha * 12;
        double mashaDifference = newSalaryYearmasha - salaryYearmasha;
        System.out.println("Маша теперь получает " + newSalarymasha + " рублей.Годовой доход вырос на  " + mashaDifference + " рублей");
        double newSalarydenis = denis * percent + denis;
        double salaryYeardenis = denis * 12;
        double newSalaryYeardenis = newSalarydenis * 12;
        double denisDifference = newSalaryYeardenis - salaryYeardenis;
        System.out.println(" Денис теперь получает " + newSalarydenis + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        double newSalaryChristina = christina * percent + christina;
        double salaryYearchristina = christina * 12;
        double newSalaryYeachristina = newSalaryChristina * 12;
        double christinaDifference = newSalaryYeachristina - salaryYearchristina;
        System.out.println("Кристина теперь получает " + newSalaryChristina + " рублей. Годовой доход вырос на " + christinaDifference + " рублей");


    }
}
