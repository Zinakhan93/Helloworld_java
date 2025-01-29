public class Main {
    public static void main(String[] args) {
        // задача №1
        int a = 1000000;
        System.out.println("Значение пременной a " + " с типом int " + " равно " + a);
        byte b = 125;
        System.out.println("Значение пременной b " + " с типом byte " + " равно " + b);
        short c = 30000;
        System.out.println("Значение пременной c " + " с типом short " + " равно " + c);
        long d = 250000000;
        System.out.println("Значение пременной d " + " с типом long " + " равно " + d);
        float e = 3.25F;
        System.out.println("Значение пременной e " + " с типом float " + " равно " + e);
        double i = 2.67;
        System.out.println("Значение пременной i " + " с типом double " + " равно " + i);
        // задача № 2
        double w = 27.12;
        System.out.println(w);
        long q = 987678965549L;
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
        byte LyudmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAndreevna = 30;
        int totalStudents = LyudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna;
        short totalPaper = 480;
        double everyStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + everyStudent + " листов бумаги");
        // задача № 4
        byte productivityTwominutes = 16;
        int productivityTwentyminutes = 20 / 2 * 16;
        System.out.println(" За 20 минут машина произвела " + productivityTwentyminutes + " бутылок");
        int productivityDay = productivityTwentyminutes * 3 * 24;
        System.out.println(" За сутки машина произвела " + productivityDay + " бутылок");
        int productiviTythreedays = productivityDay * 3;
        System.out.println(" За 3 дня машина произвела " + productiviTythreedays + " бутылок");
        int productivityMonth = productiviTythreedays * 10;
        System.out.println(" За месяц машина произвела " + productivityMonth + " бутылок");
        // задача № 5
        byte totalcolors = 120;
        byte oneOfficewhite= 2;
        byte oneOffisbrown = 4;
        int oneOffistotalcjlors = oneOfficewhite + oneOffisbrown;
        int totalOffice = totalcolors / oneOffistotalcjlors;
        int whitePaint = totalOffice * oneOfficewhite;
        int brownPant = totalOffice * oneOffisbrown;
        System.out.println("В школе, где " + totalOffice +  " классов нужно  " + whitePaint + " банок белой краски и  " + brownPant + " банок коричневой краски.");





    }
}
