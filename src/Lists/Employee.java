package Lists;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;
    private int id;

    public Employee(String firstName, String lastName, int id) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Jane", "Jones",123));
        employeeList.add(new Employee("John","Doe",4567));
        employeeList.add(new Employee("Mary","Smith",22));
        employeeList.add(new Employee("Mike","Wilson",3245));

        System.out.println("Initial employee list:");
        employeeList.forEach(employee -> System.out.println(employee)); //prints out each employee in employeeList

        System.out.println(employeeList.get(1)); //prints out second employee

        System.out.println("\nIs employeeList empty?");
        System.out.println(employeeList.isEmpty()); //check if list is empty

        System.out.println("\nReplacing employee at index 1 with new employee John Adams with id 4568");
        employeeList.set(1, new Employee("John", "Adams", 4568)); //replacing employee at index 1 with new employee

        employeeList.forEach(employee -> System.out.println(employee)); //prints out each employee in employeeList

        System.out.println("\nSize of list:");
        System.out.println(employeeList.size()); //current size of list

        employeeList.add(3, new Employee("John", "Doe", 4567)); //adds employee at the end of the list and shifts the original 4th employee

        System.out.println("\nAdded new employee John Doe with ID 4567 in index 3:");
        employeeList.forEach(employee -> System.out.println(employee)); //prints out each employee in employeeList

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]); //gives us the backing array specifying of employee type

        System.out.println("\nPrint out new Employee Array:");
        for(Employee employee : employeeArray) {
            System.out.println(employee);
        }

        System.out.println("\nDoes List contain Mary Smith id: 22?");
        System.out.println(employeeList.contains(new Employee("Mary","Smith",22))); //Check if Mary Smith is in the list. Returns false (different instance)

        System.out.println("\nWhat is the index of John Doe?");
        System.out.println(employeeList.indexOf(new Employee("John","Doe",4567)));

        System.out.println("\nRemoving third employee Mary Smith");
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));


    }

}
