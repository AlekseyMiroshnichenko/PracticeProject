/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knutd.bit.model;

/**
 *
 * @author Admin
 */
public abstract class AbstractModel implements HTMLRepresentable{

    public abstract String  getNamesOfColumnForHTML();

    public abstract String getRecordForHTML();
    
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
