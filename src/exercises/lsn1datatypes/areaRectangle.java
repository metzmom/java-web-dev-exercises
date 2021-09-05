package exercises.lsn1datatypes;;
import java.util.Scanner;
public class areaRectangle<input> {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Length of rectangle is:");
        Double length = input.nextDouble();

        System.out.println("Width of rectangle is:");
        Double width = input.nextDouble();

        Double area = length * width;

        System.out.println("Area of rectangle is " + area );

        //System.out.println("Width of rectangle is: ");

     //  length = input.nextDouble();
      // width = input.nextDouble();
       }
}
