package mow;

public class Yard {
    int width;
    int height;
    char[][] LAWN;
    public char LAWN_ARRAY[][];

    public Yard(int width, int height) {
        this.width = width;
        this.height = height;
        LAWN = new char[height][width];
        createLawn(width, height);
    }

    public void createLawn(int width, int height) {
        char[][] lawnArray = new char[height][width];
        // -- EDGES --

        int height1 = lawnArray.length;
        int width1 = lawnArray[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height1 - 1) {
                    lawnArray[i][j] = 'R';
                } else {
                    if (j == 0 || j == width1 - 1) {
                        lawnArray[i][j] = 'R';
                    } else {
                        lawnArray[i][j] = '+';
                    }
                }

            }
        }

        int w = 0;

        for (int i = 0; i < lawnArray.length; i++) { //left edge
            if (i == lawnArray.length - 1)
                w++;
            if (lawnArray[i][w] == 'R') {
            } else {
                lawnArray[i][w] = '+'; //add unmowed grass
            }
        }
        LAWN_ARRAY = lawnArray;
    }

    public char lawnStatus(int row, int col) {
        char returner = (LAWN_ARRAY[row][col]);
        return returner;
    }

    public char lawnMow(int r, int c, char mower) {
        LAWN_ARRAY[r][c] = mower;
        return mower;
    }

    public int heightFind() { //not including red bricks
        int heighter = LAWN_ARRAY.length - 2;
        return heighter;
    }

    public int widthFind() { //not including red bricks
        int widther = LAWN_ARRAY[0].length - 2;
        return widther;
    }

    public void printLawn(Mower mower) {
        int height = LAWN_ARRAY.length;
    int width = LAWN_ARRAY[0].length;
    for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
            if (mower != null && i == mower.dirFind() && j == mower.dirFind()) {
                //Change the icon of the mover depending
                if (mower.dirFind() == 0) {
                    System.out.print("^");
                } else if (mower.dirFind() == 1) {
                    System.out.print(">");
                } else if (mower.dirFind() == 2) {
                    System.out.print("v");
                } else if (mower.dirFind() == 3) {
                    System.out.print("<");
                }
            } else {
                System.out.print(LAWN_ARRAY[i][j]);
            }
        }
        System.out.println();
    }
    }
}