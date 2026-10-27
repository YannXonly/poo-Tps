/*Write a program to enter the manufacturing price and the selling price of a product and then
check the profit or loss.
If the manufacturing price is higher than the selling price there is a loss otherwise profit. */
import java.util.Scanner;
public class exo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float Mprice = 0;
        float Sprice = 0;
        float profit = 0;
        System.out.print("Enter Your manufacturing price :");
        Mprice = scanner.nextFloat();
        System.out.print("Enter Your selling price :");
        Sprice = scanner.nextFloat();

        profit = Sprice - Mprice;

        if(profit > 0 ){
            System.out.print("The Profit is : " + profit + "");
        }
        else if (profit == 0 ){
            System.out.print("There is no Profit at all !");
        }
        else {
            System.out.print("The lose is : " + profit + "");
        }
        

        scanner.close();
    }
}
