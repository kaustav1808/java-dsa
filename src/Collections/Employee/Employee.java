package Collections.Employee;

public class Employee {
    private String empId;
    private String empName;

    Employee(String empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj==null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return empId.equals(employee.empId);
    }

    public int getHashCode() {
        return empId.hashCode();
    }
}
