public class Main {
    public static void main(String[] args) {
        // Khởi tạo nhân vật
        GameCharacter[] characters = new GameCharacter[3];
        characters[0] = new Warrior("sonbui", 5000, 1000, 2000);
        characters[1] = new Mage("tron", 2000, 800, 1000);
        characters[2] = new GameCharacter("goblin", 200, 100) {
            @Override
            int attack() {
                System.out.println("Goblin tan cong");
                return attackPower;
            }
        };

        // Giả lập tấn công
        for (int i = 0; i < characters.length; i++) {
            // Nếu không có nhân vật hoặc nhân vật đã bị hạ gục không cho phép tấn công
            if (characters[i] == null || characters[i].hp == 0) {
                continue;
            }
            for (int j = 0; j < characters.length; j++) {
                // Nếu không có nhân vật hoặc nhân vật đã chết không thể bị tấn công
                if (i == j || characters[j] == null || characters[j].hp == 0) {
                    continue;
                }
                // Tấn công
                System.out.printf("%s tan cong thuong %s\n", characters[i].name, characters[j].name);
                int damage = characters[i].attack();
                characters[j].takeDamage(damage);
                ;
                // Random sử dụng Ulti
                int useUlti = (int) (Math.random() * ((2 - 1) + 1)) + 1;
                // Nếu nhân vật là Warrior hoặc Mage và nhân vật bị tấn công chưa bị hạ gục thì
                // cho phép dùng Ulti
                if (useUlti == 1 && characters[i] instanceof ISkill && characters[j].hp != 0) {
                    System.out.printf("%s su dung ki nang dac biet tan cong %s\n", characters[i].name,
                            characters[j].name);
                    int ultiDamage = ((ISkill) characters[i]).useUltimate();
                    characters[j].takeDamage(ultiDamage);
                }
            }
        }
        // In kết quả
        System.out.println("Tong so nhan vat: " + GameCharacter.count);
        for (GameCharacter character : characters) {
            if (character instanceof Warrior) {
                System.out.printf("Ten nhan vat: %s | HP: %d | Attack Power: %d | Armor: %d |\n", character.name,
                        character.hp, character.attackPower, ((Warrior) character).getArmor());
            } else if (character instanceof Mage) {
                System.out.printf("Ten nhan vat: %s | HP: %d | Attack Power: %d | Mana: %d\n", character.name,
                        character.hp, character.attackPower, ((Mage) character).getMana());
            } else {
                System.out.printf("Ten nhan vat: %s | HP: %d | Attack Power:%d\n", character.name, character.hp,
                        character.attackPower);
            }
        }
    }
}
