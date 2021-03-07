package design_patterns.good_practices.law_of_demeter;

public class Main {
    public static void main(String[] args) {
        /**Law of Demeter - Don't talk to strangers
         */
        Person john = new Person();

        int someMoneyFromJohn = john.pleaseGiveMeSomeMoney(10);
        System.out.println("Am lu-at de la john " + someMoneyFromJohn);

    }
}
