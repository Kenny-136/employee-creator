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
	
	public enum ContractType {
		CONTRACT,
		PERMANENT
	};
	
	public enum PermanentType {
		FULLTIME,
		PARTTIME
	};
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column
	private String middleName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private ContractType contractType;
	
	@Enumerated(EnumType.STRING)
	@Column
	private PermanentType permanentType;
	
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
}
