import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Gioi1 {
    public static <T> List<T> findCommonPatients(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        for (T t : list1) {
            if (list2.contains(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findCommonPatients(Arrays.asList("DN01", "DN02", "DN03"), Arrays.asList("DN02", "DN04")));
    }
}
