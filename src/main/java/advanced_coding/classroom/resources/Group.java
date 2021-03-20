package advanced_coding.classroom.resources;

import java.util.Set;

public class Group {
    private String name;
    private Trainer trainer;
    private Set<Student> students;

    public Group(String name, Trainer trainer, Set<Student> students) {
        this.name = name;
        this.trainer = trainer;
        if (students.size() <= 5) {
            this.students = students;
        } else {
            throw new MaximumNumberOfStudentsException("Student limit exceeded");
        }
    }

    public String getName() {
        return name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public Set<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", trainer=" + trainer +
                ", students=" + students +
                '}';
    }
}
