//import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
            int year = Integer.parseInt(args[0]);
            int century = (year - 1) / 100 + 1;
            System.out.println(year + "年は" + century + "世紀です");
        }
    }
