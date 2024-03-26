
class  animnal {
     
        public void  eat(){
            System.out.println("parent class eat");
        }

        public void  sleep(){
            System.out.println("parent class sleep");
        }
}
 class tiger  extends animnal
 {
       
    public void  eat(){
        System.out.println(" tiger  class eat");
    }

    public void  sleep(){
        System.out.println("tiger class sleep");
    }
 }

 class elephent extends animnal
 {
       
    public void  eat(){
        System.out.println("elephent class eat");
    }

    public void  sleep(){
        System.out.println("elephent  class sleep");
    }
 }




class  polymorphism {
  
  /*
     1.child can be store in parent , but child cannot be stored in child
     2.  when create a object is neecessary to first part and last part would be simmilar 
      3. only parent object not necessary to write first and last part  simmilary 
    4. ref is one form but out is multiple form 
  
  */  



    public static void main(String[] args) {
        elephent eleph = new elephent();
               
        tiger tig = new tiger();
                

        // cretae obj of parent
        animnal ref;
        ref = eleph;
        ref.eat();
        ref.sleep();
        System.out.println("//////////////////////////////");
        ref = tig;
        ref.eat();
        ref.sleep();
    }
}