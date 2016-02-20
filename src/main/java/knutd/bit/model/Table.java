/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knutd.bit.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author Notebook
 */

public class Table {
    static List<Table> tables = new ArrayList<Table>();
    
    public static List getTables() {
        return tables;
    }
    
    private String name;
    
    public Table(String name) {
        this.name = name;
        Table.tables.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
