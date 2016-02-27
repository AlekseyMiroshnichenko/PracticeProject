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
import java.util.Date;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Admin
 */
@Entity
@javax.persistence.Table(name="ACCOUNTING")
public class Accounting implements ModelTable{
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID", insertable = false, updatable = false)
        private int id;
        
        @NotNull
	@Size(min=3, max=50)
	@Column(name = "DOCUMENT", nullable = false)
	private String document;
        
        @NotNull
        @DateTimeFormat(pattern="dd/MM/yyyy") 
        @Column(name = "TIME_OF_CREATION", nullable = false)
        private Date timeOfCreation;
        
        @NotNull
	@Size(min=3, max=50)
	@Column(name = "WORKER", nullable = false)
	private String worker;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Date getTimeOfCreation() {
        return timeOfCreation;
    }

    public void setTimeOfCreation(Date timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }
        
        
        
}
