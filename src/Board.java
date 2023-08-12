class Board {
    private Square[] squares;

    public Board(int size) {
        squares = new Square[size];

        for (int i = 0; i < size; i++) {
            squares[i] = new Square("Square " + (i + 1));
        }
    }

    public Square getSquare(Square currentLocation, int steps) {
        int currentIdx = -1;
        for (int i = 0; i < squares.length; i++) {
            if (squares[i] == currentLocation) {
                currentIdx = i;
                break;
            }
        }

        int newIdx = Math.min(currentIdx + steps, squares.length - 1);
        return squares[newIdx];
    }
    public int getSize() {
        return squares.length;
    }

    public Square getSquare(int index) {
        if (index >= 0 && index < squares.length) {
            return squares[index];
        } else {
            return null;
        }
    }

    public Square getNextSquare(Square currentSquare, int steps) {
        int currentIndex = -1;
        for (int i = 0; i < squares.length; i++) {
            if (squares[i] == currentSquare) {
                currentIndex = i;
                break;
            }
        }

        int newIndex = Math.min(currentIndex + steps, squares.length - 1);
        return squares[newIndex];
    }
}







