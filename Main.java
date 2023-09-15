import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("len =");
        int len = sc.nextInt();


        int[] numbers = new int[len];


         for (int i = 0; i < len; i++) {
         int a;
         System.out.print("a=");
         a = sc.nextInt();
         numbers[i] = a;
         }

        Arrays.sort(numbers);

        double median = (len % 2 == 0) ? (numbers[len / 2] + numbers[len / 2 - 1]) / 2.0 : numbers[len / 2];
        System.out.printf("Median = %f\n", median);

        sc.close();
    }
}