package advanced;

import advanced.oop.inheritance.Animal;
import advanced.oop.inheritance.Cat;
import advanced.oop.inheritance.Dog;

public class Main {
    public static void main(String[] args) {
        playWithInheritance();
        playWithAbstraction();

    }

    /** Inheritance
     *
     */
    public static void playWithInheritance(){

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.eat();

        dog.eat();
        dog.bark();

        cat.eat();
        cat.purr();
    }

    /** Abstraction
     *
     */
    public static void playWithAbstraction(){

         advanced.oop.abstraction.Cat catAbs = new advanced.oop.abstraction.Cat();

         catAbs.sleep();
         System.out.println(catAbs.toString());
         catAbs.play();
         System.out.println(catAbs.toString());
         catAbs.feed();
         System.out.println(catAbs.toString());
    }
}
