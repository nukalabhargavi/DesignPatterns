package abstractfactory;
import java.io.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class FactoryPatternExample {  
      public static void main(String args[])throws IOException {  
    	  final Logger logger=LogManager.getLogger(FactoryPatternExample.class);
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
          logger.debug("Enter the name of Bank from where you want to take loan amount: ");  
          String bankName=br.readLine();  
  
          logger.debug("Enter the type of loan e.g. home loan or business loan or education loan : ");  
  
          String loanName=br.readLine();  
          Factorypattern bankFactory = FactoryCreation.getFactory("Bank");  
          Bank b=bankFactory.getBank(bankName);  
		  logger.debug("Enter the interest rate for  {}. :",b.getBankName());  
  
		  double rate=Double.parseDouble(br.readLine());   
		  logger.debug("Enter the loan amount you want to take: ");  
  
		  double loanAmount=Double.parseDouble(br.readLine());  
		  logger.debug("Enter the number of years to pay your entire loan amount: ");  
		  int years=Integer.parseInt(br.readLine());  
 
		  logger.debug("you are taking the loan from {}.",b.getBankName());  
  
		  Factorypattern loanFactory = FactoryCreation.getFactory("Loan");  
		  Loan l=loanFactory.getLoan(loanName);  
          l.getInterestRate(rate);  
          l.calculateLoanPayment(loanAmount,years);  
  }  
}
