
public class exo9 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("The sum of the numbers between 1 and 100 is: " + sum);

        /* while boucle */
        int j = 1;
        int Sum = 0;
        while (j <= 100) {
            Sum += j;
            j++;
        }
        System.out.println("The sum of the numbers between 1 and 100 is: " + Sum);

    }
}
