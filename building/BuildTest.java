package building;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class BuildTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Random Skyline");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		// Create and add random buildings to the skyline
		Random random = new Random();
		int numBuildings = random.nextInt(5) + 3;  // Randomly choose between 3 to 7 buildings
		
		for (int i = 0; i < numBuildings; i++) {
			int buildingWidth = random.nextInt(150) + 50;  // Random width between 50 and 200
			int buildingHeight = random.nextInt(400) + 200; // Random height between 200 and 600 
			Building building = new Building(buildingWidth, buildingHeight);
			frame.add(building);
		}
		
		frame.pack();
		frame.setVisible(true);		

	}

}
