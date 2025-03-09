import java.util.Objects;

public class Book {
    private String name;
    private int yaerPublication;
    private Аuthor author;
    /* Класс Author нами уже создан отельным файлом, используем его уже в другом поле класса. */

    /*Создаем конструктор, можно создать через генератор*/
    public Book(Аuthor author, String name, int yaerPublication) {
        this.author = author;
        this.name = name;
        this.yaerPublication = yaerPublication;
    }

    /* Для всех полей создаем сеттеры и гетторы, тоже можно через генератор*/
    public Аuthor getAuthor() {
        return author;
    }

    public void setAuthor(Аuthor author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYaerPublication() {
        return yaerPublication;
    }

    public void setYaerPpublication(int yaerPpublication) {
        this.yaerPublication = yaerPpublication;
    }
    /* Создаем через генератор equals и hashCode, а также toString, еще не совсем понятно зачем
    но преподаватель говорит, что надо.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yaerPublication == book.yaerPublication && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yaerPublication, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", name='" + name + '\'' +
                ", yaerPublication=" + yaerPublication +
                '}';
    }
}

