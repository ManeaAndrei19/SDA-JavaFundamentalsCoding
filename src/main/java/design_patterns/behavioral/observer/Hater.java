package design_patterns.behavioral.observer;

public class Hater extends Observer {
    public Hater(String name) {
        super(name);
    }

    @Override
    public void notifyOfSubjectUpdate() {
        System.out.println("My name is " + name + " and I hate that I got a notification from "
                + subject.getName() + ", and the message is: " + subject.getStatus());

    }
}
