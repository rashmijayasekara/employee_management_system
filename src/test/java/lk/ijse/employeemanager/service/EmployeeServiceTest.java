package lk.ijse.employeemanager.service;

import lk.ijse.employeemanager.model.Employee;
import lk.ijse.employeemanager.repo.EmployeeRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {
    private EmployeeRepo employeeRepo;

    @Test
    void addEmployee() {
        EmployeeService employeeService = new EmployeeService(employeeRepo);
        employeeService.addEmployee(new Employee("Rashmi","jayasekar7899@gamil.com","SE","0773376993","sfsd"," 1234"));
        Assertions.assertEquals(2,employeeService.findAllEmployees().size());

    }
}