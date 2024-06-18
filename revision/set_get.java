 class animal {
     
    private String   name ;
    private int age;
     public void  setName()
     {
        name = "Raj";   
     }

     public String getName(){
          return name;        
     }

     public  void setAge(){
         age=20;
     }

     public int getAge(){
        return age;
     }
     
     
 }

class set_get {

       public static void main(String[] args) {
          animal an = new animal();
          an.setAge();
        int a=  an.getAge();
        an.setName();
       String n=   an.getName();
       System.out.println(a);
       System.out.println(n);

           
             
       }
}