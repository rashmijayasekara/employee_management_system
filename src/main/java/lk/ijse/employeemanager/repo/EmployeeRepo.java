package lk.ijse.employeemanager.repo;

import lk.ijse.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
