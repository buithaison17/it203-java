class Warrior extends GameCharacter implements ISkill {
    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    // Getter và setter
    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    // Tấn công thường
    @Override
    int attack() {
        return attackPower;
    }

    // Sát thương nhận khi bị tấn công
    @Override
    public void takeDamage(int damage) {
        int realDamage = damage - armor < 0 ? 0 : damage - armor;
        super.takeDamage(realDamage);
    }

    // Sử dụng kĩ năng đặc biệt nhân đôi sát thương giảm 10% máu
    @Override
    public int useUltimate() {
        System.out.printf("%s su dung Dam ngan can\n", name);
        hp -= hp * 0.1;
        return attackPower * 2;
    }

}
