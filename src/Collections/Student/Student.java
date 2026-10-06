package Collections.Student;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private Double score;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(String id, String name, Double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    public String getStudentId() {
        return id;
    }

    public String getStudentName() {
        return name;
    }

    public Double getStudentScore() { return score; }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj==null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
