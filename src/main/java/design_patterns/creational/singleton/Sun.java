package design_patterns.creational.singleton;

public class Sun {
    private static Sun instance;

    private Sun() {
        System.out.println("S-a apelat contructorul Sun");
    }

    public static synchronized Sun getInstance() {
        if (instance == null) {
            synchronized (Sun.class) {
                if (instance == null) {
                    instance = new Sun();
                }
            }
        }
        return instance;
    }
}
