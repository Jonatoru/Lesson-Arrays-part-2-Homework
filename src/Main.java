public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int[] arr = generateRandomArray();
        double sum = 0;
        for (int i:arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");

        System.out.println("Задача 2");

        int minSpending = arr[0];
        int maxSpending = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpending) {
                maxSpending = arr[i];
            }
            if (minSpending > arr[i]) {
                minSpending = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minSpending+" рублей. Максимальная сумма трат за день составила "+maxSpending+" рублей.");

        System.out.println("Задача 3");

        double averageAmount = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила "+averageAmount+" рублей");

        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int n = reverseFullName.length;
        for (int i = 0; i < n/2; i++) {
            char temp = reverseFullName[n-i-1];
            reverseFullName[n-i-1] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        for (int i=0; i<reverseFullName.length; i++){
            System.out.print(reverseFullName[i]);
        }
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