/*Write a program to enter the month number and display the total number of days in that month
using an if-else. 
• Mois de 31 jours (7 mois) : Janvier, Mars, Mai, Juillet, Août, Octobre et Décembre.
• Mois de 30 jours (4 mois) : Avril, Juin, Septembre et Novembre.
• Mois de 29/28 jours (1 mois) : Février.
*/
import java.util.Scanner;

public class exo15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Month ;

        do {
            System.out.println("Enter Your Month number (1-12) : ");
            Month = scanner.nextInt();
        }while(Month > 12 || Month < 0);

        if (Month == 1 || Month == 3 || Month == 5 || Month == 7 || Month == 8 || Month == 10 || Month == 12) {
            System.out.println("The numbers of days in this Month is : 31");    
        }
        else if (Month == 4 || Month == 6 || Month == 9 || Month == 11){
             System.out.println("The numbers of days in this Month is : 30");   
        }
        else {
             System.out.println("The numbers of days in this Month is : 28/29");  
        }

        scanner.close();
    }
    
}
