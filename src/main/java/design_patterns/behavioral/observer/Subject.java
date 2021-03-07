package design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String name;
    private String status;
    private List<Observer> followers;

    public Subject(String name) {
        this.name = name;
        this.followers = new ArrayList<>();
    }

    public void addFollower(Observer observer) {
        followers.add(observer);
    }

    public void removeFollower(Observer observer) {
        followers.remove(observer);
    }

    public void postUpdate(String message) {
        this.status = message;
        System.out.println("I'm " + name + ", and I'm posting the following message: " + status);
        for (Observer follower : followers) {
            follower.notifyOfSubjectUpdate();
        }
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public List<Observer> getFollowers() {
        return followers;
    }

}
