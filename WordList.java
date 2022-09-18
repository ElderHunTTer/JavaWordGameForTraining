import java.util.ArrayList;
import java.util.Random;

public class WordList {
    ArrayList<String> words;
    String chosenWord;
    int index;

    public WordList(){
        words = new ArrayList<String>();
    }
    public void addWord(){
        words.add("Slash");
        words.add("Stab");
        words.add("Strike");
        words.add("Punch");
        words.add("Slap");
        words.add("Push");
        words.add("Kick");
        words.add("Stare");
        words.add("Pinch");
    }

    public String generateWord() {
        addWord();
        Random random = new Random(); 
        int index = random.nextInt(words.size());
        chosenWord = words.get(index);
        return chosenWord;
    }
    
    // public String chosenWord(){
    //     return this.chosenWord();
    // }
}
