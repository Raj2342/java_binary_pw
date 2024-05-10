import java.time.*;
public class date_time_2 {
     public static void main(String[] args) {
        // javap  java.time.Lcal.Date
         LocalDate date = LocalDate.now();
         System.out.println(date);
         int day = date.getDayOfMonth();
         int month = date.getMonthValue();
         int year = date.getYear();
         System.out.println("DATE");
         System.out.println(day+ " " + month + " " + year);
         System.out.println("TIME");
        LocalTime time =  LocalTime.now();
        int min = time.getMinute();
       int hour = time.getHour();
       int sec = time.getSecond();
       int nano = time.getNano();
       System.out.println(hour + ":" + min +":" +sec + ":" + nano);



     }
}
