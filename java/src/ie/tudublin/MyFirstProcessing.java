package ie.tudublin;

import processing.core.PApplet;

public class MyFirstProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{	
        // background(0,0,255);
        // line(10, 10, 100, 100); // x1, y1, x2, y2
        // ellipse(200, 90, 80, 200); // cx, cy
        // circle(200, 300, 80);
        // rect(400, 380, 100, 50);
        // triangle(10, 200, 200, 200, 300, 400);
        // fill(90, 78, 88);
        
        
        background(255,0,0);
        circle(250, 250, 0);
        fill(0, 255, 0);
        //make a big triangle
        triangle(250, 250, 250, 100, 100, 250);
        // triangle(x1, y1, x2, y2, X, Y);
        
        
	}
}

