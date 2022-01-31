package Zadanie5;

import java.util.*;
import java.util.HashMap;

public class Team {

    private List<Employee> employees = new ArrayList<>();
    private Map<String, List<Employee>> employeeSalary = new HashMap<String, List<Employee>>();

    Scanner scanner = new Scanner(System.in);

    public void addEmployee()
    {
        System.out.println("Podaj imię i nazwisko pracownika");
        String name  = scanner.nextLine();

        System.out.println("wynagordzenie");
        String salary = String.valueOf(scanner.nextInt());

        Employee employee = new Employee(name, salary);
        employees.add(employee);
        employeeSalary.put(salary, employees);

    }
    public void getAllinformations(){
        for (Employee employee : employees){
            employee.getAllData();
            System.out.println();
        }
    }
    public void sumSalary(){
        sumSalary();
    }
}
