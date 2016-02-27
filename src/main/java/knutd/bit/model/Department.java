/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knutd.bit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Admin
 */
@Entity
@javax.persistence.Table(name="DEPARTMENTS")
public class Department  implements ModelTable{
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID", insertable = false, updatable = false)
        private int id;
        
        @NotNull
	@Size(min=3, max=70)
	@Column(name = "department_name", nullable = false)
	private String departmentName;
        
        @NotNull
        @Size(min=3, max=30)
	@Column(name = "phone_number", nullable = false)
	private String phoneNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartment_name(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
        
        
}
