package knutd.bit.service;

import java.util.List;

import knutd.bit.model.ModelTable;
import knutd.bit.model.Worker;

public interface EmployeeService {
        
        public List<ModelTable> sortRecords(String tableName, String firstColumnSelected, boolean firstIsAsc
              ,String secondColumnSelected, boolean secondIsAsc);
        
        List<ModelTable> findAllRecords(String tableName);
	
}
