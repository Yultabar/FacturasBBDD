
package util;

import java.util.Calendar;


public class MiCalendar {
    
    public static String toFecha(Calendar calendar) {
        String dd   = calendar.get(Calendar.DAY_OF_MONTH)+"";
        String mm   = calendar.get(Calendar.MONTH)+1+"";        
        String yyyy = calendar.get(Calendar.YEAR)+""; 
        
        if (dd.length() == 1) dd = "0" + dd;
        if (mm.length() == 1) mm = "0" + mm;
        
        return dd+"/"+mm+"/"+yyyy;
    }
    
    public static String toHora(Calendar calendar) {
        String hh   = calendar.get(Calendar.HOUR_OF_DAY)+"";
        String mm   = calendar.get(Calendar.MINUTE)+"";  
        
        if (hh.length() == 1) hh = "0" + hh;
        if (mm.length() == 1) mm = "0" + mm;
        
        return hh+":"+mm;
    }    
 
    
    
    
    
    
    
    
    
    
    
    
}
