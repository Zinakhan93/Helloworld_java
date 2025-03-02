

public class Main {
    public static void main(String[] args) {
        // задача 1
        System.out.println("Задача 1"); // задача на сложение строк
        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("Задача 2");// вывести ФИО заглавными, с ипользованием метода .toUpperCase()
        System.out.println("Данные Ф.И.О. сотрдуника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println("Задача 3");// замена символа
        String fullName2 = "Иванов Семён Семёнович";
        String fullName2True = fullName2.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName2True);


    }

}
