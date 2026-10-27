/*Write a java programthat:
 Reads an integer.
 Displays whether the number is even or odd. */
import java.util.Scanner;
public class exo3 {
public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Your Number :");
    int value = scanner.nextInt();

    switch ((value % 2 == 0) ? 0 : 1){
        case 0 :
            System.out.println("Your input  " + value + " is even");
        break;
        case 1 :
            System.out.println("Your input " + value + " is odd");
        break;        

    }
   scanner.close();
}
    
}
