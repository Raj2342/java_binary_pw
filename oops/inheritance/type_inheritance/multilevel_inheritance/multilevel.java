  class demo1{
        int age ;
        void disp(){
            age=23;
            System.out.println("this is demo1 written "+ age);
        }
  }

  class demo2 extends demo1  
  {
        
  }

  class demo3 extends demo2
  {
       
  }



 
 
 class  multilevel {
     public static void main(String[] args) {
           demo3 d = new demo3();
           d.disp();
      }
 }