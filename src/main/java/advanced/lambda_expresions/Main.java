package advanced.lambda_expresions;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(30);

        /** Example without lambda

         Predicate<Person> adultPersonTest = new AdultPersonTest();
         System.out.println(adultPersonTest.test(person));

         */

        /** Lambda expression

         Predicate<Person> adultPersonTest2 = person1 -> person1.getAge() > 18;
         System.out.println(adultPersonTest2.test(person));

         */

        /** Lambda expression - runnable

         Runnable runnable = () -> System.out.println("Running in runnable");
         runnable.run();

         */

        /** Lambda expression - method reference

         Predicate<Person> adultPersonTest3 = Person::isAdultNoParam;
         System.out.println(adultPersonTest3.test(person));

         Predicate<Person> adultPersonTest4 = person::isAdult;
         System.out.println(adultPersonTest4.test(person));

         */

        /** Lambda expression - block of code
         *
         */

        UnaryOperator<Integer> square = i -> {
            int result = i * i;
            return result;
        };
        System.out.println("Result: " + square.apply(100));


    }
}
