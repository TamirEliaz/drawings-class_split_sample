import processing.core.PApplet;

public class Person {
	
	private int x,y;
	private float scale;
	
	public Person() {
		x = 100;
		y = 150;
	}

	
	public void draw(PApplet surface) {;
		surface.scale(scale);
		surface.rect(x-50, y-50, 50, 50);
		surface.line(x-25,y, x-25, y+70);
		surface.line(x,y+100, x-25, y+70);
		surface.line(x-50,y+100, x-25, y+70);
		surface.line(x,y+30, x-25, y);
		surface.line(x-50,y+30, x-25, y);
	}

	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void modifyScale(float amount) {
		scale += amount;
	}
	// Model after House.
	
}
