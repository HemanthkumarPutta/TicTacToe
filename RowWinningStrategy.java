package Strategies;

import Models.Board;
import Models.CellState;
import Models.Move;

public class RowWinningStrategy implements WinningStrategy {

    @Override
    public boolean checkWin(Board board, Move move) {
        int row = move.getCell().getRow();

        // Iterate all the col indices for that row and check
        // all the cells are occupied by the same player.

        // P1
        // P1 P1 P2

        for (int i = 0; i < board.getCells().size(); i++) {
            if (board.getCells().get(row).get(i).getCellState()
                    != CellState.OCCUPIED ||
                    board.getCells().get(row).get(i).getPlayer()
                            != move.getCell().getPlayer()) {
                return false;
            }

        }

        return true;
    }
}
