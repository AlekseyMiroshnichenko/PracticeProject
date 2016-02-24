/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knutd.bit.dao;

import java.util.List;
import knutd.bit.model.Worker;

/**
 *
 * @author Notebook
 */
public interface WorkerDao {
      public List<Worker> sortRecords(String columnName, boolean isAsc);
      public List<Worker> findAllRecords();
}
