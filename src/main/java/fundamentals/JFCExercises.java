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


//    Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
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


}
