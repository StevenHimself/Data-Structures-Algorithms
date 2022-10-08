package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class EmployeeVector {

    public static void main(String[] args) {

        List<Employee> employeeList = new Vector<>(); //good to make assignments to interfaces because they can easily be changed to any
                                                      //implementation without changing code e.g. List -> Vector

        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

    }
}
