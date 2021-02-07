package advanced.oop.inheritance;

public class Dog extends Animal {

    public void bark() {
        System.out.println("Ham ham");
    }

    @Override
    public void eat() {
        System.out.println("The Dog is eating.");
    }

    @Override
    public void makeSoud() {
        System.out.println("The Dog is making sound");
    }

}

