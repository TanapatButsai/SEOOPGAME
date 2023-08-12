class MGame {
    private Die[] dice;
    private Board board;
    private Player[] players;
    private int roundCnt;

    public MGame(int numPlayers, int boardSize, int numRounds) {
        dice = new Die[numPlayers];
        board = new Board(boardSize);
        players = new Player[numPlayers];
        roundCnt = numRounds;

        for (int i = 0; i < numPlayers; i++) {
            dice[i] = new Die();
            Square startingSquare = board.getSquare(1); // Starting at the first square
            Piece piece = new Piece(startingSquare);
            players[i] = new Player("Player " + (i + 1), piece);
        }
    }

    public void playGame() {
        for (int round = 1; round <= roundCnt; round++) {
            System.out.println("Round " + round);

            for (Player player : players) {
                player.takeTurn(dice[getPlayerIndex(player)], board);
            }
        }
    }

    private int getPlayerIndex(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == player) {
                return i;
            }
        }
        return -1;
    }
}
