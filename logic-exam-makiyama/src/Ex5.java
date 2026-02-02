import java.util.HashMap;
import java.util.Map;

public class Ex5 {
    public static void main(String[] args) {
        String[] sports = {"soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer", "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging", "baseball", "soccer", "soccer"};

        Map<String, Integer> countMap = new HashMap<>();
        for (String sport : sports) {
            countMap.put(sport, countMap.getOrDefault(sport, 0) + 1);
        }
        String mostSport = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostSport = entry.getKey();
            }
        }
        System.out.println("最も多いスポーツは " + mostSport + " で、出現回数は " + maxCount + " 回です");
    }
}
