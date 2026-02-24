public class Main {
    public static void main(String[] args) {
        GameCharacter[] characters = new GameCharacter[3];
        characters[0] = new Warrior("Yasuo", 500, 150, 20);
        characters[1] = new Mage("Veigar", 300, 100, 200);
        // Khởi tạo nhân vật
        characters[2] = new GameCharacter("Goblin", 100, 10) {
            @Override
            void attack(GameCharacter target) {
                System.out.printf("%s can trom %s gay %.2f sat thuong\n", this.name, target.name, attackPower);
                target.takeDamage(attackPower);
            }

            @Override
            void displayInfo() {
                System.out.printf("Ten: %s | HP: %.2f", name, hp);
            }
        };

        // Giả lập tấn công
        for (int i = 0; i < characters.length; i++) {
            // Bị hạ gục không thể tấn công
            if (characters[i].hp == 0 || characters[i] == null) {
                continue;
            }
            // Tấn công
            for (int j = 0; j < characters.length; j++) {
                if (i == j || characters[j] == null || characters[j].hp == 0) {
                    continue;
                }
                characters[i].attack(characters[j]);
            }
        }

        // Hiển thị thông tin
        System.out.println("\nTong so nhan vat da tao: " + GameCharacter.count + "\n");
        System.out.println("----- Thong so sau luot dau -----");
        for (GameCharacter gameCharacter : characters) {
            gameCharacter.displayInfo();
        }
    }
}
