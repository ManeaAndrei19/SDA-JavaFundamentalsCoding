package design_patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Subject smiley = new Subject("Smiley");
        Subject delia = new Subject("Delia");

        Observer andrei = new Observer("Andrei");
        Observer bogdan = new Observer("Bogdan");
        Observer cosmin = new Observer("Cosmin");
        Observer dan = new Observer("Dan");
        Observer elena = new Observer("Elena");
        Observer hater = new Hater("Hater");

        andrei.follow(smiley);
        bogdan.follow(delia);
        cosmin.follow(delia);
        dan.follow(smiley);
        elena.follow(smiley);
        hater.follow(delia);
        System.out.println("#############");

        System.out.println(andrei.getName() + " follows " + andrei.getSubject().getName());
        System.out.println("#############");

        smiley.postUpdate("New song is out");
        System.out.println("#############");
        delia.postUpdate("A concert is coming out");
        System.out.println("#############");

        bogdan.unfollow(delia);

    }
}
