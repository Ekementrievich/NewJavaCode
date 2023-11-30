package box;

class Box {
	private double height;
	private double width;
	private double depth;
	private boolean full;
	
	// Constructor to initialize height, width and depth
	public Box(double height, double width, double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.full = false;
	}
	
	// Getter for the height
	public double getHeight() {
		return height;
	}
	
	// Setter for height
	public void setHeight(double height) {
		this.height = height;
	}
	
	// Getter for width
	public double getWidth() {
		return width;
	}
	
	// Setter for width
	public void setWidth(double width) {
		this.width = width;
	}
	
	// Getter for depth
	public double getDepth() {
		return depth;
	}
	
	// Setter for depth
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	// Getter for full 
	public boolean isFull() {
		return full;
	}
	
	// Setter for full
	public void setFull(boolean full) {
		this.full = full;
	}
	
	// Return a one line description of the box
	public String toString() {
		return "Box: height = " + height + " Width = " + width + " Depth = " + depth + " Full = " + full;
	}
}

