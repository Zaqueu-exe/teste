import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("---------------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date x1 = Date.from(Instant.parse("2014-07-12T15:15:15Z"));
        System.out.println(sdf.format(x1));
        Calendar cal = Calendar.getInstance();
        cal.setTime(x1);
        int mes = cal.get(Calendar.MONTH);
        System.out.println("Mes" + mes);
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Dia" + dia);
        int ano = cal.get(Calendar.YEAR);
        System.out.println("Ano" + ano);
        System.out.println("Fim");
        System.out.println("--------------------------------------");

    }
}
