package Zadanie5;

public class Employee {
    private String firstName;
    private String secondName;
    private Integer salary;

    public Employee(String firstName, String secondName, int salary){
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getSecondName(){
        return secondName;
    }

    public int getSalary(){
        return salary;
    }
    public void getAllData(){
        System.out.println("Name and surname: " + firstName + secondName);
        System.out.println("Salary: " + salary);
    }
}