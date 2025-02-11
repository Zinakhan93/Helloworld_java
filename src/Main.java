import com.sun.jdi.Value;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        // задача 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        // задача 3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        // задача 4
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        // задача 5
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является вискокосным");
        }
        // задача 6
        for (int i = 7; i < 99; i = i +7){
            System.out.println(i);
        }

    }
}
