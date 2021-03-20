package advanced_coding.classroom.resources;

import java.time.LocalDate;

public class Student extends Person {
    private boolean hasPreviousJavaKnowledge;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, boolean hasPreviousJavaKnowledge) {
        super(firstName, lastName, dateOfBirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
        super.toString();
    }

    public boolean getHasPreviousJavaKnowledge() {
        return hasPreviousJavaKnowledge;
    }

    public void setHasPreviousJavaKnowledge(boolean hasPreviousJavaKnowledge) {
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "hasPreviousJavaKnowledge=" + hasPreviousJavaKnowledge +
                "}\n";
    }
}
