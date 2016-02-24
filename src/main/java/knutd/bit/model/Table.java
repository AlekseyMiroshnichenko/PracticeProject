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
    static{
        tables.add(new Table("Accaunting"));
        tables.add(new Table("Departments"));
        tables.add(new Table("Workers"));
        tables.add(new Table("Documents"));
    }
    
    public static List getTables() {
        return tables;
    }
    
    private String name;
    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
    
    public Table(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return name;
    }
    
}
