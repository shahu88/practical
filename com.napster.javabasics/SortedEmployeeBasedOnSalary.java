package com.napster.javabasics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import com.napster.javabasics.Emp;


public class SortedEmployeeBasedOnSalary {
    public static void main( String args[]){
        List<Emp> employees = new ArrayList<>();

        employees.add(new Emp("Ram", 20000, "Male"));
        employees.add(new Emp("Nita", 20000, "Female"));
        employees.add(new Emp("Rima", 20000, "Female"));
        employees.add(new Emp("Ram", 20000, "Male"));

        // Sort by name in descending order
        List<Emp> sortedByNameAndSalaryDesc = employees.stream()
                .sorted(Comparator.comparing(Emp::getName).reversed()
                        .thenComparing(Comparator.comparingDouble(Emp::getSalary).reversed()))
                .collect(Collectors.toList());

        System.out.println("Sorted by Name and Salary (Descending):");
        sortedByNameAndSalaryDesc.forEach(System.out::println);

        // Sort by gender
        List<Emp> sortedByGender = employees.stream()
                .sorted(Comparator.comparing(Emp::getGender))
                .collect(Collectors.toList());
        System.out.println("Sorted by Gender:");
        sortedByGender.forEach(System.out::println);



    }
}