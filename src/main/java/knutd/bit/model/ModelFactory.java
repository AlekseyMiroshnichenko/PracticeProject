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
public class ModelFactory {

    public ModelFactory() {
    }
    
    public ModelTable createModel(String modelName){
        ModelTable model = new Worker();
        switch(modelName){
            case "Accounting": model = new Accounting(); break;
            case "Departments": model = new Department(); break;
            case "Worker": model = new Worker(); break;
            case "Documents": model = new Document(); break;        
        }
    return model;
    }
    
}
