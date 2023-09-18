package io.nology.employeecreator.employee;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class UpdateEmployeeDTO {
    @NotNull
    private String firstName;

    private String middleName;

    @NotNull
    private String lastName;

    @NotNull
    @Enumerated(EnumType.STRING)
    private CreateEmployeeDTO.ContractType contractType;

    @Enumerated(EnumType.STRING)
    private CreateEmployeeDTO.PermanentType permanentType;

    private Date startDate;

    private Date endDate;

    @NotNull
    private String email;

    @NotNull
    private String mobile;

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

    public CreateEmployeeDTO.ContractType getContractType() {
        return contractType;
    }

    public void setContractType(CreateEmployeeDTO.ContractType contractType) {
        this.contractType = contractType;
    }

    public CreateEmployeeDTO.PermanentType getPermanentType() {
        return permanentType;
    }

    public void setPermanentType(CreateEmployeeDTO.PermanentType permanentType) {
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
