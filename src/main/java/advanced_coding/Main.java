package advanced_coding;

import advanced_coding.classroom.Group;
import advanced_coding.classroom.MaximumNumberOfStudentsException;
import advanced_coding.classroom.Student;
import advanced_coding.classroom.Trainer;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static Set<Student> students;
    private static List<Trainer> trainers;
    private static List<Group> groups;
    private static Set<Student> students1, students2, students3, students4;
    private static Trainer trainer1, trainer2, trainer3;
    private static Group group1, group2, group3, group4;


    public static void main(String[] args) {
        createClassroom();

        printStudents();
        printTrainers();
        printGroups();

        displayStudentsAlphabeticallyByLastName();
    }

    private static void createClassroom() {
        /**
         * Students
         */
        addStudents();

        /**
         * Trainers
         */
        addTrainers();

        /**
         * Groups
         */
        addGroups();
    }

    private static void addStudents() {
        Student student1 = new Student("Andrei", "Manea1", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student2 = new Student("student2", "Ulcior", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student3 = new Student("student3", "Prosop", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student4 = new Student("student4", "Cana", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student5 = new Student("student5", "Aaa", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student6 = new Student("student6", "Mini", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student7 = new Student("student7", "Ini", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student8 = new Student("student8", "Popa", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student9 = new Student("student9", "Pian", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student10 = new Student("student10", "Geana", LocalDate.of(1997, Month.SEPTEMBER, 19), true);

        students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);

        students1 = new HashSet<Student>();
        students1.add(student1);
        students1.add(student2);
        students1.add(student3);

        students2 = new HashSet<Student>();
        students2.add(student4);
        students2.add(student5);
        students2.add(student6);

        students3 = new HashSet<Student>();
        students3.add(student7);
        students3.add(student8);

        students4 = new HashSet<Student>();
        students4.add(student9);
        students4.add(student10);
    }

    private static void addTrainers() {
        trainer1 = new Trainer("trainer1", "Ceapa", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        trainer2 = new Trainer("trainer2", "Capra", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        trainer3 = new Trainer("trainer3", "Oala", LocalDate.of(1997, Month.SEPTEMBER, 19), true);

        trainers = Arrays.asList(trainer1, trainer2, trainer3);
    }

    private static void addGroups() {
        group1 = new Group(trainer1, students1);
        group2 = new Group(trainer2, students2);
        group3 = new Group(trainer1, students3);
        group4 = new Group(trainer3, students4);

        groups = Arrays.asList(group1, group2, group3, group4);
    }

    private static void printStudents() {
        System.out.println("##########Students##########");
        System.out.println(students);
    }

    private static void printTrainers() {
        System.out.println("##########Trainers##########");
        System.out.println(trainers);
    }

    private static void printGroups() {
        System.out.println("##########Groups##########");
        System.out.println(groups);
    }

    private static void displayStudentsAlphabeticallyByLastName() {
        System.out.println("##########Students Alphabetically By Last Name##########");
        students.stream()
                .sorted(Comparator.comparing(student -> student.getLastName()))
                .forEach(student -> System.out.println(student));
    }

}
