public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i:arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");

        System.out.println("Задача 2");

        int minSpending = 200_000;
        int maxSpending = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpending) {
                maxSpending = arr[i];
            }
            if (minSpending > arr[i]) {
                minSpending = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minSpending+" рублей. Максимальная сумма трат за день составила "+maxSpending+" рублей.");
    }
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}