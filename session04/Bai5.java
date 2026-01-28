import java.util.regex.Pattern;

public class Bai5 {
    public static void main(String[] args) {
        String regex = "(\\d{4})-\\d{2}-\\d{2} \\| User: ([A-Za-z]+) \\| Action: (BORROW|RETURN) \\| BookID: ([A-Z]{2}\\d{5})";
        String[] logs = {
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: SonBui | Action: RETURN | BookID: AB54321",
                "2024-05-22 | User: MinhTran | Action: BORROW | BookID: BK99999"
        };
        Pattern pattern = Pattern.compile(regex);
        int borrowCount = 0;
        int returnCount = 0;
        
    }
}
