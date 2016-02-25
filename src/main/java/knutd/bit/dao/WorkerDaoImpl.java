/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knutd.bit.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import knutd.bit.model.Department;
import knutd.bit.model.ModelTable;
import knutd.bit.model.Worker;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Notebook
 */
@Repository("workerDao")
public class WorkerDaoImpl extends AbstractDao<Integer, Worker> implements WorkerDao{
      public List<ModelTable> sortRecords(String firstColumnSelected
              , boolean firstIsAsc
              , String secondColumnSelected
              , boolean secondIsAsc){
          
            Criteria criteria = createEntityCriteria();
            List<ModelTable> records = (List<ModelTable>) criteria
                    .addOrder(firstIsAsc?Order.asc(firstColumnSelected):Order.desc(firstColumnSelected))
                    .addOrder(secondIsAsc?Order.asc(secondColumnSelected):Order.desc(secondColumnSelected))
                    .list();
            if(!records.isEmpty())
                return records;
            else
                return new ArrayList<ModelTable>();
      }

    public List<ModelTable> findAllRecords() {
        Criteria criteria = createEntityCriteria();
        List<ModelTable> records = (List<ModelTable>) criteria.list();
        if(!records.isEmpty())
            return records;
        else
            return new ArrayList<ModelTable>();
         
    }
    
    
}
