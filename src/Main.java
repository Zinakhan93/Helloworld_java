import static java.lang.Integer.MAX_VALUE;

public class Main {
    public static void main(String[] args) {
        // задача 1
        int[] arr = {1, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма затрат за месяц сотавила " + sum);
        // задача 2
        int[] arr2 = {18, 25, 35, 66, 75};
        int maxArr2 = -1;
        int minArre2 = MAX_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > maxArr2) {
                maxArr2 = arr2[i];
            }
            if (arr2[i] < minArre2) {
                minArre2 = arr2[i];
            }
        }
        System.out.println("Макимальная сумма затрат сотавила " + maxArr2 + " рублей. Минимальная сумма затрат составила " + minArre2 + " рублей.");
        // задача 3
        double[] weeks = {15.5, 45, 37.8, 25, 41.35};
        double oll = 0;
        for (int i = 0; i < weeks.length ; i++) {
            oll += weeks[i];
        }
        oll = oll / 5;
        System.out.println("Средняя сумма трат за месяц составила " + oll + " рублей");
        // Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }

}
