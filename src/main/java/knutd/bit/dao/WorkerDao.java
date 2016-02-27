/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knutd.bit.dao;

import java.util.List;
import knutd.bit.model.ModelTable;

/**
 *
 * @author Notebook
 */
public interface WorkerDao {
      public List<ModelTable> sortRecords(String tableName
              ,String firstColumnSelected, boolean firstIsAsc
              ,String secondColumnSelected, boolean secondIsAsc);
      public List<ModelTable> findAllRecords(String tableName);
}
