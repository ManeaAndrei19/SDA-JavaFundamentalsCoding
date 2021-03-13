package advanced_coding;

import advanced_coding.classroom.Group;
import advanced_coding.classroom.Student;
import advanced_coding.classroom.Trainer;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        createClassroom();

        printTrainers();

    }

    private static void printTrainers() {
    }

    private static void createClassroom() {
        //Students
        Student student1 = new Student("Andrei", "Manea1", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student2 = new Student("student2", "Ulcior", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student3 = new Student("student3", "Prosop", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student4 = new Student("student4", "Cana", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student5 = new Student("student5", "Cini", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student6 = new Student("student6", "Mini", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student7 = new Student("student7", "Ini", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student8 = new Student("student8", "Popa", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student9 = new Student("student9", "Pian", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student10 = new Student("student10", "Geana", LocalDate.of(1997, Month.SEPTEMBER, 19), true);

        List<Student> students1 = Arrays.asList(student1, student2, student3);
        List<Student> students2 = Arrays.asList(student4, student5, student6);
        List<Student> students3 = Arrays.asList(student7, student8);
        List<Student> students4 = Arrays.asList(student9, student10);

        //Trainers
        Trainer trainer1 = new Trainer("trainer1", "Ceapa", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Trainer trainer2 = new Trainer("trainer2", "Capra", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Trainer trainer3 = new Trainer("trainer3", "Oala", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        System.out.println(trainer1);

        List<Trainer> trainers = Arrays.asList(trainer1, trainer2, trainer3);

        //Groups
        Group group1 = new Group("group1", trainer1, students1);
        Group group2 = new Group("group2", trainer2, students2);
        Group group3 = new Group("group3", trainer1, students3);
        Group group4 = new Group("group4", trainer3, students4);

        List<Group> groups = Arrays.asList(group1, group2, group3, group4);
        System.out.println(group1);
    }
}
