package mow;
import java.util.Random;

public class Mower {
    private int dir;
    private int row;
    private int col;

    public Mower(int initialRow, int initialCol, int initialDirection) {
        this.row = initialRow;
        this.col = initialCol;
        this.dir = initialDirection;
    }
    //randomize starting position
    public void randomizeMower(Yard yard) {
        Random rando = new Random();
        int height = yard.heightFind();
        int width = yard.widthFind();
        int corner = rando.nextInt(4);
        System.out.println("Corner: " + corner);
        //TOP LEFT
        if (corner == 0) {
            row = 1;
            col = 1;
            //TOP RIGHT
        } else if (corner == 1) {
            row = 1;
            col = width + 1;
            //BOTTOM LEFT
        } else if (corner == 2) {
            row = height + 1;
            col = 1;
            //BOTTOM RIGHT
        } else if (corner == 3) {
            row = height + 1;
            col = width + 1;
        }
        dir = rando.nextInt(4);
        System.out.println("Initial position: (" + row + ", " + col + ")");
    }

    public void Forward(Yard yard) {
        int nextRow = row, nextCol = col;
        if (dir == 0)
            nextRow--;
        else if (dir == 1)
            nextCol++;
        else if (dir == 2)
            nextRow++;
        else if (dir == 3)
            nextCol--;
    
        char nextPosition = yard.lawnStatus(nextRow, nextCol);
        if (nextPosition == '-' || nextPosition == '+') {
            cutGrass(yard);
            row = nextRow;
            col = nextCol;
        } else if (nextPosition == 'R') {
            if ((dir == 0 && row == 1) || (dir == 1 && col == yard.widthFind()) ||
                (dir == 2 && row == yard.heightFind()) || (dir == 3 && col == 1)) {
                dir = (dir + 1) % 4;
            } else {
                dir = (dir - 1 + 4) % 4;
            }
        }
    }

    //return true if there is grass to cut
    public boolean updateMower(Yard yard) {
        char nextPosition = CheckPosition(yard);
        if (nextPosition == '+') {
            Forward(yard);
            return true;
        } else{
            return false;
        }
    }

    public char CheckPosition(Yard yard) {
        int nextRow = row, nextCol = col;

        if (dir == 0)
            nextRow--;
        else if (dir == 1)
            nextCol++;
        else if (dir == 2)
            nextRow++;
        else if (dir == 3)
            nextCol--;

        return yard.lawnStatus(nextRow, nextCol);
    }

    public void cutGrass(Yard yard) {
        yard.lawnMow(row, col, '-');
    }

    public int dirFind() {
        return dir;
    }

    public int colFind() {
        return col;
    }

    public int rowFind() {
        return row;
    }
}