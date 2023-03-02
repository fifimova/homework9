public class Main {
    public static void main(String[] args){
      task1();
      task2();
      task3();
      task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2(){
        System.out.println("Задание 2");
        int [] arr = generateRandomArray();
        int maxSum = 0;
        int minSum = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            } else if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        System.out.println("Максимальная трата за день составляет " + maxSum + " рублей");
        System.out.println("Минимальная трата за день составляет " + minSum + " рублей");
    }
    public static void task3(){
        System.out.println("Задание 3");
        int [] arr = generateRandomArray();
        double averageSum = 0;
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            averageSum = total / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");
    }
    public static void task4(){
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}