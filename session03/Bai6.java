import java.util.Arrays;

public class Bai6 {
    public static void mergeArray(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] res = new int[first.length + second.length];
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                res[k++] = first[i++];
            } else if (first[i] > second[j]) {
                res[k++] = second[j++];
            } else {
                res[k++] = first[i];
                i++;
                j++;
            }
        }
        while (i < first.length) {
            res[k++] = first[i++];
        }
        while (j < second.length) {
            res[k++] = second[j++];
        }

        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int[] first = { 1, 3, 5, 7, 9 };
        int[] second = { 2, 3, 5, 6, 8, 9, 10 };
        mergeArray(first, second);
    }
}
