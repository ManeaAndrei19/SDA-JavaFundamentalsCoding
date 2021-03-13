package advanced_coding.classroom;

import java.time.LocalDate;
import java.util.Date;

public class Trainer extends Person {
    private boolean isAuthorized;

    public Trainer(String firstName, String lastName, LocalDate dateOfBirth, boolean isAuthorized) {
        super(firstName, lastName, dateOfBirth);
        this.isAuthorized = isAuthorized;
    }

    public boolean getIsAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                super.toString() +
                "isAuthorized=" + isAuthorized +
                "}\n";
    }
}
