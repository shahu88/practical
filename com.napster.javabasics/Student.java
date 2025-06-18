package com.napster.javabasics;

import java.util.Objects;

public class Student {

    int studentId;
    String studentName;
    String studentAddress;

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
    public Student() {
        // Default constructor
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String  toString() {
        return "Student ID: " + studentId + ", Name: " + studentName + ", Address: " + studentAddress;
    }

    @Override
    public int hashCode(){
        return Objects.hash(studentId);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;
        return studentId == student.studentId &&
               Objects.equals(studentName, student.studentName) &&
               Objects.equals(studentAddress, student.studentAddress);
    }
}
