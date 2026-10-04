package Collections.Student;

import java.util.List;

public class StudentList {
    private List<Student> studentList;

    public StudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student removeStudent(Student student) {
        studentList.remove(student);
        return student;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public boolean contains(Student student) {
        return studentList.contains(student);
    }

    public int size() {
        return studentList.size();
    }
}
