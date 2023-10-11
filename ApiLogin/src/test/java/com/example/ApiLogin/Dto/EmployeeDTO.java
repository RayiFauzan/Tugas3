package com.example.ApiLogin.Dto;

import jakarta.persistence.Column;
public class EmployeeDTO {
    private int employeeid;
        private String employeename;
        private String email;
        private String password;
        public EmployeeDTO() {
        }
        public EmployeeDTO(int employeeid, String employeename, String email, String password) {
            this.employeeid = employeeid;
            this.employeename = employeename;
            this.email = email;
            this.password = password;
        }

    public int getEmployeeid() {
        return employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public String getEmployeeEmail() {
        return getEmployeeEmail();
    }
    public Object getPassword;

    public CharSequence getPassword() {
    return null;}
} //create getters and setters


