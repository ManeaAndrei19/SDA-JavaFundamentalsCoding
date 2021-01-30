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
            if (i % 21 == 0) {
                System.out.print(" FizzBuzz ");
            } else if (i % 7 == 0) {
                System.out.print(" Buzz ");
            } else if (i % 3 == 0) {
                System.out.print(" Fizz ");
            } else {
                System.out.print(" " + i + " ");
            }
        }

    }

//    5. Write an application that takes a positive number from the user (type int) and prints all
//    prime numbers greater than 1 and less than the given number.

    public boolean primeCheck(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean primeCheckBest(int x) {
        if (x == 2) {
            return true;
        }
        if (x < 2 || x % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void primeShow() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input nr:");
        int nr = scan.nextInt();
        while (nr < 2) {
            System.out.print("Number given was lower than 2, please input a new one: ");
            nr = scan.nextInt();
        }

        System.out.print("The prime numbers up to the given number are: ");
        for (int i = 2; i <= nr; i++) {
            if (primeCheckBest(i)) {
                System.out.print(" " + i + " ");
            }
        }

    }

//    6. Write an application that takes a number n from the user (type int) and calculates the
//    sum of the harmonic series from 1 to n, according to the formula below:

    public void harmonicSeries() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input nr:");
        int nr = scan.nextInt();
        while (nr < 1) {
            System.out.print("Number given was negative or equal to 0, please input a new one: ");
            nr = scan.nextInt();
        }

        double H = 0;
        for (double i = 1; i <= nr; i++) {
            H += 1 / i;
        }
        System.out.print("The harmonic series up to the number given is: " + H);
    }

//   7. Write an application that will take a positive number from the user (type int) and
//    calculate the Fibonacci number at the indicated index. For example, if the number equals
//    5, your program should print the fifth Fibonacci number. In Fibonacci sequence, each
//    number is the sum of the two preceding ones. For example, the first few Fibonacci
//    numbers are:
//            1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377…

    public void fibonacci() {
        Scanner scan = new Scanner(System.in);
        int n1 = 1, n2 = 1, n3;

        System.out.print("Input nr:");
        int nr = scan.nextInt();
        while (nr < 1) {
            System.out.print("Number given was negative or equal to 0, please input a new one: ");
            nr = scan.nextInt();
        }

        System.out.print("The Fibonacci series: ");
        if (nr == 1) {
            System.out.print(n1);
        } else if (nr == 2) {
            System.out.print(n1 + " " + n2);
        } else {
            System.out.print(n1 + " " + n2 + " ");
            for (int i = 3; i <= nr; i++) {
                n3 = n1 + n2;
                System.out.print(n3 + " ");
                n1 = n2;
                n2 = n3;
            }
        }
    }


}
