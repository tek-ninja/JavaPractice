import java.util.*;
import java.util.stream.Collectors;

public class GroupingBy {
    void main() {
        List<Employee> employeeList = Arrays.asList(new Employee(500, "eng"),
                new Employee(800, "eng"),
                new Employee(700, "eng"),
                new Employee(600, "eng"),
                new Employee(900, "sales"),
                new Employee(100000, "sales")
        );
        Map<String, Double> depart =
                employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)));

        for (Map.Entry<String, Double> entry : depart.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value " + entry.getValue());
        }

        Map<String, Optional<Employee>> highestPaidEmployee = employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDepartment
                        , Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
        );
        for (Map.Entry<String, Optional<Employee>> emp : highestPaidEmployee.entrySet()) {
            System.out.println("Key :" + emp.getKey() + " Value " + emp.getValue().get());
        }
        var employees = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employees);
    }
}

class Employee {
    int salary;
    String department;

    public Employee(int salary, String department) {
        this.salary = salary;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
