package buildpattern;
class IglooHouse implements HouseBuilder 
{ 
    private House house; 
  
    public IglooHouse()  
    { 
        this.house = new House(); 
    } 
  
    public void buildBasement()  
    { 
        house.setBasement("Ice Bars"); 
    } 
  
    public void buildStructure()  
    { 
        house.setStructure("Ice Blocks"); 
    } 
  
    public void buildInterior()  
    { 
        house.setInterior("Ice Carvings"); 
    } 
  
    public void bulidRoof()  
    { 
        house.setRoof("Ice Dome"); 
    } 
  
    public House getHouse()  
    { 
        return this.house; 
    } 
} 