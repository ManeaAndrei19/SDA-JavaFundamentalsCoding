package advanced;

import advanced.oop.inheritance.Animal;
import advanced.oop.inheritance.Cat;
import advanced.oop.inheritance.Dog;
import advanced.oop.polymorphism.Circle;
import advanced.oop.polymorphism.GeometricFigure;
import advanced.oop.polymorphism.Square;
import advanced.oop.polymorphism.Triangle;

public class Main {
    public static void main(String[] args) {

//        playWithGeometricFigures();
//        playWithPolymorphism();
//        playWithInheritance();
//        playWithAbstraction();

    }

    /**
     * Inheritance
     */
    public static void playWithInheritance() {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.eat();

        dog.eat();
        dog.bark();

        cat.eat();
        cat.purr();
    }

    /**
     * Abstraction
     */
    public static void playWithAbstraction() {

        advanced.oop.abstraction.Cat catAbs = new advanced.oop.abstraction.Cat();

        catAbs.sleep();
        System.out.println(catAbs.toString());
        catAbs.play();
        System.out.println(catAbs.toString());
        catAbs.feed();
        System.out.println(catAbs.toString());
    }

    /**
     * Polymorphism
     */
    public static void playWithPolymorphism() {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Cat otherCat = new Cat();

        animal.makeSoud();
        dog.makeSoud();
        cat.makeSoud();
        otherCat.purr("Tommy"); //method overloading(static) - compile time polymorphism

        System.out.println("\n###########################\n");

        Animal[] animals = {animal, dog, cat};

        for (Animal element : animals) {
            element.makeSoud(); //method overriding(dynamic) - run time polymorphism
        }


    }

    public static void playWithGeometricFigures() {
        GeometricFigure square = new Square(2);
        GeometricFigure circle = new Circle(5);
        GeometricFigure triangle = new Triangle(5, 7, 9);

        System.out.println("Square perimeter: " + square.calculatePerimeter());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());


    }
}
