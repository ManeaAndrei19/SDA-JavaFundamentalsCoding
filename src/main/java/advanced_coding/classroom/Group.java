package advanced_coding.classroom;

import java.util.List;

public class Group {
    private String name;
    private Trainer trainer;
    private List<Student> students;

    public Group(String name, Trainer trainer, List<Student> students) {
        this.name = name;
        this.trainer = trainer;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + "\n" +
                ", trainer=" + trainer +
                ", students=" + students +
                '}';
    }
}
