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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
        @Column(name = "NUMBER", insertable = false, updatable = false)
        private int number;
        
        @NotNull
	@Size(min=3, max=50)
	@Column(name = "DOCUMENT_ID", nullable = false)
	private String document_id;
        
        @NotNull
        @Type(type="date")
        @Column(name = "DATE_OF_CREATION", nullable = false)
        private Date dateOfCreation;
        
        @NotNull
	@Size(min=3, max=50)
	@Column(name = "WORKER_ID", nullable = false)
	private String worker_id;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDocument_id() {
        return document_id;
    }

    public void setDocument_id(String document_id) {
        this.document_id = document_id;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(String worker_id) {
        this.worker_id = worker_id;
    }

   
        
        
        
}
