import com.sun.jdi.Value;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // задача 1
        int[] numbers = new int[]{1, 2, 3};
        double[] fractional = {1.57, 7.654, 9.986};
        short[] small = {4, 5, 6};

        // задача 2
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0] + "," + numbers[1] + "," + numbers[2]);
        fractional[0] = 1.57;
        fractional[1] = 7.654;
        fractional[2] = 9.986;
        System.out.println(fractional[0] + "," + fractional[1] + "," + fractional[2]);
        small[0] = 4;
        small[1] = 5;
        small[2] = 6;
        System.out.println(small[0] + "," + small[1] + "," + small[2]);
        // задача 3
        System.out.println("Задача 3");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = fractional.length - 1; i >= 0; i--) {
            System.out.print(fractional[i]);
            if (i != 0) {
                System.out.print(",");
            }

        }
        System.out.println();
        for (int i = small.length - 1; i >= 0; i--) {
            System.out.print(small[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println(" ");
        System.out.println("Задача 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += 1;
            }
        }
        System.out.print(Arrays.toString(numbers) + " ");
        System.out.println();
        for (int i = 0; i < fractional.length; i++) {
            if (fractional[i] % 2 != 0) {
                fractional[i] += 1;
            }
        }
        System.out.print(Arrays.toString(fractional) + " ");
        System.out.println();
        for (int i = 0; i < small.length; i++) {
            if (small[i] % 2 != 0) {
                small[i] = +1;
            }
        }
        System.out.println(Arrays.toString(small) + " ");

    }
}
