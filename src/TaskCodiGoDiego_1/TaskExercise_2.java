package TaskCodiGoDiego_1;

public class TaskExercise_2 {
    public static void main(String[] args) {
        int accumulativeSum = 0;
        for(int i = 1 ; i <= 100;i++)
        {
            if(i%2 != 0)
            {
                accumulativeSum+=i;
            }
        }
        System.out.println(accumulativeSum);
    }
}
