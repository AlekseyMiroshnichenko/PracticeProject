package knutd.bit.controller;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.persistence.Column;
import javax.servlet.http.HttpServletResponse;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import knutd.bit.model.ModelHTMLPrinter;
import knutd.bit.model.ModelTable;
import knutd.bit.service.EmployeeService;
import knutd.bit.model.Tables;
import knutd.bit.model.Worker;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	EmployeeService service;
	
	@Autowired
	MessageSource messageSource;
        
        @RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String listTables(ModelMap model) {
                model.addAttribute("tables", Tables.values());
		return "alltables";
	}
        
        @RequestMapping(value = {"/"}, method = RequestMethod.POST)
	public String chooseTable(@RequestParam String table, ModelMap model) {
                model.addAttribute("tableName", table);
		return "redirect:" + "/list";
	}
        
        @RequestMapping(value = {"/list" }, method = RequestMethod.GET)
	public String showAllRecords(@ModelAttribute("tableName") String tableName,
                ModelMap model) {    
                 
                List<ModelTable> recordList = service.findAllRecords(tableName);
                ModelHTMLPrinter printer = new ModelHTMLPrinter(recordList);
                model.addAttribute("printer", printer);
    		model.addAttribute("records", recordList);
		return "allrecords";
	}
        
        @RequestMapping(value = {"/list" }, method = RequestMethod.POST)
	public String sortTableByField(@ModelAttribute("tableName") String tableName,
                @RequestParam(value = "columnSelect", required=false) String columnSelect, ModelMap model) {
                System.out.println(tableName);
                System.out.println(columnSelect);
                
                Worker worker = new Worker();
                worker.setName("Alex");
                worker.setSurname("Miroshicnenko");
                worker.setDepartment("Book");
                worker.setId(23);
                List<Worker> recordList = new ArrayList<Worker>();
                recordList.add(worker);
    		model.addAttribute("records", recordList);
		return "allrecords";
	}
        
        @RequestMapping(value = { "/sort" }, method = RequestMethod.GET)
	public String sortTable( @RequestParam(value = "tableName", required = false) String tableName,
                @RequestParam(value = "firstColumnSelected", required = false) String firstColumnSelected,
                @RequestParam(value = "firstIsAsc", required = false) boolean firstIsAsc,
                @RequestParam(value = "secondColumnSelected", required = false) String secondColumnSelected,
                @RequestParam(value = "secondIsAsc", required = false) boolean secondIsAsc,
                ModelMap model) {
            
            List<ModelTable> recordList = service.sortRecords(tableName
                    ,firstColumnSelected, firstIsAsc
                    , secondColumnSelected, secondIsAsc);
            ModelHTMLPrinter printer = new ModelHTMLPrinter(recordList);
            model.addAttribute("printer", printer);
            model.addAttribute("records", recordList);
		return "allrecords";
	}
}
