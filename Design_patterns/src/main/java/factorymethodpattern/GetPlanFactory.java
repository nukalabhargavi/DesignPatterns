package factorymethodpattern;
class GetPlanFactory{  
    
	   //use getPlan method to get object of type Plan   
	       public Plan getPlan(String planType){  
	            if(planType == null){  
	             return null;  
	            }  
	          if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
	                 return new Domestic();  
	               }   
	           else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
	                return new Commercial();  
	            }   
	          else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
	                return new Institutional();  
	          }  
	      return null;  
	   }  
	}