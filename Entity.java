abstract class Entity {
    private int maxHP;
    private int currentHP;
    private int attackDMG;
    private boolean isDead;

    public Entity(int maxHP, int currentHP, int attackDMG, boolean isDead){
        //is super needed?
        // super();
        setMaxHP(maxHP);
        setCurrentHP(currentHP);
        setAttackDMG(attackDMG);
        setIsDead(isDead);
    };

    public void setMaxHP(int newMaxHP){
        this.maxHP = newMaxHP;
     };
     public int getMaxHP() {
        return this.maxHP;
     };
    public void setCurrentHP(int newCurrentHP){
        this.currentHP = newCurrentHP;
        if(currentHP <= 0){
            isDead = true;
        }
     };
     public int getCurrentHP() {
        return this.currentHP;
    };
    public void setAttackDMG(int newAttackDMG){
        this.attackDMG = newAttackDMG;
     };
     public int getAttackDMG() {
        return this.attackDMG;
    };
    public void setIsDead(boolean newIsDead){
        this.isDead = newIsDead;
     };
     public boolean getIsDead() {
        return this.isDead;
    };

    @Override
    public String toString() {
        return currentHP + "/" + maxHP;
    }
}

