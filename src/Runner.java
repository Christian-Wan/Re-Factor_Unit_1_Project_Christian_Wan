import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {
        //Creates Scanner
        Scanner s = new Scanner(System.in);


        //Variables to collect user input
        int tip;
        int people;
        double billCost;


        //asks for user input and stores it in the variables from lines 9-11
        System.out.print("Bill: $");
        billCost = Double.parseDouble(s.nextLine());
        System.out.print("Tip (as whole number): ");
        tip = Integer.parseInt(s.nextLine());
        System.out.print("Number of people: ");
        people = Integer.parseInt(s.nextLine());


        //Creates the object that will store the bill
        TipCalculator bill = new TipCalculator(billCost, tip, people);


        //Prints out info
        System.out.print(bill);


    }
}
