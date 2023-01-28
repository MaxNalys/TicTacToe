package board;
import mark.MarkIdentifier;

public class Board {
    private MarkIdentifier[] board;
    public static final int BOARD_SIZE = 9;

    public Board() {
        this.board = new MarkIdentifier[BOARD_SIZE];
    }

    public MarkIdentifier[] getBoard() {
        return board;
    }

    public void setMarkOnTheBoard(MarkIdentifier mark, int position) {
        if(board[position]==null) {
            board[position] = mark;
        }
    }
    public MarkIdentifier getMarkFromBoard(int position){
        return board[position];
    }
}
