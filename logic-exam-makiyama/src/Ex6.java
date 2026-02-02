import java.util.ArrayList;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        Math.floor(Math.random() * 10);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int num = (int)(Math.random() * 10);
            while (numbers.contains(num)) {
                num = (int)(Math.random() * 10);
            }
            numbers.add(num);
        }
        System.out.println(numbers.get(0) + "," + numbers.get(1) + "," + numbers.get(2));
    }
}
