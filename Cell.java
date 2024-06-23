package Models;


public class Cell {
    private int row;
    private int col;
    private Player player;
    private CellState cellState;



    public Cell(int row, int col, Player player, CellState cellState) {
        this.row = row;
        this.col = col;
        this.player = player;
        this.cellState = CellState.FREE;
    }

    public Cell(int i, int j) {
        row=i;col=j;
        this.cellState = CellState.FREE;
    }

    public CellState getCellState() {
        return cellState;
    }

    public Player getPlayer() {
        return player;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
