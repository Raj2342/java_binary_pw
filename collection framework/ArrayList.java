import  java.util.*;
public  class ArrayList {
    public static void main(String[] args) {
      System.out.println("FIRST ARRAY LIST");
         ArrayList  al1 = new ArrayList();
         al1.add(100);
         al1.add(200);
         al1.add(300);
         System.out.println(al1);

        System.out.println("second arraylist");
        
         ArrayList  al2 = new ArrayList();
         al2.add(1);
         al2.add(2);
         al2.add(3);
         System.out.println(al2);

         System.out.println("Third arraylist");
        
         ArrayList  al3 = new ArrayList();
         al3.add("roman");
         al3.add("harry");
         al3.add("binary");
         System.out.println(al3);

         System.out.println("***********************");
         System.out.println("addALL(collection)");
         al2.addAll(al1);
         System.out.println(al2);

         System.out.println("addALL(index, collection)");
         al2.addAll(0, al3);
         System.out.println(al2);

         System.out.println("add(index, object)");
         al2.add(0,'r');
         System.out.println(al2);

         
    }
}