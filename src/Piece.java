class Piece {
    private Square location;

    public Piece(Square startingLocation) {
        location = startingLocation;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square newLocation) {
        location = newLocation;
    }
}
