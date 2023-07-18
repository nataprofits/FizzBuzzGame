package PackedgeFizz;

import PackedgeFizz.FizzBuzzGame;
import PackedgeFizz.Game;

public class GameManager {
    private Game game;
    private UserInput userInput;
    public GameManager(Game game, UserInput userInput){
        this.game = game;
        this.userInput = userInput;
    }

    public void startGame() {
        String userName = userInput.getNameFromInput();
        int counter = userInput.getCounterFromInput();
        game = new FizzBuzzGame(counter);
        System.out.println("Let`s start the game, " + userName + "!");
        game.play();
    }
}
