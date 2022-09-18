
public class Main {
    public static void main(String[] args) throws Exception {
        


        System.out.println("Hello, World!");
        
        //Variable tests
        Player player = new Player(100, 50, 10, false);
        System.out.println(player.getMaxHP());
        System.out.println(player.getCurrentHP());
        System.out.println(player.getAttackDMG());
        System.out.println(player.getIsDead());
        System.out.println(player.getLevel());
        System.out.println(player.toString());

        //gamelogic
        GameLogic game = new GameLogic();
        game.iniGame();
        
        }
}
