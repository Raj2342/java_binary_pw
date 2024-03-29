class family{

      void father()  throws Exception
      {
      
        //   try{

              son();
        //   }
        //   catch(Exception e){
        //         System.out.println("error"+ e.getMessage());
        //   } 
          
      }

      void son()  throws Exception
      {
         int n1=5;
         int n2=0;
         int result=0;
        
            // try{

              result = n1/n2;
            // }
        //  catch(Exception e){
        //     System.out.println("error"+ e.getMessage());
         
         System.out.println(result);

      }
}




public class ducking {
      public static void main(String[] args) {
        family f = new family();
        try{

            f.father();
        }
        catch (Exception e)
        {
            System.out.println("error");
        }

      }
}
