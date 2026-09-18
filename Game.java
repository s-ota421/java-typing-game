public class Game {
        
    private int score = 0;
    
    public void showResult(){
        if (score == 3) {
        System.out.println("全問正解！");
    }else if(score == 2){
        System.out.println("惜しい！");
    }else{
        System.out.println("残念！");
    }
}

   public boolean checkAnswer(String input, String word){
    if (input.equals(word)) {
        score++;
        return true;
    }else{
        return false;
    }
}    

 public int getScore(){
        return  score;
    }
    }
    

