package knutd.bit.service;

import java.util.List;

import knutd.bit.model.Employee;
import knutd.bit.model.Worker;

public interface EmployeeService {

	Employee findById(int id);
	
	void saveEmployee(Employee employee);
	
	void updateEmployee(Employee employee);
	
	void deleteEmployeeBySsn(String ssn);

	List<Employee> findAllEmployees(); 
	
	Employee findEmployeeBySsn(String ssn);

	boolean isEmployeeSsnUnique(Integer id, String ssn);
        
        public List<Worker> sortRecords(String columnName, boolean isAsc);
        
        List<Worker> findAllRecords();

	
}
