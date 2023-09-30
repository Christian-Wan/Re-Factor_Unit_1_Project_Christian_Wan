import java.text.DecimalFormat;
import java.text.Format;


public class TipCalculator {
    //Declares formatter
    Format formatter = new DecimalFormat("#0.00");


    //Declare private variables
    private int tip;
    private int people;
    private double bill;
    private double totalTipAmount;
    private double billAndTip;
    private double tipPerPerson;
    private double totalPerPerson;


    //Methods
    public TipCalculator (double bill, int tip, int people) { //Constructor method
        this.bill = bill;
        this.tip = tip;
        this.people = people;
    }


    public double calculateTip () { //Calculates the tip by itself
        totalTipAmount = Math.round((bill * ((double) tip / 100)) * 100.00) / 100.00;
        return totalTipAmount;
    }


    public double calculateBillAndTip () { //Calculates the cost of bill and tip combined
        billAndTip = Math.round((bill + totalTipAmount) * 100.00) / 100.00;
        return billAndTip;
    }


    public double calculateIndividualTip () { //Calculates the tip for each person
        tipPerPerson =Math.round((totalTipAmount / people) * 100.00) / 100.00;
        return tipPerPerson;
    }


    public double calculateIndividualCost () { //Calculates what each person pays
        totalPerPerson = Math.round((billAndTip / people) * 100.00) / 100.00;
        return totalPerPerson;
    }
    public String toString () { //Converts object into string
        String result;
        result = "The total tip amount is $" + formatter.format(calculateTip());
        result += "\nThe bill including tip is $" + formatter.format(calculateBillAndTip());
        result += "\nThe tip per person is $" + formatter.format(calculateIndividualTip());
        result += "\nThe total per person is $" + formatter.format(calculateIndividualCost());
        return result;
    }
}
