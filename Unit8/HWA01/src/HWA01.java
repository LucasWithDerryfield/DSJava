import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class HWA01 extends JFrame {

    private Board board;

    public HWA01() {
        setTitle("Board Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        board = new Board();
        board.setPreferredSize(new Dimension(350, 350));
        board.setBackground(Color.CYAN);
        getContentPane().add(board);
        transformRectangle();
        setVisible(true);
    }
    private void transformRectangle() {
        int boardWidth = board.getWidth();
        int boardHeight = board.getHeight();
        AffineTransform translation = new AffineTransform();
        translation.translate((boardWidth - 150) / 2.0, (boardHeight - 150) / 2.0);
        double centerX = boardWidth / 2.0;
        double centerY = boardHeight / 2.0;
        AffineTransform rotation = new AffineTransform();
        rotation.rotate(Math.toRadians(22.5), centerX, centerY); //rotate the rectangle
        //combine
        AffineTransform transform = new AffineTransform();
        transform.concatenate(translation);
        transform.concatenate(rotation);
        Shape transformedRectangle = transform.createTransformedShape(new Rectangle(150, 150));
        board.setTransformedRectangle(transformedRectangle);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(HWA01::new);
    }
}
class Board extends JPanel {
    private Shape transformedRectangle;
    public void setTransformedRectangle(Shape transformedRectangle) {
        this.transformedRectangle = transformedRectangle;
        repaint();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (transformedRectangle != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setColor(Color.BLACK);
            g2d.draw(transformedRectangle);
            g2d.dispose();
            
        }
    }
}