package Collections.Employee;

import java.util.ArrayList;
import java.util.Collection;

public class EmployeeCollection {
    private Collection<Employee> employees;

    EmployeeCollection() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    public void printEmployees() {
        StringBuilder str = new StringBuilder();
        for(Employee employee : employees) {
            str.append("Employee ID: ").append(employee.getEmpId()).append(", Employee Name: ").append(employee.getEmpName()).append("\n");
        }
        System.out.println(str.toString());
    }

    public int getEmployeeSize() {
        return this.employees.size();
    }

    public void clearEmployees() {
        this.employees.clear();
    }
}
