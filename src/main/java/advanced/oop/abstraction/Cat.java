package advanced.oop.abstraction;

public class Cat {
    private int mood;
    private int energy;
    private int hungry;

    @Override
    public String toString() {
        return "Cat{" +
                "mood=" + mood +
                ", energy=" + energy +
                ", hungry=" + hungry +
                '}';
    }

    private void meow() {
        System.out.println("Meow!");
    }

    public void sleep() {
        this.hungry++;
        this.energy++;
    }

    public void play() {
        mood++;
        energy--;
        meow();
    }

    public void feed() {
        hungry--;
        mood++;
        meow();
    }
}
