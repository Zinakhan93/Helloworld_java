public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println( dog);
        System.out.println(cat);
        System.out.println(paper);

        //    задача №2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println( dog);
        System.out.println(cat);
        System.out.println(paper);

        // задача №3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper-7639;
        System.out.println( dog);
        System.out.println(cat);
        System.out.println(paper);

        // задача №4
        var friend = 19;
        System.out.println( friend);
        friend = friend + 2;
        System.out.println( friend);
        friend = friend/7;
        System.out.println( friend);

        // задача №5
        var frog = 3.5;
        System.out.println( frog);
        frog = frog * 10;
        System.out.println( frog);
        frog = frog/3.5;
        System.out.println( frog);
        frog = frog + 4;
        System.out.println( frog);

        // задача № 6
        var боксер1 = 78.2;
        var боксер2 = 87.2;
        var весОбщий = боксер1 + боксер2;
        System.out.println( "Общая масса двух бойцов " + весОбщий + "кг.");
        var разницаВеса = боксер2 - боксер1;
        System.out.println("Разница между массами бойцов " + разницаВеса + "кг.");

        // задача №7
        var остатокДеления = боксер2 % боксер1;
        System.out.println(остатокДеления);

        // задача №8
        var всегоЧасов = 640;
        var всегоСотрудников = всегоЧасов / 8;
        System.out.println("Всего работников в компании " + всегоСотрудников + " человек.");
        var увеличениеСотрудников = всегоСотрудников +94;
        var делениеЧасов = всегоЧасов / увеличениеСотрудников;
        System.out.println ("Если в компании работает " + увеличениеСотрудников + " человек, то всего " + делениеЧасов + " часов работы может быть поделено между сотрудниками.");




















    }
}
