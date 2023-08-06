import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Board board = new Board();
        MGame mGame = new MGame();
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        mGame.playGame(players);
    }
}