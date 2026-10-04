package Collections.Student;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;


public class StudentSetTest {
    @Test
    @DisplayName("Add Student Test hashset")
    public void addStudentTest() {
        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(new Student("1", "John Doe"));
        studentSet.add(new Student("1", "John Doe"));
        assertEquals(1, studentSet.size());
    }

    @Test
    @DisplayName("Add Student Test treeset")
    public void addStudentTest2() {
        Set<Student> studentSet = new TreeSet<Student>();
        studentSet.add(new Student("1", "John Doe"));
        studentSet.add(new Student("1", "John Doe"));
        assertEquals(1, studentSet.size());
    }

    @Test
    @DisplayName("Add Student Test linkedhashset")
    public void addStudentTest3() {
        Set<Student> studentSet = new java.util.LinkedHashSet<>();
        studentSet.add(new Student("1", "John Doe"));
        studentSet.add(new Student("1", "John Doe"));
        assertEquals(1, studentSet.size());
    }
}
