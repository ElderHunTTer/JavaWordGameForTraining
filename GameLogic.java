import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class GameLogic {

    Scanner sc = new Scanner(System.in);
    Monster enemy;
    Player player = new Player(100, 100, 25, false);


    public void iniGame() {
        System.out.println("Young Adventurer, What is your name?");
        String scName = sc.nextLine();
        player.setName(scName);
        System.out.println("Your name is " + player.getName());
        summonMob();
        }

    public void summonMob(){
        ArrayList<Monster> mobs = new ArrayList<Monster>();
        mobs.add(new Rock(10, 10, 1, false, "Rock") );
        mobs.add(new Rock(25, 20, 3, false, "Sad Rock") );
        mobs.add(new Turtle(100, 100, 5, false, "Turtle"));
        mobs.add(new Turtle(120, 120, 15, false, "Spike Turtle"));
        mobs.add(new Dragon(500, 500, 15, false, 200, "Dragon"));
        for (Monster monster : mobs) {
            monster.setAttackDMG(monster.getAttackDMG() * player.getLevel());
             }
        Random random = new Random(); 
        int index = random.nextInt(mobs.size());
        enemy = mobs.get(index);
        System.out.println("You've been Ambushed by " + enemy.getMobName());
        System.out.println("To engage the monster or perform attacks Type in the counter move");
        combatEnemy();
        }

    public void combatEnemy(){
        if(enemy.getIsDead() == true){
            youWon();
        }
        else if(player.getIsDead() == true){
            System.out.println(enemy.toString() + ": GG EZ");
        }
        else if(enemy.getIsDead() == false){
            // if(enemy.getMobName() == "Rock"){
                WordList wordList = new WordList();
                String enemyWord;
                enemyWord = wordList.generateWord();
                System.out.println("The counter move is... " + enemyWord);
                String playerWord = sc.nextLine();

                    if(enemyWord.equals(playerWord)){
                    enemy.setCurrentHP(enemy.getCurrentHP() - player.getAttackDMG());
                    System.out.println(enemy.toString() + " took" + player.getAttackDMG() + " Damage");
                    combatEnemy();
                }
                    else{
                    player.setCurrentHP(player.getCurrentHP() - enemy.getAttackDMG());
                    System.out.println("You took " + enemy.getAttackDMG() + " in Damage");
                    combatEnemy();
                }
            // }
        }
    }


     public void youWon(){
        System.out.println("Congratualtion! You recieved " + enemy.getExp() + "Experience");
        player.setExpGained(player.getExpGained() + enemy.getExp());
        System.out.println("Ready for next Monster? Y/N");
        String yesNo = sc.nextLine();
                if(yesNo.equals("Y")){
                    summonMob();
                    }
                else if(yesNo.equals("N")){
                System.out.println("Live to fight another day! Goodbye!");
                sc.close();
                    }
                    else{
                        try {
                            throw new Exception("Access denied - You must be at least 18 years old.");
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                

        }


     }

    
            
    
