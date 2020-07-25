package prototype;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;  
  
class Demo{  
     public static void main(String[] args) throws IOException {  
    	final Logger logger=LogManager.getLogger(Demo.class);   
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
        logger.debug("Enter Employee Id: ");  
        int eid=Integer.parseInt(br.readLine());  
          
        logger.debug("Enter Employee Name: ");  
        String ename=br.readLine();  
       
        logger.debug("Enter Employee Designation: ");  
        String edesignation=br.readLine();  
            
        logger.debug("Enter Employee Address: ");  
        String eaddress=br.readLine();  
       
        logger.debug("Enter Employee Salary: ");  
        double esalary= Double.parseDouble(br.readLine());  
           
        Employee e1=new Employee(eid,ename,edesignation,esalary,eaddress);  
          
        e1.showRecord();  
        Employee e2=(Employee) e1.getClone();  
        e2.showRecord();  
    }     
}