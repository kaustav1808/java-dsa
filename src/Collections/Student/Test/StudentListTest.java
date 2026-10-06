package Collections.Student.Test;

import Collections.Student.Student;
import Collections.Student.StudentList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class StudentListTest {
    @Test
    @DisplayName("Test to check if the StudentList as arrayList class is working correctly")
    public void testStudentList() {
        StudentList studentList = new StudentList(new ArrayList<>());
        Student student1 = new Student("1", "John Doe");
        Student student2 = new Student("2", "Jane Doe");

        studentList.addStudent(student1);
        studentList.addStudent(student2);

        assertEquals(2, studentList.size());
    }

    @Test
    @DisplayName("Test to check if the StudentList as linkedlist class is working correctly")
    public void testStudentList2() {
        StudentList studentList = new StudentList(new LinkedList<>());
        Student student1 = new Student("1", "John Doe");
        Student student2 = new Student("2", "Jane Doe");

        studentList.addStudent(student1);
        studentList.addStudent(student2);

        assertEquals(2, studentList.size());
    }

    @Test
    @DisplayName("Test to check if the StudentList as vector class is working correctly")
    public void testStudentList3() {
        StudentList studentList = new StudentList(new Vector<>());
        Student student1 = new Student("1", "John Doe");
        Student student2 = new Student("2", "Jane Doe");

        studentList.addStudent(student1);
        studentList.addStudent(student2);

        assertEquals(2, studentList.size());
    }

    @Test
    @DisplayName("Test to check if the StudentList as stack class is working correctly")
    public void testStudentList4() {
        StudentList studentList = new StudentList(new Stack<>());
        Student student1 = new Student("1", "John Doe");
        Student student2 = new Student("2", "Jane Doe");

        studentList.addStudent(student1);
        studentList.addStudent(student2);

        assertEquals(2, studentList.size());
    }
}
