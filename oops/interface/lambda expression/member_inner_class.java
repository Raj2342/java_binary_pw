class a
 {
     public void show()
     {
        System.out.println("it is show  a class  method ");
     }

    //  class b 
    //  {
    //     public void play(){
    //         System.out.println("class b play method");
    //     }
    //  }

   static class b 
     {
        public void play(){
            System.out.println("class b play method");
        }
     }



}


class  member_inner_class {
     public static void main(String[] args) {
           a bro = new a();
           bro.show();
        //   ** call memeber inner class 
        // a.b bro1 = bro.new b();
       
        //*** */ for static class - no need for outer class refrence 
        a.b bro1 = new a.b();

        bro1.play();

     }
}