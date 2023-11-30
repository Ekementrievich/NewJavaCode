package building;


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Building extends JPanel {
	private int width;
	private int height;
	
	public Building(int width, int height) {
		this.width = width;
		this.height = height;
		setPreferredSize(new Dimension(width, height));
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Draw the building as a black rectangle
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, width, height);
		
		// Random generate and draw yellow windows
		Random random = new Random();
		int numWindows = random.nextInt(5) + 1; // Randomly chooses between 1 to 5 windows
		int windowWidth = width / 6; // width of each window
		int windowHeight = height / (numWindows + 1); // Height for each window
		
		g.setColor(Color.YELLOW);
		for (int i = 0; i < numWindows; i++) {
			int x = random.nextInt(width - windowWidth);
			int y = (i + 1)* windowHeight;
			g.fillRect(x, y, windowWidth, windowHeight);
		}
	}

}
