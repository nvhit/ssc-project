package vn.com.shensmartcity.app.manageemployee;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vn.com.shensmartcity.domain.model.Employee;
import vn.com.shensmartcity.domain.service.employee.EmployeeService;

@RestController
@RequestMapping(value = "employee")

public class ManageEmployeeController {
	@Inject
	EmployeeService employeeService;
    @RequestMapping(value = "searchById", method = RequestMethod.GET)
    public Employee searchById(String staffCode) {
    	
        return employeeService.findOne(staffCode);
    }

}
