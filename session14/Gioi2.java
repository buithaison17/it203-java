import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Gioi2 {
    public static void main(String[] args) {
        List<String> sicks = new ArrayList<>();
        sicks.add("Cum A");
        sicks.add("Sot xuat huyet");
        sicks.add("Cum A");
        sicks.add("Covid-19");
        sicks.add("Sot xuat huyet");

        Map<String, Integer> statics = new TreeMap<>();

        for (String sick : sicks) {
            if (statics.containsKey(sick)) {
                statics.replace(sick, statics.get(sick) + 1);
            } else {
                statics.put(sick, 1);
            }
        }

        System.out.println(statics.toString());
    }
}
