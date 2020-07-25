package prototype;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Employee implements Prototype{  
    
	   private int id;  
	   private String name, designation;  
	   private double salary;  
	   private String address;  
	   final Logger logger=LogManager.getLogger(Employee.class);   
	   public Employee(){  
	           logger.debug("   Employee Records of Oracle Corporation ");  
	           logger.debug("---------------------------------------------");  
	           logger.debug("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary"+"\t\t"+"Eaddress");  
	      
	}  
	  
	 public  Employee(int id, String name, String designation, double salary, String address) {  
	          
	        this();  
	        this.id = id;  
	        this.name = name;  
	        this.designation = designation;  
	        this.salary = salary;  
	        this.address = address;  
	    }  
	      
	  public void showRecord(){  
	          
		  logger.debug("{}.\t{}.\t{}.\t{}.\t{}.\t",id,name,designation,salary,address);  
	   }  
	    public Prototype getClone() {  
	          
	        return new Employee(id,name,designation,salary,address);  
	    }  
	}