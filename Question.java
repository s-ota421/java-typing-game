import java.util.Random;
import java.util.ArrayList;

public class Question {

    private ArrayList<String>words = new ArrayList<>();
    private boolean[] used;
    public Question(){
    words.add("apple");
    words.add("cat");
    words.add("book");
    words.add("banana");

    used = new boolean[words.size()];

    }

    public  String getQuestion(){
    Random random = new Random();
    int index = random.nextInt(words.size());

    while (used[index]) {
        index = random.nextInt(words.size());
    }
    used[index] = true;
    return words.get(index);
}
}



