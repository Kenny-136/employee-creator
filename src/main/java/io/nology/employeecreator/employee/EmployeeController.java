package io.nology.employeecreator.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.nology.employeecreator.exceptions.NotFoundException;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(path ="/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
//	Create 
	@PostMapping
	public ResponseEntity<Employee> createEmployee(@Valid @RequestBody CreateEmployeeDTO data) {
		Employee createdEmployee = this.employeeService.create(data);
		return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Employee>> getAll() {
		List<Employee> allEmployee = this.employeeService.findAllEmployee();
		return new ResponseEntity<>(allEmployee, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getById(@PathVariable Long id) {
		Optional<Employee> foundEmployee = this.employeeService.findById(id);
		if(foundEmployee.isEmpty()) { 
			throw new NotFoundException(String.format("Employee with id: %s did not exist", id));
		}
		
		return new ResponseEntity<>(foundEmployee.get(), HttpStatus.OK);
	}
	
}
