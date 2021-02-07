package advanced.oop.inheritance;

public class Cat extends Animal {

    public void purr() {
        System.out.println("The cat is purring");
    }

    public void purr(String name) {
        System.out.println("The cat " + name + " is purring");
    }

    @Override
    public void eat() {
        System.out.println("The Cat is eating.");
    }

    @Override
    public void makeSoud() {
        System.out.println("The Cat is making sound");

    }
}
