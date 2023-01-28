package board;

import mark.MarkIdentifier;

public class PrintBoard {
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW



    public static void printBoard(Board board) {
        for (int i = 0; i < Board.BOARD_SIZE; i++) {
            if(i==3||i==6){
                System.out.println();
            }
            if (board.getMarkFromBoard(i) == null) {
                System.out.print(CYAN_BOLD_BRIGHT+"\t-");
            } else {
                if(board.getMarkFromBoard(i).equals(MarkIdentifier.X)){
                    System.out.print("\t"+(RED_BOLD+board.getMarkFromBoard(i).toString()));
                }else {
                    System.out.print("\t" + (YELLOW_BOLD_BRIGHT+board.getMarkFromBoard(i).toString()));
                }
            }

        }
    }
}
