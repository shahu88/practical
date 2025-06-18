package com.napster.javabasics;

public class Emp {



    private String name;
    private double salary;

    private String gender;

    public Emp(String name, double salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary=" + salary + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


}
