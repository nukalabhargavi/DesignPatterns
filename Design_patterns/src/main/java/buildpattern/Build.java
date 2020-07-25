package buildpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class Build
{ 
    public static void main(String[] args) 
    { 
    	  final Logger logger=LogManager.getLogger(Build.class);
        HouseBuilder iglooBuilder = new IglooHouse(); 
        CivilEngineer engineer = new CivilEngineer(iglooBuilder); 
  
        engineer.constructHouse(); 
  
        House house = engineer.getHouse(); 
  
        logger.debug("Builder constructed: {}.",house); 
    } 
} 