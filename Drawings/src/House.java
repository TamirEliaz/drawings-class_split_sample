import processing.core.PApplet;

public class House {
	
	private int x,y;
	// Add more fields to variable-ize house
	
	public House() {
		x = 100;
		y = 150;
	}

	
	public void draw(PApplet surface) {
		
		surface.rect(x, y, 300, 200);
		
	}

	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// Add more methods to modify fields. Make sure methods sound like real actions.
	
	
	
	
	
}
