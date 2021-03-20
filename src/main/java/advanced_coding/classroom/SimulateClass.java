package advanced_coding.classroom;

import advanced_coding.classroom.resources.Group;
import advanced_coding.classroom.resources.Student;
import advanced_coding.classroom.resources.Trainer;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class SimulateClass {

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
        displayMaxStudentGroupClassicMethod();

        displayAllMaxStudentGroupClassicMethod();
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

        students = new LinkedHashSet<Student>();
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

        students1 = new LinkedHashSet<Student>();
        students1.add(student1);
        students1.add(student2);
        students1.add(student3);

        students2 = new LinkedHashSet<Student>();
        students2.add(student4);
        students2.add(student5);
        students2.add(student6);

        students3 = new LinkedHashSet<Student>();
        students3.add(student7);
        students3.add(student8);

        students4 = new LinkedHashSet<Student>();
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
        group1 = new Group("Groupe Nr1", trainer1, students1);
        group2 = new Group("Groupe Nr2", trainer2, students2);
        group3 = new Group("Groupe Nr3", trainer1, students3);
        group4 = new Group("Groupe Nr4", trainer3, students4);

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
                .forEach(student -> System.out.print(student));
    }

    private static void displayMaxStudentGroupFunctionalMethod() {
        System.out.println("##########Largest Student Group Functional Method##########");
//        groups.stream()
//                .sorted(Comparator.comparing(group -> group.getStudents().size()));
    }

    private static void displayMaxStudentGroupClassicMethod() {
        System.out.println("##########Largest Student Group Classic Method##########");
        Group aux = new Group(null, null, new LinkedHashSet());
        for (Group group : groups) {
            if (group.getStudents().size() > aux.getStudents().size()) {
                aux = group;
            }
        }
        System.out.println(aux.getName());
    }

    private static void displayAllMaxStudentGroupClassicMethod() {
        System.out.println("##########All Largest Student Group Classic Method##########");
        Group aux = new Group(null, null, new LinkedHashSet());
        List<Group> maxGroups = new ArrayList<>();
        for (Group group : groups) {
            if (group.getStudents().size() > aux.getStudents().size()) {
                aux = group;
                maxGroups = new ArrayList<>();
                maxGroups.add(group);
            } else if (group.getStudents().size() == aux.getStudents().size()) {
                maxGroups.add(group);
            }
        }
        System.out.println(maxGroups);
    }

    public static List<Group> getAllGroupsWithMaxNumberOfStudents(List<Group> groupList) {
        List<Group> maxGroupList = new ArrayList<>();
        Group maxGroup = new Group(null, null, new LinkedHashSet<>());
        for (Group element : groupList) {
            if (element.getStudents().size() > maxGroup.getStudents().size()) {
                maxGroup = element;
                maxGroupList = new ArrayList<>();
                maxGroupList.add(element);
            } else if (element.getStudents().size() == maxGroup.getStudents().size()) {
                maxGroupList.add(element);
            }
        }
        return maxGroupList;
    }

}
