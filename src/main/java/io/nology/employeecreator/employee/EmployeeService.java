package io.nology.employeecreator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

public class EmployeeService {
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> findById(Long id) {
		Optional<Employee> maybeEmployee = this.employeeRepository.findById(id);
		return maybeEmployee;
	}
	
	public boolean deleteById(Long id) {
		Optional<Employee> maybeEmployee = this.findById(id);
		
		if(maybeEmployee.isEmpty()) {
			return false;
		}
		
		this.employeeRepository.delete(maybeEmployee.get());
		return true;
	}
}
