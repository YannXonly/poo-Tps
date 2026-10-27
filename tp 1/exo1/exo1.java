
/*exo 1 : Write a program to enter the weekday number (1-7) and display the day name using the switch
case. */
import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        Scanner Weekdays = new Scanner(System.in);
        System.out.println("Enter Your Number To show The Day of the week (1-7) : ");
        int weekday = Weekdays.nextInt();
        switch (weekday) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("The number must be between 1 & 7 retry !");
            
        }
       

        Weekdays.close();
    }
}
