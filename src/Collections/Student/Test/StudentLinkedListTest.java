package Collections.Student.Test;

import Collections.Student.Student;
import Collections.Student.StudentLinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentLinkedListTest {
    @Test()
    @DisplayName("Test to check if the StudentLinkedList is add student correctly")
    public void testStudentLinkedListAdd() {
        StudentLinkedList studentLinkedList = new StudentLinkedList();
        Student student1 = new Student("1", "John Doe");
        Student student2 = new Student("2", "Jane Doe");

        studentLinkedList.addStudent(student1);
        studentLinkedList.addStudent(student2);

        assertEquals(2, studentLinkedList.getSize());
    }

    @Test()
    @DisplayName("Test to check if the StudentLinkedList is remove student correctly")
    public void testStudentLinkedListRemove() {
        StudentLinkedList studentLinkedList = new StudentLinkedList();
        Student student1 = new Student("1", "John Doe");
        Student student2 = new Student("2", "Jane Doe");

        studentLinkedList.addStudent(student1);
        studentLinkedList.addStudent(student2);

        Student removedStudent = studentLinkedList.removeStudent();
        assertEquals(1, studentLinkedList.getSize());
        assertEquals(student1, removedStudent);
    }
}
