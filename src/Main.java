import board.Board;
import mark.MarkIdentifier;
import player.Player;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Max", MarkIdentifier.X,1);
        Player player2 = new Player("Vlad", MarkIdentifier.O,2);
        Board board = new Board();
        TicTacToe ticTacToe = new TicTacToe(player1, player2, board);
    }
}
