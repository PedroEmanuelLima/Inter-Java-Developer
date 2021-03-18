package aulas.trabalhandoComDatas;

import java.util.Calendar;
import java.util.Date;

public class Exercicio01 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2001);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DAY_OF_MONTH, 21);
        Date dat = new Date(cal.getTimeInMillis());

        System.out.println(cal.getTimeInMillis()); //982773302533
        System.out.println(dat); // Wed Feb 21 13:35:02 BRT 2001

        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.YEAR, 2010);
        cal2.set(Calendar.MONTH, 4);
        cal2.set(Calendar.DAY_OF_MONTH, 15);
        Date dat2 = new Date(cal2.getTimeInMillis());

        boolean isAfter = dat.after(dat2);
        System.out.println("POSTERIOR: "+isAfter);

        boolean isBefore = dat.before(dat2);
        System.out.println("ANTERIOR: "+isBefore);

    }
}
