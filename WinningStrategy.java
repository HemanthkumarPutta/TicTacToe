package Strategies;

import Models.Board;
import Models.Move;

public interface WinningStrategy {


    boolean checkWin(Board board, Move move);
}
