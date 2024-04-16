import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class HWA01 extends JFrame {

    public HWA01() {
        setTitle("Rectangle Rotate");
        //Make the board for drawing
        Board board = new Board();
        board.setPreferredSize(new Dimension(350, 350));
        board.setBackground(Color.CYAN);
        //add it to the display
        getContentPane().add(board);
        //center and display
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HWA01()); //necessary? wouldnt work and found this.
    }
    //AffineTransform was a bit difficult to use. Think I got it though.
    static class Board extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            //use affinetransform to center
            AffineTransform transform = new AffineTransform();
            transform.translate((getWidth() - 150) / 2.0, (getHeight() - 150) / 2.0);
            //spin
            transform.rotate(Math.toRadians(22.5), 75, 75);
            //utilize
            Graphics2D alpha = (Graphics2D) g;
            alpha.setTransform(transform);
            //color & draw
            alpha.setColor(Color.RED);
            alpha.fillRect(0, 0, 150, 150);
            //display text
            transform.rotate(Math.toRadians(337.5), 75, 75);
            alpha.setColor(Color.BLUE);
            alpha.drawString("Hello, world!", 50, 350);
        }
    }
}