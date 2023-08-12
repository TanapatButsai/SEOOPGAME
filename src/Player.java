class Player {
    private String name;
    private Piece piece;

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public void takeTurn(Die die, Board board) {
        die.roll();
        int faceValue = die.getFaceValue();

        Square oldLocation = piece.getLocation();
        Square newLocation = board.getSquare(oldLocation, faceValue);

        piece.setLocation(newLocation);

        System.out.println(name + " rolled a " + faceValue + " and moved to " + newLocation.getName());
    }
}