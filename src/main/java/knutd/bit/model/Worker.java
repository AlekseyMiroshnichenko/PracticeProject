package knutd.bit.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="WORKERS")
public class Worker extends AbstractModel{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        
        
        @NotNull
	@Size(min=3, max=50)
	@Column(name = "NAME", nullable = false)
	private String name;
        
        @NotNull
        @Size(min=3, max=50)
	@Column(name = "SURNAME", nullable = false)
	private String surname;
        
        @NotNull
        @Size(min=3, max=50)
	@Column(name = "DEPARTMENT", nullable = false)
	private String department;
        
        private transient String[] columns = {"id", "name", "surname", "department"};
    
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
        
	public String getSurname() {
		return surname;
	}

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
        
        @Transient
        public String[] getNamesOfColumn(){
            return columns;
        }
        @Transient
        public String getNamesOfColumnForHTML() {
         //   String[] columns = {"id", "name", "surname", "department"};
            String records;
            records = fillingColumns(columns);
            
            return records;
        }
        @Transient
        public String getRecordForHTML(){
            String[] column = {Integer.toString(id), name, surname, department};
            String records;
            records = fillingColumns(column);
            
            return records;
        }
  
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", surname="
				+ surname + ", department=" + department + "]";
	}
	
	
	

}
