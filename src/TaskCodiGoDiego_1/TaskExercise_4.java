package TaskCodiGoDiego_1;

import java.util.Scanner;
public class TaskExercise_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long factorial  = 1;
        for(int i = n; i >= 1;i--)
        {
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
