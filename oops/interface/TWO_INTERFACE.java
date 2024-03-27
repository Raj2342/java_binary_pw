interface a 
{
    void show();
}

interface x
{
   void xyz();
}
// we can inherit multiple class in inteface 
class bro implements a ,x
{
   public void show(){
        System.out.println("it is show method");
     }
    public void xyz(){
        System.out.println("it is xyz method");
    } 
}







public class TWO_INTERFACE {
      public static void main(String[] args) {
        //    a  bh = new bro();
        //    bh.show();
         //we  object crete karte time 'a' ya 'x' koi ek hoga  kisi ek ka output ayega 
        //    x bh = new bro();
        //    bh.xyz();

        // bro  bh = new bro();
        // bh.show();
        // bh.xyz();
      }
}
