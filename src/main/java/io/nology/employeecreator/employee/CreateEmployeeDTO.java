package io.nology.employeecreator.employee;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class CreateEmployeeDTO {

	public enum ContractType {
		CONTRACT,
		PERMANENT
	};
	
	public enum PermanentType {
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
	
	@NotNull
	private String email;
	
	@NotNull
	private String mobile;
	
	private int hours;

	public CreateEmployeeDTO(String firstName, String middleName, String lastName,
			 ContractType contractType, PermanentType permanentType, Date startDate, Date endDate,
			String email, String mobile, int hours) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.contractType = contractType;
		this.permanentType = permanentType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.email = email;
		this.mobile = mobile;
		this.hours = hours;
		
	
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ContractType getContractType() {
		return contractType;
	}

	public void setContractType(ContractType contractType) {
		this.contractType = contractType;
	}

	public PermanentType getPermanentType() {
		return permanentType;
	}

	public void setPermanentType(PermanentType permanentType) {
		this.permanentType = permanentType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	
}
