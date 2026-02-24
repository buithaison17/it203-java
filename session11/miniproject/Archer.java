class Archer extends GameCharacter implements ISkill {
    private double critChance;

    public Archer(String name, double hp, double attackPower, double critChance) {
        super(name, hp, attackPower);
        this.critChance = critChance;
    }

    @Override
    void attack(GameCharacter target) {

        System.out.printf("%s ban ten vao %s\n", name, target.name);

        double damage = attackPower;

        if (Math.random() < critChance) {
            damage *= 2;
        }

        target.takeDamage(damage);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.printf("%s dung Tuyet Ky: Ban Xuyen Pha!\n", name);
        double damage = attackPower * 2.5;
        target.takeDamage(damage);
    }

    @Override
    void displayInfo() {
        System.out.printf("Archer | Ten: %s | HP: %.2f | Crit: %.2f%%\n",
                name, hp, attackPower, critChance * 100);
    }
}