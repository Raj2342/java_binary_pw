// import java.util.Date;

import java.util.Date;


public class date_time {
public static void main(String[] args) {
    //   Date dt = new Date();
    //   System.out.println(dt); 

    java.util.Date dt = new  java.util.Date();
    System.out.println(dt);

    long timeInMs = dt.getTime();

    // sql library 
    // java.sql.Date  dt1 = new java.sql.Date(timeInMs);
    // System.out.println(dt1);
       Date dt1 = new Date();
      System.out.println(dt1); 




}

}