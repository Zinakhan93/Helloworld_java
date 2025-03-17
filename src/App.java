public class App {
    public static void main(String[] args) {
        Аuthor author1 = new Аuthor("Михаил", "Булгаков");
        System.out.println(author1.getFirsname() + " " + author1.getLasname());

        Аuthor author2 = new Аuthor("Фёдор", "Достоевский");
        System.out.println(author2.getFirsname() + " " + author2.getLasname());

        Book information = new Book(author1, "Мастер и Маргарита", 1966);
        System.out.println(author1.getFirsname() + " " + author1.getLasname() + " " + information.getName() + " " + information.getYaerPublication());

        information.setYaerPpublication(1967);
        System.out.println("Дата первой публикации" + " " + information.getName() + " " + information.getYaerPublication());

        Book iinformation2 = new Book(author2, "Братья Карамазовы", 1879);
        System.out.println(author2.getFirsname() + " " + author2.getLasname() + " " + iinformation2.getName() + " " + iinformation2.getYaerPublication());

        System.out.println("-------------------------------------------------------");
        // Домашняя работа по методам
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(information);
        System.out.println(iinformation2);
        System.out.println(information.equals(iinformation2));
        System.out.println(author1.equals(author2));


    }


}
