 // 1/ you can not inherit construtor 
 // you canot   inherit private variable 
 
 class human {
      private String name ;
      int age ;
      
      human(){

        System.out.println(" this  is  constructor");
      }

      void Age1(){
        age = 34;
        System.out.println("this is a human -class -method ");
      }



 }

 class student  extends human
 {
       student(){
        sout
       }
  
     void disp(){
         System.out.println("this is human age"+ age);
        //  System.out.println("this name of human"+ name);// show error ::  
        // one  class canot directly access to   other class   it follow encapsulation  rule 
      }
 }



class  inheritance2 {
      
      public static void main(String[] args) {
        
        student st = new student();
         st.Age1();
      }
}