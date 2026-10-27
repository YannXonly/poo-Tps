
/*Write a program that reads an integer from the keyboard and checks whether this integer exists in
the array. */
import java.util.Arrays;
import java.util.Scanner;

public class exo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give The length of Your Array of Intgers :");
        int n = scanner.nextInt();
        
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Your number :");
            values[i] = scanner.nextInt();
        }
        System.out.println("Your array: " + Arrays.toString(values));
        System.out.println("Give The Number to check if its in the array : ");
        int val = scanner.nextInt();
        for (int i = 0; i < n; i++){
            if (val == values[i]) {
                 System.out.println("The number "+ val +" is on the "+ i +" index");
            }
            else
                System.out.println("The number "+ val +" is not on the array");
        }
        

        scanner.close();
    }
}
