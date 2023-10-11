package com.example.ApiLogin.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

        @Id
        @Column(name="employee_id", length = 45)
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int employeeid;
        @Column(name="employee_name", length = 255)
        private String employeename;
        @Column(name="email", length = 255)
        private String email;
        @Column(name="password", length = 255)
        private String password;
        public Employee() {
        }
        public Employee(int employeeid, String employeename, String email, String password) {
            this.employeeid = employeeid;
            this.employeename = employeename;
            this.email = email;
            this.password = password;
        }
//create getters and setters

        @Override
        public String toString() {
            return "Employee{" +
                    "employeeid=" + employeeid +
                    ", employeename='" + employeename + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }

    public String getEmployeename() {
     return null;
        }

    public String getPassword() {
        return null;
    }
}

