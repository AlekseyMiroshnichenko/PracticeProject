package knutd.bit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import knutd.bit.dao.WorkerDao;
import knutd.bit.model.ModelTable;
import knutd.bit.model.Worker;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    
        @Autowired
        private WorkerDao workerDao;

    public List<ModelTable> findAllRecords(String tableName) {
            return workerDao.findAllRecords(tableName);
    }
        
        public List<ModelTable> sortRecords(String tableName
              ,String firstColumnSelected, boolean firstIsAsc
              ,String secondColumnSelected, boolean secondIsAsc){
            List<ModelTable> sortedList;
            sortedList = workerDao.sortRecords(tableName, firstColumnSelected, firstIsAsc, secondColumnSelected, secondIsAsc);
            
            return sortedList;
        }
	
}
