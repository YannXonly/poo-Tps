/*Write a program to check whether a number is divisible by 3 and 13 or not, using if-else. */
import java.util.Scanner;
public class exo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Number :");
        int val = scanner.nextInt();
        if (val % 3 == 0 && val % 13 == 0){
        System.out.println("Your Number is divisible by 3 and 13");
        }
        else{
        System.out.println("Your Number is not divisible by 3 and 13");
        }
        scanner.close();
    }
    
}