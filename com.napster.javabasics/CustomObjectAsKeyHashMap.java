package com.napster.javabasics;

public class CustomObjectAsKeyHashMap {
    public static void main(String[] args) {
        // Create a HashMap with Student objects as keys
        java.util.HashMap<Student, String> studentMap = new java.util.HashMap<>();

        // Create some Student objects
        Student student1 = new Student(1, "Alice", "123 Main St");
        Student student2 = new Student(2, "Bob", "456 Elm St");
        Student student3 = new Student(3, "Sawmi", "456 Elm St");
        // Ensure that the Student class has properly overridden equals() and hashCode()
        // Add students to the map
        studentMap.put(student1, "First Year");
        studentMap.put(student2, "Second Year");
        studentMap.put(student3, "Second Year");

        // Retrieve and print student details
        for (Student student : studentMap.keySet()) {
            System.out.println(student.toString() + ", Year: " + studentMap.get(student));
        }
    }
}
