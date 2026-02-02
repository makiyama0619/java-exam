public class Ex4 {
    public static void main(String[] args) {
            int year = Integer.parseInt(args[0]);
            boolean u = Year(year);
            if (u) {
                System.out.println(year + "年はうるう年です");
            } else {
                System.out.println(year + "年はうるう年ではありません");
            }
    }

    public static boolean Year(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
