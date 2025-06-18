package com.napster.javabasics;

public class EmployeeOld {
    private static EmployeeOld employee;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    private int employeeId;
    protected String employeeName;
    private double employeeSalary;
    private String employeeDesignation;
    private String employeeDepartment;
    private String employeeLocation;
    private String employeeEmail;
    private String employeePhone;
    private String employeeAddress;
    private String employeeDateOfJoining;
    private String employeeDateOfBirth;
    private String employeeGender;
    private String employeeMaritalStatus;
    private String employeeBloodGroup;
    private String employeeEmergencyContact;
    private String employeeExperience;
    private String employeeQualification;
    private String employeeSkills;
    private String employeeCertifications;

    public String getEmployeeLanguages() {
        return employeeLanguages;
    }

    public void setEmployeeLanguages(String employeeLanguages) {
        this.employeeLanguages = employeeLanguages;
    }

    private String employeeLanguages;

    public static EmployeeOld getEmployee() {
        return employee;
    }

    public static void setEmployee(EmployeeOld employee) {
        EmployeeOld.employee = employee;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public String getEmployeeLocation() {
        return employeeLocation;
    }

    public void setEmployeeLocation(String employeeLocation) {
        this.employeeLocation = employeeLocation;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeDateOfJoining() {
        return employeeDateOfJoining;
    }

    public void setEmployeeDateOfJoining(String employeeDateOfJoining) {
        this.employeeDateOfJoining = employeeDateOfJoining;
    }

    public String getEmployeeDateOfBirth() {
        return employeeDateOfBirth;
    }

    public void setEmployeeDateOfBirth(String employeeDateOfBirth) {
        this.employeeDateOfBirth = employeeDateOfBirth;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeMaritalStatus() {
        return employeeMaritalStatus;
    }

    public void setEmployeeMaritalStatus(String employeeMaritalStatus) {
        this.employeeMaritalStatus = employeeMaritalStatus;
    }

    public String getEmployeeBloodGroup() {
        return employeeBloodGroup;
    }

    public void setEmployeeBloodGroup(String employeeBloodGroup) {
        this.employeeBloodGroup = employeeBloodGroup;
    }

    public String getEmployeeEmergencyContact() {
        return employeeEmergencyContact;
    }

    public void setEmployeeEmergencyContact(String employeeEmergencyContact) {
        this.employeeEmergencyContact = employeeEmergencyContact;
    }

    public String getEmployeeExperience() {
        return employeeExperience;
    }

    public void setEmployeeExperience(String employeeExperience) {
        this.employeeExperience = employeeExperience;
    }

    public String getEmployeeQualification() {
        return employeeQualification;
    }

    public void setEmployeeQualification(String employeeQualification) {
        this.employeeQualification = employeeQualification;
    }

    public String getEmployeeSkills() {
        return employeeSkills;
    }

    public void setEmployeeSkills(String employeeSkills) {
        this.employeeSkills = employeeSkills;
    }

    public String getEmployeeCertifications() {
        return employeeCertifications;
    }

    public void setEmployeeCertifications(String employeeCertifications) {
        this.employeeCertifications = employeeCertifications;
    }

    private EmployeeOld(int employeeId, String employeeName, double employeeSalary, String employeeDesignation, String employeeDepartment, String employeeLocation, String employeeEmail, String employeePhone, String employeeAddress, String employeeDateOfJoining, String employeeDateOfBirth, String employeeGender, String employeeMaritalStatus, String employeeBloodGroup, String employeeEmergencyContact, String employeeExperience, String employeeQualification, String employeeSkills, String employeeCertifications, String employeeLanguages) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeDesignation = employeeDesignation;
        this.employeeDepartment = employeeDepartment;
        this.employeeLocation = employeeLocation;
        this.employeeEmail = employeeEmail;
        this.employeePhone = employeePhone;
        this.employeeAddress = employeeAddress;
        this.employeeDateOfJoining = employeeDateOfJoining;
        this.employeeDateOfBirth = employeeDateOfBirth;
        this.employeeGender = employeeGender;
        this.employeeMaritalStatus = employeeMaritalStatus;
        this.employeeBloodGroup = employeeBloodGroup;
        this.employeeEmergencyContact = employeeEmergencyContact;
        this.employeeExperience = employeeExperience;
        this.employeeQualification = employeeQualification;
        this.employeeSkills = employeeSkills;
        this.employeeCertifications = employeeCertifications;
        this.employeeLanguages = employeeLanguages;
    }
    public static EmployeeOld getInstance(int employeeId, String employeeName, double employeeSalary, String employeeDesignation, String employeeDepartment, String employeeLocation, String employeeEmail, String employeePhone, String employeeAddress, String employeeDateOfJoining, String employeeDateOfBirth, String employeeGender, String employeeMaritalStatus, String employeeBloodGroup, String employeeEmergencyContact, String employeeExperience, String employeeQualification, String employeeSkills, String employeeCertifications, String employeeLanguages) {
        if (employee == null) {
            employee = new EmployeeOld(employeeId, employeeName, employeeSalary, employeeDesignation, employeeDepartment, employeeLocation, employeeEmail, employeePhone, employeeAddress, employeeDateOfJoining, employeeDateOfBirth, employeeGender, employeeMaritalStatus, employeeBloodGroup, employeeEmergencyContact, employeeExperience, employeeQualification, employeeSkills, employeeCertifications, employeeLanguages);
        }
        return employee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                ", employeeLocation='" + employeeLocation + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeePhone='" + employeePhone + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeDateOfJoining='" + employeeDateOfJoining + '\'' +
                ", employeeDateOfBirth='" + employeeDateOfBirth + '\'' +
                ", employeeGender='" + employeeGender + '\'' +
                ", employeeMaritalStatus='" + employeeMaritalStatus + '\'' +
                ", employeeBloodGroup='" + employeeBloodGroup + '\'' +
                ", employeeEmergencyContact='" + employeeEmergencyContact + '\'' +
                ", employeeExperience='" + employeeExperience + '\'' +
                ", employeeQualification='" + employeeQualification + '\'' +
                ", employeeSkills='" + employeeSkills + '\'' +
                ", employeeCertifications='" + employeeCertifications + '\'' +
                ", employeeLanguages='" + employeeLanguages + '\'' +
                '}';
    }


}
