package Crayon;

import java.awt.*;
import javax.swing.*;

class Crayon {
    private Color color;
    private int length; // Height of the crayon

    public Crayon(Color color, int length) {
        this.color = color;
        this.length = length;
    }

    public Color getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }
}

class BoxOfCrayons extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Crayon[] crayons;

    public BoxOfCrayons(Crayon[] crayons) {
        this.crayons = crayons;
        setPreferredSize(new Dimension(500, 200));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 20;
        int y = 20;
        int crayonWidth = 30;
        int boxGap = 5;

        for (Crayon crayon : crayons) {
            g.setColor(crayon.getColor());
            g.fillRect(x, y, crayonWidth, crayon.getLength());
            g.setColor(Color.BLACK);
            g.drawRect(x, y, crayonWidth, crayon.getLength());
            x += crayonWidth + boxGap;
        }
    }
}

public class DrawCrayonBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Box of Crayons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Crayon[] crayons = {
            new Crayon(Color.RED, 100),
            new Crayon(Color.BLUE, 80),
            new Crayon(Color.GREEN, 120),
            // Add more crayons as needed
        };

        BoxOfCrayons box = new BoxOfCrayons(crayons);
        frame.getContentPane().add(box);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
