/*Write a program to enter a letter of the alphabet and check whether it is a vowel or a consonant
using the switch case.
The letters a,e,i,o, and u in both lowercase and uppercase are called vowels. The other letters are
consonants. */

import java.util.Scanner;

public class exo5 {
    public static void main (String[] args){
        char[] vowels  = {'a','i','u','o','y','e'};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Letter : ");
        char letter = scanner.next().toLowerCase().charAt(0);
        boolean found = false ;
        for (int i = 0; i < 6 ; i++){
            if(letter == vowels[i]){
                found = true;
            }
        }
        switch(found ? 0 :1 ){
            case 0 : 
      
                System.out.println("La lettre '" + letter + "' est une voyelle.");
                break;
            case 1 : 
             System.out.println("La lettre '" + letter + "' n'est pas une voyelle.");
                break;
        
        }
        scanner.close();


    }
}
