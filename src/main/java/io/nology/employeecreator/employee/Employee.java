package io.nology.employeecreator;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = true)
	private String middleName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private String contractType;
	
	@Column
	private String permanentType;
	
	@Column
	private Date startDate;
	
	@Column
	private Date endDate;
	
	@Column
	private Boolean onGoing;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false, unique = true)
	private String mobile;

	@Column
	private int hours;

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

	public Boolean getOnGoing() {
		return onGoing;
	}

	public void setOnGoing(Boolean onGoing) {
		this.onGoing = onGoing;
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

	public Long getId() {
		return id;
	}
	
	public Employee() {}

	public Employee(String firstName, String middleName, String lastName, ContractType contractType,
			PermanentType permanentType, Date startDate, Date endDate, Boolean onGoing, String email, String mobile,
			int hours) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.contractType = contractType;
		this.permanentType = permanentType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.onGoing = onGoing;
		this.email = email;
		this.mobile = mobile;
		this.hours = hours;
	};
	
	
}
