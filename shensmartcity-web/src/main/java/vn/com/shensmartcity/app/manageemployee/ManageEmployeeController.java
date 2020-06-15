package vn.com.shensmartcity.app.manageemployee;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import vn.com.shensmartcity.app.api.utils.ResponseData;
import vn.com.shensmartcity.domain.service.employee.EmployeeService;

@RestController
@RequestMapping(value = "employee")

public class ManageEmployeeController {
	@Inject 
	EmployeeService employeeService;
	@RequestMapping(value = "searchById", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<Object> searchById(@RequestParam(name = "staffCode") String staffCode) {
		return new ResponseEntity<Object>(ResponseData.SUCCESS(employeeService.findOne(staffCode )), HttpStatus.OK); 
	}
}
