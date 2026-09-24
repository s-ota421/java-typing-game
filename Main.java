import java.util.Scanner;

public class Main {
   public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("難易度を選んでください");
    System.out.println("1.Easy");
    System.out.println("2.Normal");
    System.out.println("3.Hard");
    System.out.println("決定");

    int level = scanner.nextInt();
    scanner.nextLine();

    Question question;

    if (level == 1){
        question = new EasyQuestion();
    }else if (level == 2) {
        question = new NormalQuestion();
    }else{
        question = new HardQuestion();
    }
     
    Game game = new Game();

    for (int i = 1; i <= 10; i++){

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

    System.out.println("ゲーム終了！\n10問中" + score + "問正解！");
    game.showResult();
   
}
}


