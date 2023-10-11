package com.example.ApiLogin.Service;

import com.example.ApiLogin.Dto.EmployeeDTO;
import com.example.ApiLogin.Dto.LoginDTO;
import com.example.ApiLogin.response.LoginResponse;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);
}
