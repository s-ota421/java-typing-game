import java.util.Random;
import java.util.ArrayList;

public class Question {

    private ArrayList<String>words = new ArrayList<>();
    private boolean[] used;
    public Question(){
    
   words.add("cat");
   words.add("book");
   words.add("java");
   words.add("dog");
   words.add("ice");
   words.add("fish");
   words.add("blue");
   words.add("tree");
   words.add("milk");
   words.add("game");
    words.add("apple");
    words.add("banana");
    words.add("school");
    words.add("orange");
    words.add("window");
    words.add("flower");
    words.add("summer");
    words.add("friend");
    words.add("coffee");
    words.add("planet");
   words.add("keyboard");
   words.add("computer");
   words.add("program");
   words.add("internet");
   words.add("example");
   words.add("developer");
   words.add("language");
   words.add("practice");
   words.add("question");
   words.add("software");


    used = new boolean[words.size()];

    }
    public  String getQuestion(){
        return getQuestion(0, words.size());
    }

    public  String getQuestion(int start, int end){
    Random random = new Random();
    int index = random.nextInt(end - start) + start;

    while (used[index]) {
        index = random.nextInt(end - start) + start;
    }
    used[index] = true;
    return words.get(index);
}
}



