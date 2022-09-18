public class Monster extends Entity{

        private int exp;
        private String mobName;
    
        public Monster(int maxHP, int currentHP, int attackDMG, boolean isDead, int exp, String mobName) {
            super(maxHP, currentHP, attackDMG, isDead);
            setExp(exp);
            setMobName(mobName);
            
        };
    
    
        public Monster(int maxHP, int currentHP, int attackDMG, boolean isDead, String mobName) {
            super(maxHP, currentHP, attackDMG, isDead);
            setExp(1);
            setMobName(mobName);
        };
    
        public void setExp(int newExp){
            this.exp = newExp;        
        };
    
        public int getExp(){
            return this.exp;
        }

        public void setMobName(String newMobName){
            this.mobName = newMobName;        
        };
    
        public String getMobName(){
            return this.mobName;
        }
    
        @Override
        public String toString() {
            return "Monster Gives " + exp + "\nHP " + super.toString(); 
        }
        
    }
    

