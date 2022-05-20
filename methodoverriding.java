class Vehicle{  
     
    void disp(){System.out.println("From Parent");}  
  }  
  
  class methodoverriding extends Vehicle{  
      
    void disp(){System.out.println("From Child");}  
    
    public static void main(String args[]){  
    methodoverriding obj = new methodoverriding(); 
    obj.disp(); 
    }  
  }
