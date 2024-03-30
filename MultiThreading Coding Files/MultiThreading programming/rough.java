

public class rough {
    public static void main(String[] args) {
       
          System.out.println("Main Thread ");
          String name = Thread.currentThread().getName();
          System.out.println(name);
          System.out.println("priority"+ Thread.currentThread().getPriority());

        System.out.println("after changing name and prioty ");
          //   CHANGING THREAD NAME AND PRIPORTY 
        Thread t = Thread.currentThread();
        t.setName("raj");
        t.setPriority(1);

        String name1 = Thread.currentThread().getName();
        System.out.println(name1);
        System.out.println("priorty"+ Thread.currentThread().getPriority());

    }
}
