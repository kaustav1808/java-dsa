package Collections.Student;

import java.util.PriorityQueue;

public class StudentPriorityQueue  {
    private PriorityQueue<Student> studentQueue;

    public StudentPriorityQueue() {
        studentQueue = new PriorityQueue<>(new StudentComparator());
    }

    public void addStudent(Student student) {
        studentQueue.add(student);
    }

    public Student removeStudent() {
        return studentQueue.poll();
    }

    public int getStudentSize() {
        return studentQueue.size();
    }

    public boolean isEmpty() {
        return studentQueue.isEmpty();
    }

    public Student getPeekStudent() {
        return studentQueue.peek();
    }
}
