package com.syntax.class29.tasks;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        //Create a Map that will store Employee name and salary.
        // Write a logic to retrieve an employee who gets the highest salary.
        // Output should be in the below format
//John Smith=$100000
        HashMap<String,Integer> employeeMap=new HashMap<>();
        employeeMap.put("Jon",120000);
        employeeMap.put("Jane",130000);
        employeeMap.put("John",110000);
        employeeMap.put("Smith",110000);
        String maxSalaryEmpName="";
        int maxSalary=0;

        int sum=0;
        for (Map.Entry<String,Integer> emp:employeeMap.entrySet()
             ) {
            sum=sum+emp.getValue();
            if(emp.getValue()>maxSalary){
                maxSalary=emp.getValue();
                maxSalaryEmpName=emp.getKey();
            }

        }

        System.out.println(maxSalaryEmpName+" =$"+maxSalary+" "+sum);

    }
}
