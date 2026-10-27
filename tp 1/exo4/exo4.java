/*Writea programthat:
 Reads astudent’smark (0–20).
 Displays:
o 18–20→“Excellent” */
import java.util.Scanner;

public class exo4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Student's Grade :");
        float note = scanner.nextFloat();
        if(note < 0 || note > 20){
            System.out.println("Eroor The Grade That You Typed is Invalid try again !");
        }
        else if(note < 10 ){
             System.out.println("The Student Got an F");
        }
        else if(note < 13 ){
            System.out.println("The Student Got an D");
        }
        else if (note < 15 ){
            System.out.println("The Student Got an C");
        }
        else if (note < 18) {
            System.out.println("The Student Got an B");
        }
        else{
            System.out.println("The Student Got an A");
        }
        scanner.close();
    }
}
