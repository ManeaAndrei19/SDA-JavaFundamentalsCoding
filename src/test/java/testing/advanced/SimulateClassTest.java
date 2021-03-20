package testing.advanced;

import advanced_coding.classroom.SimulateClass;
import advanced_coding.classroom.resources.Group;
import advanced_coding.classroom.resources.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SimulateClassTest {

    @Test
    void getAllGroupsWithMaxNumberOfStudentsTest() {
        //Given
        Student student1 = new Student("student1", "Ulcior1", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Student student2 = new Student("student2", "Ulcior2", LocalDate.of(1997, Month.SEPTEMBER, 19), true);
        Set<Student> students1 = new LinkedHashSet<Student>();
        students1.add(student1);
        students1.add(student2);

        Group group1 = new Group("group1", null, students1);
        Group group2 = new Group("group2", null, students1);
        List<Group> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        //Then
        Assertions.assertEquals(2,SimulateClass.getAllGroupsWithMaxNumberOfStudents(groups).size());
    }
}
