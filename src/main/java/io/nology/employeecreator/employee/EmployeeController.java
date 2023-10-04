package io.nology.employeecreator.employee;

import io.nology.employeecreator.exceptions.NotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(path ="/employees")
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
	
	
	@DeleteMapping("{id}")
	public ResponseEntity<Employee> deleteById(@PathVariable Long id) {
		boolean deleted = this.employeeService.deleteById(id);
		
		if(!deleted) {
			throw new NotFoundException(String.format("Employee with id: %s not found, could not delete.", id));
		}
		
		return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
	}
	@PatchMapping("/{id}")
	public ResponseEntity<Employee> updateById(@PathVariable Long id,
											  @Valid @RequestBody UpdateEmployeeDTO data) {
		Optional<Employee> maybeUpdated = this.employeeService.updateById(id, data);
		if(maybeUpdated.isEmpty()) {
			throw new NotFoundException(String.format(
					"Employee with id: %s not found, could not update",
					id));
		}

		return new ResponseEntity<Employee>(maybeUpdated.get(), HttpStatus.OK);
	}



}
