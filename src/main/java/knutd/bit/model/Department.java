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
	@Size(min=3, max=50)
	@Column(name = "NAZVA", nullable = false)
	private String nazva;
        
        @NotNull
        @Size(min=3, max=50)
	@Column(name = "ADDRESS", nullable = false)
	private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazva() {
        return nazva;
    }

    public void setNazva(String nazva) {
        this.nazva = nazva;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
        
        
}
