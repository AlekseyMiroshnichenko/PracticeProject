/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knutd.bit.model;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;

/**
 *
 * @author Admin
 */
public class ModelHTMLPrinter {
    private List<ModelTable> tables;
    private List<String> columnList = new ArrayList<String>();
    
    public ModelHTMLPrinter(List<ModelTable> tables){
        this.tables = tables;
        setColumnList();
    }
    
    public void setTables(List<ModelTable> tables) {
        this.tables = tables;
        setColumnList();
    }

    private void setColumnList() {
        columnList.clear();
        if(!tables.isEmpty())
        for (Field field : tables.get(0).getClass().getDeclaredFields()) {
            String column = field.getName();
            if (column != null) {
                columnList.add(column);
            }
        }
    }
    
    public List<String> getColumnList() {
        return columnList;
    }
    
    public String getNamesOfColumnForHTML() {
            String records;
            records = fillingNamesOfColumns(columnList.toArray(new String[columnList.size()]));
            
            return records;
    }
    
    public String getRecordForHTML(){
            StringBuffer records = new StringBuffer();
            
            for (ModelTable table : tables) {
                List<String> columns = new ArrayList<String>();
                for (Field field : table.getClass().getDeclaredFields()) {
                    field.setAccessible(true);
                    try {                  
                        String s = String.valueOf(field.get(table)).trim();
                        columns.add(s);
                    } catch (IllegalArgumentException ex) {
                        Logger.getLogger(ModelHTMLPrinter.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(ModelHTMLPrinter.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                String rowTableHTML = fillingColumns(columns.toArray(new String[columns.size()]));
                records.append(rowTableHTML)
                        .append("\n");
            }    
            return records.toString();
    }

    String fillingNamesOfColumns(String[] columns){
            StringBuffer record = new StringBuffer();
            record.append("<tr>");
            for(String column:columns){
                    record.append("<th>").append(column).append("</th>");
            }
                record.append("</tr>");
            
            return record.toString();
    }
     
    String fillingColumns(String[] columns){
            StringBuffer record = new StringBuffer();
            record.append("<tr>");
            for(String column:columns){
                    record.append("<td>").append(column).append("</td>");
            }
                record.append("</tr>");
            
            return record.toString();
    }
    
}
