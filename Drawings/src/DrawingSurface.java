import java.awt.event.KeyEvent;
import processing.event.MouseEvent;
import processing.core.PApplet;

public class DrawingSurface extends PApplet {

	// FIELDS
	private House h;
	private Person p;
	private int DRAWING_WIDTH;
	private int DRAWING_HEIGHT;
	
	// CONSTRUCTOR - Initialize any added fields here.
	public DrawingSurface() {
		h = new House();
		p = new Person();
	}
	
	
	// METHODS
	// Add processing methods here. See the documentation at processing.org for reference.
	public void setup() {
		
	}
	
	public void draw() {
		background(255);
		scale((float)width/DRAWING_WIDTH, (float)height/DRAWING_HEIGHT);
		
		h.draw(this);
		p.draw(this);
		
		
		
		pushStyle();
		
//		fill(0);
//		textSize(10);
//		text("", , );
		
		popStyle();
	}
	
	public void mousePressed() {
		float scaleX = (float)width/DRAWING_WIDTH;
		float scaleY = (float)height/DRAWING_HEIGHT;
		h.move((int)(mouseX/scaleX), (int)(mouseY/scaleY));
	}
	
	public void mouseWheel(MouseEvent event) {
		float e = event.getCount();
		 p.modifyScale(e);
	}
	
	public void keyPressed() {
		if (keyCode == KeyEvent.VK_UP) {
			h.modifyScale(0.1f);
		}
		else if (keyCode == KeyEvent.VK_DOWN){
			h.modifyScale(-0.1f);
		}
		
		
	}
	
	// Add methods for user interaction. Check the processing reference for info on this (http://processing.org).
	// We'll also review how to get mouse/keys working in class.
	
	
	
}
