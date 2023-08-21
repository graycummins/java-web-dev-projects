package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double circleArea;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the circle radius");
        radius = input.nextDouble();
        input.close();

        circleArea = Circle.getArea(radius);

        System.out.println("The area is: " +circleArea);
    }
}
