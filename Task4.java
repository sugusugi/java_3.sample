import java.util.stream.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task4{
    public static void main(String[] args){
        IntStream intStream = IntStream.range(1,10000);
        String format = "HH:mm:ss.SSS";
        DateTimeFormatter df = DateTimeFormatter.ofPattern(format);
        intStream.forEach(t -> System.out.println(LocalDateTime.now().format(df) + " " + t));
    }
}
