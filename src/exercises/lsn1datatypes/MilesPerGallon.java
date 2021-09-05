package exercises.lsn1datatypes;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Number of miles driven:");
        Double milesDriven = input.nextDouble();

        System.out.println("Amount of gallons of gas consumed:");
        Double galGasUsed = input.nextDouble();

        Double mpg = milesDriven / galGasUsed;

        System.out.println("Your miles per gallon is " + mpg);
    }

}
