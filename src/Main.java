public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //    задача №2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // задача №3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // задача №4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // задача №5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // задача № 6
        var fighter1 = 78.2;
        var fighter2 = 87.2;
        var totalWeight = fighter1 + fighter2;
        System.out.println("Общая масса двух бойцов " + totalWeight + "кг.");
        var weightDifference = fighter2 - fighter1;
        System.out.println("Разница между массами бойцов " + weightDifference + "кг.");
        // задача №7
        var divisionRemainder = fighter2 % fighter1;
        System.out.println(divisionRemainder);
        // задача №8
        var totalHours = 640;
        var totalEmployees = totalHours / 8;
        System.out.println("Всего работников в компании " + totalEmployees + " человек.");
        var increaseEmployees = totalEmployees + 94;
        var divisionHours = totalHours / increaseEmployees;
        System.out.println("Если в компании работает " + increaseEmployees + " человек, то всего " + divisionHours + " часов работы может быть поделено между сотрудниками.");


    }
}
