package Zadanie5;

import java.util.HashMap;

public class EmployeeList {
    public static void main(String[] args) {

        HashMap<String, Integer> employeeSalaryOld = new HashMap<>();
        employeeSalaryOld.put("Tom Cat", 300);
        employeeSalaryOld.put("Bill Dog", 400);
        employeeSalaryOld.put("Jenny Bird", 500);
        employeeSalaryOld.put("John Snake", 600);
        employeeSalaryOld.put("Eva Fish", 700);
        System.out.println(employeeSalaryOld);
    }
}
