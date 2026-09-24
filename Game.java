public class Game {
        
    private int score = 0;
    
    public void showResult(){
        switch (score) {
            case 10:
                System.out.println("完璧！");
                break;
            case 8:
            case 9:
                System.out.println("惜しい！");
                break;
            case 6:
            case 7:
                System.out.println("いい感じ！");
                break;
            case 4:
            case 5:
                System.out.println("頑張ろう！");
                break;
            default:
                System.out.println("残念！");
                break;
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
    

