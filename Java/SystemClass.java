import java.util.*;

class SystemClass {
  public static void main(String[] args ) {
   long time = System.currentTimeMillis();
   Date now = new Date();
   Calendar cal = new GregorianCalendar();

   System.out.println(time);
   System.out.println(now);
   System.out.println(cal.get(Calendar.YEAR) + "년"
   +(cal.get(Calendar.MONTH + 1) + "월")
   +(cal.get(Calendar.DAY_OF_MONTH) + "일")
   +(cal.get(Calendar.HOUR_OF_DAY) + ":")
   +(cal.get(Calendar.MINUTE) + ":")
   +(cal.get(Calendar.SECOND))
   
   );

  }
}