package board;

public class PrintBoard {

    public static void printBoard(Board board) {
        for (int i = 0; i < Board.BOARD_SIZE; i++) {
            if(i==3||i==6){
                System.out.println();
            }
            if (board.getMarkFromBoard(i) == null) {
                System.out.print("\t-");
            } else {
                System.out.print("\t"+board.getMarkFromBoard(i).toString());
            }

        }
    }
}
