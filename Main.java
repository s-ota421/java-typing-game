import java.util.Scanner;

public class Main {
   public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
     
    Game game = new Game();
    Question question = new Question();

    for (int i = 1; i <= 4; i++){

        String word = question.getQuestion();

        System.out.println("第" + i + "問");
        System.out.println(word);
         System.out.print("入力してください：");

         String input = scanner.nextLine();

    if(game.checkAnswer(input,word)){
        System.out.println("OK!");
    
    }else{
        System.out.println("NG!");
    }

    
    }
    int score = game.getScore();

    System.out.println("ゲーム終了！\n3問中" + score + "問正解！");
    game.showResult();
   
}
}


