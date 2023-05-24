package Date;
import java.util.Calendar;
import java.util.Date;
public class DateOperation {
    public static void main(String[] args){

        Calendar fecha = Calendar.getInstance();
        System.out.println("La fecha actual es: " +
                String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", fecha));


        fecha.add(Calendar.HOUR, +35);
        System.out.println("La fecha actual es: " +
                String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", fecha));

    }
}
