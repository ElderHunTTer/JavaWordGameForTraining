public class Rock extends Monster {

    

    public Rock(int maxHP, int currentHP, int attackDMG, boolean isDead, String mobName) {
        super(10, 10, 1, false, "Rock");
    }
    
    @Override
    public String toString() {
        return this.getMobName() + ": Go away, im just a rock!";
    }
}
