public class Bai6 {
    public static void main(String[] args) {
        String[] blacklist = { "toi te", "ngu ngoc", "khong dang doc" };
        String review = "Cuon sach nay rat toi te, noi dung that la ngu ngoc va khong dang doc";
        StringBuilder result = new StringBuilder();
        // Thay thế các từ vi phạm
        for (String word : blacklist) {
            review = review.replaceAll("(?i)\\b" + word + "\\b", "***");
        }
        // Nếu đoạn văn dài trên 200 ký tự thì thay bằng ... và không cắt từ
        int maxLength = 200;
        // Kiểm tra dài hơn trên 200 ký tự
        if (review.length() > maxLength) {
            int index = maxLength;
            // Kiểm tra xem có mất từ không
            if (review.charAt(index) != ' ') {
                // Nếu mất tìm kiếm vị trí mới để thay thế
                for (int i = index; i < review.length(); i++) {
                    if (review.charAt(i) == ' ') {
                        index = i;
                        break;
                    }
                }
                result.append(review.substring(0, index));
            }
        } else {
            result.append(review);
        }
        System.out.println(result);
    }
}