import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai11_dateTimeJava {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
//        System.out.println(cal.get(Calendar.DATE));
        int ngay = cal.get(Calendar.DATE);
        int thang = cal.get(Calendar.MONTH);
        int nam = cal.get(Calendar.YEAR);
        System.out.println("hom nay la ngay "+ngay+" thang "+(thang+1)+" nam "+nam);

        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh/mm/ss a");
        Date d = cal.getTime();
        String s = dinhDang.format(d);
        System.out.println(d);
        System.out.println(s);
    }
}
