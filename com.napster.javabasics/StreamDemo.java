package com.napster.javabasics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<EmployeeOld> employeeList = new ArrayList<>();

        List <EmployeeOld>  sortedEmployeeList = null;
                employeeList.add(EmployeeOld.getInstance(1, "John", 50000,
                                                    "Software Engineer", "IT",
                                                    "Bangalore", "a1@coforge.com",
                                                    "1234567890", "Bangalore",
                                                    "01-01-2020", "01-01-1970",
                        String.valueOf(30), "Single", "O+ve",
                                                    "9876543210", "5 years",
                                                    "B.Tech", "Java, Spring, Hibernate",
                                                    "OCJP", "English, Hindi, Telugu"));
        employeeList.add(EmployeeOld.getInstance(2, "Alice", 60000,
                                                    "Senior Software Engineer", "IT",
                                                    "Bangalore", "", "1234567890",
                                                    "Bangalore", "01-01-2020",
                                                    "01-01-1970", String.valueOf(30), "Single",
                                                    "O+ve", "9876543210", "5 years",
                                                    "B.Tech", "Java, Spring, Hibernate",
                                                    "OCJP", "English, Hindi, Telugu"));
        employeeList.add(EmployeeOld.getInstance(3, "Bob", 70000,
                                                    "Tech Lead", "IT", "Bangalore",
                                                    "", "1234567890", "Bangalore",
                                                    "01-01-2020", "01-01-1970", String.valueOf(30),
                                                    "Single", "O+ve", "9876543210",
                                                    "5 years", "B.Tech", "Java, Spring, Hibernate",
                                                    "OCJP", "English, Hindi, Telugu"));
        employeeList.add(EmployeeOld.getInstance(4, "Charlie", 80000,
                                                    "Project Manager", "IT", "Bangalore",
                                                    "", "1234567890", "Bangalore",
                                                    "01-01-2020", "01-01-1970", String.valueOf(30),
                                                    "Single", "O+ve", "9876543210",
                                                    "5 years", "B.Tech", "Java, Spring, Hibernate",
                                                    "OCJP", "English, Hindi, Telugu"));

                        sortedEmployeeList = employeeList.stream().sorted(Comparator.comparing(EmployeeOld::getEmployeeName)).collect(Collectors.toList());
        System.out.println("Employees sorted by name: "+sortedEmployeeList.listIterator().next().getEmployeeName());
    }
}
