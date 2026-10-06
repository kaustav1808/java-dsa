package Collections.Student;

import java.util.ArrayDeque;

public class StudentDeque {
    ArrayDeque<Student> studentDeque;

    public StudentDeque() {
        studentDeque = new ArrayDeque<Student>();
    }

    public void addStudentFirst(Student student) {
        studentDeque.addFirst(student);
    }

    public void addStudentLast(Student student) {
        studentDeque.addLast(student);
    }

    public Student removeStudentFirst() {
        return studentDeque.removeFirst();
    }

    public Student removeStudentLast() {
        return studentDeque.removeLast();
    }

    public boolean getStudentisEmpty() {
        return studentDeque.isEmpty() ;
    }

    public Student getStudentPeekFirst() {
        return studentDeque.peekFirst();
    }

    public Student getStudentPeekLast() {
        return studentDeque.peekLast();
    }
}
