import java.awt.Color;

import processing.core.PApplet;

public class House {
	
	private int x,y;
	private float scale;
	// Add more fields to variable-ize house
	
	public House() {
		x = 100;
		y = 150;
		scale = 1;
	}

	
	public void draw(PApplet surface) {
		
		surface.scale(scale);
		surface.rect(x-150, y-100, 300, 200);
		surface.triangle(x-150 ,y-100, x, y-200, x+150, y-100);
		surface.rect(x-125, y-75, 75, 75);
		surface.rect(x+50, y-75, 75, 75);
		surface.rect(x-35, y, 75, 100);
		surface.circle(x-20, y+50, 20);
		
		surface.pushStyle();
		surface.popStyle();
	}

	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void modifyScale(float amount) {
		scale += amount;
	}
	// Add more methods to modify fields. Make sure methods sound like real actions.
	
	
	
	
	
}
