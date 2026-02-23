class Mage extends GameCharacter implements ISkill {
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    // Tấn công thường
    @Override
    int attack() {
        if (mana >= 5) {
            mana -= 5;
            return attackPower;
        } else {
            return attackPower / 2;
        }
    }

    // Sử dụng kĩ năng đặc biệt
    @Override
    public int useUltimate() {
        System.out.printf("%s su dung Hoa cau\n", name);
        mana -= 50;
        return attackPower * 3;
    }
}
