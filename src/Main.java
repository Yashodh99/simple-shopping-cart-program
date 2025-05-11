
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //Scanner object for read user input data

        Scanner sc =new Scanner(System.in);


        //Declaring variables

        String food;
        double price;
        int quantity;
        char money = '$';

        System.out.print("What item would you like to buy?: ");
        food = sc.nextLine();

        System.out.print("What is the price for each?: ");
        price = sc.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = sc.nextInt();

        System.out.print("You have bought " + quantity + " " +food+ "/s");

        double amount = price * quantity;

        System.out.print("\nYour total is " +money+ " " + amount);

        //Closing Scanner
        sc.close();
    }


}
