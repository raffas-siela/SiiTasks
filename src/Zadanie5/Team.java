package Zadanie5;

import java.util.*;
import java.util.HashMap;

public class Team {

    private List<Employee> employees = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Employee> salary = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addEmployee()
    {
        System.out.println("first name: ");
        String firstName = scanner.nextLine();

        System.out.println("second name");
        String secondName = scanner.nextLine();

        System.out.println("salary: ");
        int salary = Integer.valueOf(scanner.nextLine());



        Employee employee = new Employee(firstName, secondName, salary);
        meals.add(secondName);
        this.salary.put(salary, employee);
        employees.add(employee);

    }

    public void displayMeals()
    {
        for (String meal : meals)
        {
            System.out.println(meal);
        }
    }
   /* public void displayEmployeeBySalary()
    {
        System.out.println("Podaj wynagrodzenie");
        Integer salary = Integer.valueOf(scanner.nextLine());
        Employee employee = salary.get(salary);
        employee.getAllData();
    }*/

    public void displayEmployee()
    {
        for (Employee employee : employees)
        {
            employee.getAllData();
            //pusta linia pomiędzy osobami wyśwetlonymi
            System.out.println();
        }
    }
}
