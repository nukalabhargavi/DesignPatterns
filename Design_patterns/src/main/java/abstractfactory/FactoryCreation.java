package abstractfactory;
class FactoryCreation {  
    public static Factorypattern getFactory(String choice){  
     if(choice.equalsIgnoreCase("Bank")){  
        return new BankFactoryPattern();  
     } else if(choice.equalsIgnoreCase("Loan")){  
        return new LoanFactoryPattern();  
     }  
     return null;  
  }  
}