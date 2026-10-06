package Collections.Student;

import java.util.LinkedList;

public class StudentLinkedList {
    private LinkedList<Student> studentList;

    public StudentLinkedList() {
        this.studentList = new LinkedList<Student>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student removeStudent() {
        if(isEmpty()){
            return null;
        }
        return studentList.remove();
    }

    public boolean isEmpty() {
        return studentList.isEmpty();
    }

    public int getSize() {
        return studentList.size();
    }

    public Student getStudent(int index) {
        if (index<0 || index>= studentList.size()){
            return null;
        }else{
            return studentList.get(index);
        }
    }
}
