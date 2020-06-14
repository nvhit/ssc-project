package vn.com.shensmartcity.domain.repository.employee;

import java.util.Optional;

import vn.com.shensmartcity.domain.model.Employee;

public interface EmployeeRepository {
    Optional<Employee> findById(String staffCode);

    void insert(Employee employee);

}
