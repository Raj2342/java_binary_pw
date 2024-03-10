  class animal {
      void sleep(){
        
        System.out.println("Animal need sleep");

      }
  }

  class tiger extends animal
  {

  }

  class monkey extends animal
  {
    
  }

  class dog extends animal
  {
    
  }
 
 class  heirarchichal {
    public static void main(String[] args) {
        dog d = new dog();
        d.sleep();
    }
 }
