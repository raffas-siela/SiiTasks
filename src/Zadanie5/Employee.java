package Zadanie5;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, String salary){
        this.name = name;

    }

    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void getAllData(){
        System.out.println("Name and surname: " + name);
        System.out.println("Salary: " + salary);
    }
}