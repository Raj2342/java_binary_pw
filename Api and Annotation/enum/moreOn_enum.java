import javax.naming.spi.DirStateFactory.Result;

enum result{
    PASS , FAIL , NR;
  //   in  bacground data  will store in this format 
    //public static  final result  PASS =  new result();
    //public static  final result  FAILD =  new result();
    //public static  final result  NR =  new result();
   
    // variable 
  int marks;
  // constructor 
  result(){
    System.out.println("constructor in enum");
  }

  // method  getter and setter
    void setMarks(int marks){
        this.marks= marks;
    }

    int getMarks(){
        return marks;
    }
   

}

public class moreOn_enum {

     public static void main(String[] args) {
          
        result.PASS.setMarks(45);

      int m1=  result.PASS.getMarks();
      System.out.println(m1);

      result.FAIL.setMarks(10);

      int m2 = result.FAIL.getMarks();
      System.out.println(m2);

     }
}
