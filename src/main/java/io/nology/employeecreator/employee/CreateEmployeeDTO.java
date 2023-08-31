package io.nology.employeecreator;

import java.util.Date;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;

public class CreateEmployeeDTO {

	private enum ContractType {
		CONTRACT,
		PERMANENT
	};
	
	private enum PermanentType {
		FULLTIME,
		PARTTIME
	};
	@NotNull
	private String firstName;
	
	private String middleName;
	
	@NotNull
	private String lastName;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private ContractType contractType;
	
	@Enumerated(EnumType.STRING)
	private PermanentType permanentType;
	
	private Date startDate;
	
	private Date endDate;
	
	private String email;
	
	private String mobile;
	
	private int hours;
}
