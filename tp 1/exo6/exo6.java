/*Write a program to input two numbers by the user and find the maximum between the two using
the switch case. */
import java.util.Scanner;
public class exo6 {
    public static void main(String[] args){
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        do{
        
            System.out.print("Enter Your fisrt Number : ");
            num1 = scanner.nextInt();
            System.out.print("Enter Your Second Number : ");
            num2 = scanner.nextInt();
            if(num1 == num2){
                System.out.println("Make sure that the numbers are not the same !");
            }
        }while(num1 == num2);
            
            
            switch((num1 > num2) ? 1 : 0){
                case 1 : 
                System.out.println("number 1 => "+num1 + " is bigger than " +num2+ " <= number 2");
                break;
                case 0 :
                    System.out.println("number 2 => "+num2 + " is bigger than " +num1+ " <= number 1");
                break;  
                }
                scanner.close();
            }
}
