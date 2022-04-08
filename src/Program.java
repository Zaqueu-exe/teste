import java.text.SimpleDateFormat;
import java.time.Instant;
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
    }
}
