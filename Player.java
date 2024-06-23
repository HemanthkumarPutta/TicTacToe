package Models;

import java.util.Scanner;

public class Player {
    private String name;
    private Character symbol;
    private int id;
    private PlayerType playerType;

    public Player(String name, Character symbol, int id, PlayerType playerType) {
        this.name = name;
        this.symbol = symbol;
        this.id=id;
        this.playerType = playerType;
    }

    public Move makeMove(Board board) {
        // User input
        Scanner sc = new Scanner(System.in);
        System.out.println("Row? ");
        int row = sc.nextInt();
        System.out.println("Col? ");
        int col = sc.nextInt();

        Cell cell = new Cell(row, col, this, CellState.OCCUPIED);

        return new Move(cell);
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public Character getSymbol() {
        return symbol;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
