package Collections.Employee;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeCollectionTest {

    @Test
    @DisplayName("Add Employee Test")
    public void addStudentTest() {
      EmployeeCollection employeeCollection = new EmployeeCollection();
      employeeCollection.addEmployee(new Employee("1", "John Doe"));
      assertEquals(1, employeeCollection.getEmployeeSize());
    }

    @Test
    @DisplayName("Remove Employee Test")
    public void removeEmployeeTest() {
        EmployeeCollection employeeCollection = new EmployeeCollection();
        employeeCollection.addEmployee(new Employee("1", "John Doe"));
        employeeCollection.addEmployee(new Employee("2", "Jane Smith"));
        employeeCollection.removeEmployee(new Employee("1", "John Doe"));
        assertEquals(1, employeeCollection.getEmployeeSize());
    }

    @Test
    @DisplayName("Employee count test")
    public void employeeCountTest() {
        EmployeeCollection employeeCollection = new EmployeeCollection();
        employeeCollection.addEmployee(new Employee("1", "John Doe"));
        employeeCollection.addEmployee(new Employee("2", "Jane Smith"));
        assertEquals(2, employeeCollection.getEmployeeSize());
    }

    @Test
    @DisplayName("Employee clear test")
    public void employeeClearTest() {
        EmployeeCollection employeeCollection = new EmployeeCollection();
        Employee employee = new Employee("1", "John Doe");
        employeeCollection.addEmployee(employee);
        employeeCollection.clearEmployees();
        assertEquals(0, employeeCollection.getEmployeeSize());
    }
}
