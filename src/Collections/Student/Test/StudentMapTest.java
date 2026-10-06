package Collections.Student.Test;


import Collections.Student.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

public class StudentMapTest {

    @Test
    @DisplayName("Test hashmap Student")
    public void testStudenthashmap() {
        // Test implementation here
        HashMap<String, Student> studentMap = new HashMap<String, Student>();

        studentMap.put("1", new Student("1", "John Doe"));
        studentMap.put("2", new Student("2", "Jane Doe"));

        assertEquals("John Doe", studentMap.get("1").getStudentName());
        assertEquals("Jane Doe", studentMap.get("2").getStudentName());
    }

    @Test
    @DisplayName("Test treemap Student")
    public void testStudenttreemap() {
        // Test implementation here
        TreeMap<String, Student> studentMap = new TreeMap<String, Student>();

        studentMap.put("1", new Student("1", "John Doe"));
        studentMap.put("2", new Student("2", "Jane Doe"));

        assertEquals("John Doe", studentMap.get("1").getStudentName());
        assertEquals("Jane Doe", studentMap.get("2").getStudentName());
    }

    @Test
    @DisplayName("Test linkedhashmap Student")
    public void testStudentlinkedhashmap() {
        // Test implementation here
        LinkedHashMap<String, Student> studentMap = new LinkedHashMap<>();

        studentMap.put("1", new Student("1", "John Doe"));
        studentMap.put("2", new Student("2", "Jane Doe"));

        assertEquals("John Doe", studentMap.get("1").getStudentName());
        assertEquals("Jane Doe", studentMap.get("2").getStudentName());
    }
}
