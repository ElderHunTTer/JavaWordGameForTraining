public class Player extends Entity{

    private int level;
    private String name;
    private int expGained = 0;

    public Player(int maxHP, int currentHP, int attackDMG, boolean isDead, String name, int level) {
        super(maxHP, currentHP, attackDMG, isDead);
        setLevel(level);
    }


    public Player(int maxHP, int currentHP, int attackDMG, boolean isDead, String name) {
        super(maxHP, currentHP, attackDMG, isDead);
        setLevel(1);
    }

    public Player(int maxHP, int currentHP, int attackDMG, boolean isDead) {
        super(maxHP, currentHP, attackDMG, isDead);
        setLevel(1);
        setName("Adventurer");
    }

    public void setLevel(int newLevel){
        this.level = newLevel;        
    }

    public int getLevel(){
        return this.level;
    }

    public void setName(String newName){
        this.name = newName;        
    }

    public String getName(){
        return this.name;
    }

    public void setExpGained(int newExpGained){
        this.expGained = newExpGained;   
        switch (expGained) {
            case 0:
                level = 0;
                break;
            case 1:
                System.out.println("You are level 1");
                level = 1;
                break;
            case 100:
            System.out.println("You are level 2");
                level = 2;
                break;
            case 500:
            System.out.println("You are level 3");
                level = 3;
                break;
        
            default:
                break;
        }     
    }

    public int getExpGained(){
        return this.expGained;
    }

    @Override
    public String toString() {
        return "Player Level " + level + "\nHP " + super.toString(); 
    }
    
}
