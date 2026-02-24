public class Main {
    public static void main(String[] args) {
        // Tạo nhân vật
        GameCharacter character1 = new Warrior("Vieggo", 320, 38, 10);
        GameCharacter character2 = new Warrior("Yone", 240, 42, 8);
        GameCharacter character3 = new Mage("Lux", 190, 50, 150);
        GameCharacter goblin = new GameCharacter("Goblin", 120, 18) {
            @Override
            void displayInfo() {
                System.out.printf("Ten: %s | HP: %.2f", this.name, this.hp);
            }

            @Override
            void attack(GameCharacter target) {
                target.takeDamage(attackPower);
            }
        };

        // Thêm nhân vật
        GameManagement.addCharacter(character1);
        GameManagement.addCharacter(character2);
        GameManagement.addCharacter(character3);
        GameManagement.addCharacter(goblin);

        // Tấn công
        while (GameManagement.length > 1) {
            // int randomAttack = Math.random()
            int randomAttack = (int) (Math.random() * GameManagement.length);
            int randomTakeAttack = (int) (Math.random() * GameManagement.length);

            GameCharacter attacker = GameManagement.characters[randomAttack];
            GameCharacter takeAttacker = GameManagement.characters[randomTakeAttack];

            // Không tự đánh chính mình
            if (attacker == takeAttacker) {
                continue;
            }

            // Kiểm tra null
            if (attacker == null
                    || takeAttacker == null) {
                continue;
            }

            // Kiểm tra xem nhân vật còn sống không
            if (attacker.hp <= 0
                    || takeAttacker.hp <= 0) {
                continue;
            }

            // Sử dụng kĩ năng đặc biệt
            int randomUseUlti = (int) (Math.random() * 2);

            if (randomUseUlti == 0) {
                attacker.attack(takeAttacker);
            } else {
                if (attacker instanceof Warrior) {
                    ((Warrior) attacker).useUltimate(takeAttacker);
                } else if (attacker instanceof Mage) {
                    ((Mage) attacker).useUltimate(takeAttacker);
                }
            }

            // Xóa khỏi mảng nếu đã bị hạ gục
            if (GameManagement.characters[randomTakeAttack].hp <= 0) {
                GameManagement.deleteCharacter(GameManagement.characters[randomTakeAttack]);
            }
        }

        // In người chiến thắng
        System.out.printf("Nhan vat chien thang: %s", GameManagement.characters[0].name);
    }
}
