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
import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Admin
 */
@Entity
@javax.persistence.Table(name="DOCUMENTS")
public class Document implements ModelTable{
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID", insertable = false, updatable = false)
        private int id;
        
        @NotNull
	@Size(min=3, max=50)
	@Column(name = "NAME", nullable = false)
	private String name;
        
        @NotNull
	@Size(min=3, max=50)
	@Column(name = "TYPE", nullable = false)
	private String type;
        
        @NotNull
        @DateTimeFormat(pattern="dd/MM/yyyy") 
        @Column(name = "STORAGE_LIFE", nullable = false)
        @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
        private LocalDate storageLife;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStorageLife() {
        return storageLife;
    }

    public void setStorageLife(LocalDate storageLife) {
        this.storageLife = storageLife;
    }
        
}
