package advanced.nested;

public class Bicycle {
    private Integer maxSpeed = 100;

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public class Wheel {
        public void repair() {
            maxSpeed += 10;
        }
    }

    public static class Mechanic {
        public void damage(Bicycle bicycle) {
            bicycle.maxSpeed -= 50;
        }
    }


}
