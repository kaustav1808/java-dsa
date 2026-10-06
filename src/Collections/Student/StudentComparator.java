package Collections.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Compare students based on their grades (higher grade comes first)
        return Double.compare(s2.getStudentScore(), s1.getStudentScore());
    }
}
