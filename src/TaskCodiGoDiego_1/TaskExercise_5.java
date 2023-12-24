package TaskCodiGoDiego_1;

import java.util.Scanner;

public class TaskExercise_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long m;
        long sum = 0;
        long n1 = scan.nextInt();
        while (n1 > 0)
        {
            m = n1%10;
            sum = sum+m;
            n1 = n1/10;
        }
        System.out.println(sum);
    }
}
