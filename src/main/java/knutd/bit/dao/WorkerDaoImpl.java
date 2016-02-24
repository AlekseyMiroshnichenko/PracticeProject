/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knutd.bit.dao;

import java.io.Serializable;
import java.util.List;
import knutd.bit.model.Employee;
import knutd.bit.model.Worker;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Notebook
 */
@Repository("workerDao")
public class WorkerDaoImpl extends AbstractDao<Integer, Worker>implements WorkerDao{
      public List<Worker> sortRecords(String columnName, boolean isAsc){
            Criteria criteria = createEntityCriteria();
		return (List<Worker>) criteria.list();
                
      }

    public List<Worker> findAllRecords() {
        Criteria criteria = createEntityCriteria();
            return (List<Worker>) criteria.list();   
    }
    
    
}
