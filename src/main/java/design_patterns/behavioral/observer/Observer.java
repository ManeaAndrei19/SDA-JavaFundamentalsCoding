package design_patterns.behavioral.observer;

public class Observer {

    protected String name;
    protected Subject subject;

    public Observer(String name) {
        this.name = name;
    }

    public void follow(Subject subject) {
        this.subject = subject;
        subject.addFollower(this);
        System.out.println(name + " follows " + subject.getName());
    }

    public void unfollow(Subject subject) {
        this.subject=null;
        subject.removeFollower(this);
        System.out.println(name + " no longer follows " + subject.getName());
    }

    public void notifyOfSubjectUpdate() {
        System.out.println("My name is " + name + " and I got a notification from "
                + subject.getName() + ", and the message is: " + subject.getStatus());
    }

    public String getName() {
        return name;
    }

    public Subject getSubject() {
        return subject;
    }

}
