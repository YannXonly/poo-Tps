
/*Let A be an integer matrix of given dimensions (n, m).
Write a program that creates the matrix A and fills all rows with even indices with a given value
val1, all rows with odd indices with a given value val2, and then displays the contents of the
matrix row by row. */
import java.util.Scanner;
public class exo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = 0;
        int val1 = 0;
        int val2 = 0;
        System.out.print("Enter The number of rows of your matrix : ");
        int n = scanner.nextInt();
        System.out.print("Enter The number of columes of your matrix : ");
        int m = scanner.nextInt();

        int[][] values = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter The value : ");
                val = scanner.nextInt();
                if (i % 2 == 0) {
                    val1 = val;
                    values[i][j] = val1;
                } else {
                     val = val;
                    values[i][j] = val2;
                }
            }
        }
        for (int i = 0; i < n ; i++){
            for(int j = 0; j < m ; j++){
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
