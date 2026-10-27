
import java.util.Scanner;
public class exo7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        char operation;
        System.out.println("Enter Your First Number : ");
        num1 = scanner.nextInt();

        System.out.println("Enter Your Second Number : ");
        num2 = scanner.nextInt();
        do{
            System.out.println("What is the operation that you want to do (+/-/*/%) : ");
            operation = scanner.next().charAt(0);

        }while(operation != '+' && operation != '-' && operation != '*' && operation != '%' );
        if(operation == '%' && num2 == 0){

        System.out.println("retry Enter Your Second Number (no '0') : ");
        num2 = scanner.nextInt();
        }

        if(operation == '+'){
            num3 = num1+num2;
        }
        else if(operation == '-' ){
            num3 = num1-num2;
        }
        else if (operation == '*'){
            num3 = num1*num2;
        }
        else{
            num3 = num1/num2;
        }
        
        System.out.println("Your Result is : " + num3);

        

        scanner.close();

        
    }
}

