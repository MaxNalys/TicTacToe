import board.Board;
import board.PrintBoard;
import player.Player;
import java.util.Scanner;


public class TicTacToe {
    private Player player1;
    private Player player2;
    private Board board;

    public TicTacToe(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
        startGame();
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        int position;
        int count = 0;
        Player player;
        while (true) {
            count++;
            if(count%2==0){
                player=player2;
            }else{
                player=player1;
            }
            PrintBoard.printBoard(board);
            System.out.println("\n");
            System.out.println(player.getName() + "`s " + "move\n");
            position = scanner.nextInt() - 1;
            move(player, position);
            if(isWin()){
                PrintBoard.printBoard(board);
                System.out.println("\n");
                System.out.println(player.getName()+" is WINNER");
                break;
            }
        }
    }


    public void move(Player player, int position) {
        try {
            board.setMarkOnTheBoard(player.getMarkIdentifier(), position);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong number\n");
        }
    }

    public boolean isWin() {
        if (board.getMarkFromBoard(0) != null && board.getMarkFromBoard(0).equals(board.getMarkFromBoard(1)) && board.getMarkFromBoard(1).equals(board.getMarkFromBoard(2))) {
            return true;
        } else if (board.getMarkFromBoard(3) != null && board.getMarkFromBoard(3).equals(board.getMarkFromBoard(4)) && board.getMarkFromBoard(4).equals(board.getMarkFromBoard(5))) {
            return true;
        } else if (board.getMarkFromBoard(6) != null && board.getMarkFromBoard(6).equals(board.getMarkFromBoard(7)) && board.getMarkFromBoard(7).equals(board.getMarkFromBoard(8))) {
            return true;
        }
        if (board.getMarkFromBoard(0) != null && board.getMarkFromBoard(0).equals(board.getMarkFromBoard(3)) && board.getMarkFromBoard(3).equals(board.getMarkFromBoard(6))) {
            return true;
        } else if (board.getMarkFromBoard(1) != null && board.getMarkFromBoard(1).equals(board.getMarkFromBoard(4)) && board.getMarkFromBoard(4).equals(board.getMarkFromBoard(7))) {
            return true;
        } else if (board.getMarkFromBoard(2) != null && board.getMarkFromBoard(2).equals(board.getMarkFromBoard(5)) && board.getMarkFromBoard(5).equals(board.getMarkFromBoard(8))) {
            return true;
        } else if (board.getMarkFromBoard(0) != null && board.getMarkFromBoard(0).equals(board.getMarkFromBoard(4)) && board.getMarkFromBoard(4).equals(board.getMarkFromBoard(8))) {
            return true;
        } else if (board.getMarkFromBoard(2) != null && board.getMarkFromBoard(2).equals(board.getMarkFromBoard(4)) && board.getMarkFromBoard(4).equals(board.getMarkFromBoard(6))) {
            return true;
        }
        return false;
    }
}
