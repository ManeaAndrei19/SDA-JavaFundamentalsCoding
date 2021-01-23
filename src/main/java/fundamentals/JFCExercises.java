package fundamentals;

import java.util.Scanner;

public class JFCExercises {
//   1. Write an application that will read diameter of a circle (variable of type float) and
//    calculate perimeter of given circle.
//            Firstly, assume π = 3.14. Later, use value of π from built-in Math class.

    public void circle() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input diameter: ");
        float diameter = scan.nextFloat();
        float perimeter = (float) Math.PI * diameter;

        System.out.println("The perimeter of the circle is:" + perimeter);
    }


//   2. Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
//    Your application should read two variables: weight (in kilograms, type float) and height
//(in centimeters, type int). BMI should be calculated given following formula:
//    The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal
//    values. Your program should write "BMI optimal" or "BMI not optimal", according to the
//    assumptions above.

    public void BMI() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input weight: ");
        float weight = scan.nextFloat();

        System.out.print("Input height: ");
        int height = scan.nextInt();

        double BMI = weight / (height * height);
        System.out.println("BMI is: " + BMI);

        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("BMI optimal");
        } else {
            System.out.println("BMI not optimal");
        }

    }

//   3. Write a program for solving a quadratic equation. The program should take three integers
//            (coefficients of the quadratic equation a, b, c) and calculate the roots of the
//    equation
//    If delta ∆ comes out negative, print "Delta negative" and exit the program.
//    Formulas youЀll need:


    public void quadratic() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a:");
        int a = scan.nextInt();
        System.out.print("Input b:");
        int b = scan.nextInt();
        System.out.print("Input c:");
        int c = scan.nextInt();

        int delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Delta negative");
        } else {
            System.out.println("X1: " + (-b - Math.sqrt(delta) / (2 * a)) + "\nX2: " + (-b + Math.sqrt(delta) / (2 * a)));
        }
    }

//    4.Write an application that takes a positive number from the user (type int) and writes all
//    numbers from 1 to the given number, each on the next line, with the following changes:
//            ● in place of numbers divisible by 3, instead of a number the program should print "Fizz"
//            ● in place of numbers divisible by 7, instead of a number the program should write
//"Buzz"
//        ● if the number is divisible by both 3 and 7, the program should print "Fizz buzz"

    public void fizzBuzz() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input nr:");
        int nr = scan.nextInt();

        for (int i = 1; i <= nr; i++) {
            if (i % 3 == 0) {
                System.out.print(" Fizz ");
            } else if (i % 7 == 0) {
                System.out.print(" Buzz ");
            } else {
                System.out.print(" " + i + " ");
            }
        }

    }


}
