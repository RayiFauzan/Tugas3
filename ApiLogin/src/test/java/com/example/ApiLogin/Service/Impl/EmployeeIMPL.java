package com.example.ApiLogin.Service.Impl;

import com.example.ApiLogin.Dto.EmployeeDTO;
import com.example.ApiLogin.Dto.LoginDTO;
import com.example.ApiLogin.Entity.Employee;
import com.example.ApiLogin.Repo.EmployeeRepo;
import com.example.ApiLogin.Service.EmployeeService;
import com.example.ApiLogin.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeIMPL implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;
    private PasswordEncoder passwordEncoder; // Tambahkan injeksi untuk passwordEncoder

    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(
                employeeDTO.getEmployeeid(),
                employeeDTO.getEmployeename(),
                employeeDTO.getEmployeeEmail(),
                passwordEncoder.encode(employeeDTO.getPassword())
        );
        employeeRepo.save(employee);
        return employee.getEmployeename();
    }

    @Override
    public LoginResponse loginEmployee(LoginDTO loginDTO) {
       String msg = "";
       Employee employee1 =employeeRepo.findByEmail(loginDTO.getEmail());
       if (employee1 !=null) {
           String password = loginDTO.getPassword();
           String encodedPassword=employee1.getPassword();
           Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
           if (isPwdRight) {
               Optional<Employee> employee = employeeRepo.findOneByEmailAndPassword(loginDTO.getEmail());
               if (employee.isPresent()) {
                           return new LoginResponse("Login Success", true);
                       }else{
                           return new LoginResponse("Login Failed", false);
                       }
           }else{
               return new LoginResponse("Password Not Match", false);
           }
       }else{
           return new LoginResponse("Email not exits", false);
       }
           }

}
