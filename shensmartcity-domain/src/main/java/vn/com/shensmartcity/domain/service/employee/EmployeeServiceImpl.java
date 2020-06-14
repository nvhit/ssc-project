package vn.com.shensmartcity.domain.service.employee;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.shensmartcity.domain.model.Employee;
import vn.com.shensmartcity.domain.repository.employee.EmployeeRepository;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Inject
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee findOne(String staffCode) {
		return employeeRepository.findById(staffCode).orElse(null);
	}

}
