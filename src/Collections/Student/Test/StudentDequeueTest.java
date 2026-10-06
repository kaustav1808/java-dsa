package Collections.Student.Test;

import Collections.Student.Student;
import Collections.Student.StudentDeque;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class StudentDequeueTest {
   @Test
   @DisplayName("Test Student Dequeue add first")
    public void testStudentDequeueAddFirst() {
       StudentDeque studentDeque = new StudentDeque();
       studentDeque.addStudentFirst(new Collections.Student.Student("1", "John Doe"));
       studentDeque.addStudentFirst(new Collections.Student.Student("2", "Jane Doe"));

       assertTrue(studentDeque.getStudentPeekFirst().getStudentId().equals("2"));
       assertTrue(studentDeque.getStudentPeekLast().getStudentId().equals("1"));
    }

    @Test
    @DisplayName("Test Student Dequeue add last")
    public void testStudentDequeueAddLast() {
        StudentDeque studentDeque = new StudentDeque();
        studentDeque.addStudentFirst(new Collections.Student.Student("1", "John Doe"));
        studentDeque.addStudentLast(new Collections.Student.Student("2", "Jane Doe"));

        assertTrue(studentDeque.getStudentPeekFirst().getStudentId().equals("1"));
        assertTrue(studentDeque.getStudentPeekLast().getStudentId().equals("2"));
    }

    @Test
    @DisplayName("Test Student Dequeue remove first")
    public void testStudentDequeueRemoveFirst() {
        StudentDeque studentDeque = new StudentDeque();
        studentDeque.addStudentFirst(new Collections.Student.Student("1", "John Doe"));
        studentDeque.addStudentFirst(new Collections.Student.Student("2", "Jane Doe"));

        Student removedStudent = studentDeque.removeStudentFirst();
        assertTrue(removedStudent.getStudentId().equals("2"));
        assertTrue(studentDeque.getStudentPeekFirst().getStudentId().equals("1"));
    }

    @Test
    @DisplayName("Test Student Dequeue remove last")
    public void testStudentDequeueRemoveLast() {
        StudentDeque studentDeque = new StudentDeque();
        studentDeque.addStudentFirst(new Collections.Student.Student("1", "John Doe"));
        studentDeque.addStudentFirst(new Collections.Student.Student("2", "Jane Doe"));

        Student removedStudent = studentDeque.removeStudentLast();
        assertTrue(removedStudent.getStudentId().equals("1"));
        assertTrue(studentDeque.getStudentPeekFirst().getStudentId().equals("2"));
    }
}
