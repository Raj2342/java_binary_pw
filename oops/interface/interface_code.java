/*****************
 
  polymorphism --- abstract ---- interface
 */

interface animal 
{
  void eat();
}

class tiger  implements animal
{
   public void eat(){
     System.out.println("tiger eat");
   }
}

class cat  implements animal
{
 public void eat(){
   System.out.println("cat eat");
 }
}

class  ground  
{
 public void call(animal an){
   an.eat();
 }
}




public class  interface_code{
   
  public static void main(String[] args) {
     //   tiger t = new tiger();
     //    cat c = new cat();
     // interface  canot create object but  creating referce is possible 
       animal an = new tiger();
       animal an1 = new cat();
        ground g = new ground();
        g.call(an1);
        g.call(an);
  }
}