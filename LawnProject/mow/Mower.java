package mow;

public class Mower {
    private int dir;
    private int row;
    private int col;

    //Constructor is used to initialize
    public Mower(int initialRow, int initialCol, int initialDirection) {
        this.row = initialRow;
        this.col = initialCol;
        this.dir = initialDirection;
    }

    //Mover method
    public void Forward() {
        if (dir == 0) //Looking up
            row--;
        else if (dir == 1) //Looking right
            col++;
        else if (dir == 2) //Looking down
            row++;
        else if (dir == 3) //Looking left
            col--;
    }

    //Checks next position
    public char CheckPosition(Yard yard) {
        int nextRow = row, nextCol = col;

        if (dir == 0) //Moves up
            nextRow--;
        else if (dir == 1) //Moves right
            nextCol++;
        else if (dir == 2) //Moves down
            nextRow++;
        else if (dir == 3) //Moves left
            nextCol--;

        return yard.lawnStatus(nextRow, nextCol);
    }

    //Cuts grass
    public void cutGrass(Yard yard) {
        yard.lawnMow(row, col, '-');
    }

    public int dirFind() {
        return dir;
    }

    public int colFind() {
        return col;
    }
}

