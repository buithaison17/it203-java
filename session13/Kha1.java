import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Kha1 {
    public static void main(String[] args) {
        List<Double> temperatures = new ArrayList<>(Arrays.asList(36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8));
        Iterator<Double> iterator = temperatures.iterator();
        // Xóa các giá trị không hợp lệ
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp < 34.0 || temp > 42.0) {
                iterator.remove();
            }
        }
        // Tính giá trị trung bình các bệnh nhân còn lại
        double sum = 0;
        for (Double temp : temperatures) {
            sum += temp;
        }
        System.out.println(sum / temperatures.size());
    }
}