public class Exam3 {
    public static void main(String[] args) {
        int money = (200*3) + (250*4);
        double tax = money * 0.1;
        
        System.out.println("⼩計");
        System.out.println(money+"円");
        System.out.println("消費税");
        System.out.println((int)tax+"円");
        System.out.println("合計金額");
        System.out.println((int)(money + tax)+"円");
    }
}
