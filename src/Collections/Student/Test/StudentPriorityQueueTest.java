package Collections.Student.Test;

import Collections.Student.Student;
import Collections.Student.StudentPriorityQueue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentPriorityQueueTest {
    @Test
    @DisplayName("Test isEmpty()")
    public void isEmptyTest() {
        StudentPriorityQueue studentPriorityQueue = new StudentPriorityQueue();
        assertTrue(studentPriorityQueue.isEmpty());
    }

    @Test
    @DisplayName("Test add student")
    public void addStudentTest() {
        StudentPriorityQueue studentPriorityQueue = new StudentPriorityQueue();
        Student student = new Student("1", "John Doe");
        studentPriorityQueue.addStudent(student);
        assertFalse(studentPriorityQueue.isEmpty());
        assertEquals(1, studentPriorityQueue.getStudentSize());
    }
}
