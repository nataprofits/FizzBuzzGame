import PackedgeFizz.*;

public class App {
    public static void main(String[] args){
        UserInput userInput = new User();
        Game game = new FizzBuzzGame(0);
        GameManager gameManager = new GameManager(game, userInput);
        gameManager.startGame();
    }
}
