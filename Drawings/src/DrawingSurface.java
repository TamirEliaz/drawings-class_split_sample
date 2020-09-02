import processing.core.PApplet;

public class DrawingSurface extends PApplet {

	// FIELDS
	private House h;
	
	
	// CONSTRUCTOR - Initialize any added fields here.
	public DrawingSurface() {
		h = new House();
	}
	
	
	// METHODS
	// Add processing methods here. See the documentation at processing.org for reference.
	public void setup() {
		
	}
	
	public void draw() {
		h.draw(this);
	}
	
	// Add methods for user interaction. Check the processing reference for info on this (http://processing.org).
	// We'll also review how to get mouse/keys working in class.
	
	
	
}
