abstract class GameCharacter {
    protected String name;
    protected int hp;
    protected int attackPower;
    static int count = 0;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count = count + 1;
    }

    // Tấn công
    abstract int attack();

    // Logic nhận sát thương
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            hp = 0;
            System.out.printf("%s da bi ha guc\n", name);
        }
    }

}