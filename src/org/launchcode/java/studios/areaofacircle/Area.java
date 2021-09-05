package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
        System.out.println(radius);
        input.close();

       // System.out.println("Width of rectangle is:");
       // Double width = input.nextDouble();

      //  Double area = (radius * radius) * 3.14;
        Double area = Circle.getArea(radius);

        System.out.println("Area of a circle of radius " + radius + " is: " +  area);


    }//end of main method
}//end of area class


