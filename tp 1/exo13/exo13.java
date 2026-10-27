/*Exercise 13
Write a program to enter a character and check if the character is a letter of the alphabet, a
number or a special character using the if-else.
- A character is an alphabet between a-z and A-Z
- A character is a number between 0 and 9
- A character is a special symbol if it is neither an alphabet nor a number */
import java.util.Scanner;
public class exo13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Character : ");
        char var = scanner.next().charAt(0);

        if ((var >= 'a' && var <= 'z') || (var >= 'A' && var <= 'Z')) {
            System.out.print("Your Character " + var + " Is Alphabet !");
        } else if (var >= '0' && var <= '9') {
            System.out.print("Your Character " + var + " Is Number !");
        } else {
            System.out.print("Your Character " + var + " Is symbol !");
        }

        scanner.close();
    }
}
