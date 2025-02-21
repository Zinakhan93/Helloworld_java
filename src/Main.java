import com.sun.jdi.Value;

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
        System.out.println(small[0]+ "," + small[1] + ","+small[2]);



    }
}
