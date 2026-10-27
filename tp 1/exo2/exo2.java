
/*Write a program to enter the month number and display the total number of days in that month
using a switch case. The total number of days in a month is given in the table below.
• Mois de 31 jours (7 mois) : Janvier, Mars, Mai, Juillet, Août, Octobre et Décembre.
• Mois de 30 jours (4 mois) : Avril, Juin, Septembre et Novembre.
• Mois de 29/28 jours (1 mois) : Février.


*/
import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your month number (1-12) | Enter Your Number of Days in Your Mouth (31/30/29/28):");
        int mois = scanner.nextInt();
        switch (mois) {
            case 1:
                System.out.println("Janvier => 31");
                break;
            case 2:
                System.out.println("Février => 28/29");
                break;
            case 3:
                System.out.println("Mars => 31");
                break;
            case 4:
                System.out.println("Avril => 30");
                break;
            case 5:
                System.out.println("Mai => 31");
                break;
            case 6:
                System.out.println("Juin=> 30");
                break;
            case 7:
                System.out.println("Juillet=> 31");
                break;
            case 8:
                System.out.println("Août => 31");
                break;
            case 9:
                System.out.println("Septembre => 30");
                break;
            case 10:
                System.out.println("Octobre => 31");
                break;
            case 11:
                System.out.println("Novembre => 30");
                break;
            case 12:
                System.out.println("Décembre => 31");
                break;
            /* other cases */
            case 30:
                System.out.println("Avril, Juin, Septembre et Novembre.");
                break;
            case 31:
                System.out.println("Janvier, Mars, Mai, Juillet, Août, Octobre et Décembre.");
            case 28 , 29:
                System.out.println("Février.");
                break;
            default:
                System.out.println("Please Enter A number Between (1-12) !");
        }

        scanner.close();

    }
}
