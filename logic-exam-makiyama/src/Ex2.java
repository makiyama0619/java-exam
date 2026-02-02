import java.time.LocalTime;

public class Ex2 {
    public static void main(String[] args) {
            int h = Integer.parseInt(args[0]);
            int m = Integer.parseInt(args[1]);
            int s = Integer.parseInt(args[2]);

            LocalTime localTime = LocalTime.of(h, m, s);

            LocalTime nextTime = localTime.plusSeconds(1);

            System.out.println(h + " 時 " + m + " 分 " + s + " 秒の 1 秒後は " 
                               + nextTime.getHour() + " 時 " 
                               + nextTime.getMinute() + " 分 " 
                               + nextTime.getSecond() + " 秒です");
}
}
