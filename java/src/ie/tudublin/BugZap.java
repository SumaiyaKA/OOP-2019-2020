package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
	
	/*
	Make fiels of type float in the BugZap class
	for playerX, playerY, and playerWidth
	and give these default values.
	You can decide what these should be.
	There are built in variables called width
	and height that give the width and height
	of the drawing window. These only get assigned
	after size has been called, so if you want to
	use these to give values to playerX, playerY etc.
	put the code into the setup method.
	*/

	// Player variables:
	float playerX = 250; 	
	float playerY = 250; 
	float playerWidth = 50; 

	// Laser variable:
	boolean playerLaser = false ;	
	
	// Bug variables:
	float bugX = 250; 	
	float bugY = 50; 
	float bugWidth = 20; 


	public void settings()
	{
		size(500, 500);
		
	}

	public void setup() {
	}

	/*
	public void draw() {
		background(0, 0, 255);
		stroke(255, 0, 0);
		fill(255, 255, 0);
		line(10, 10, 100, 100);		// x1, y1, x2, y2
		point(50, 50); // x, y
		ellipse(100, 200, 50, 150); // cx, cy, w, h
		fill(0, 255, 0);
		rect(50, 10, 100, 200); // tlx, tly, w, h
		triangle(10, 10, 100, 90, 200, 200); // vertices	
	}	
	*/

	int x = 0; // 4 bytes
	
	public void draw()
	{	
		
		background(222,222,222);
		// noStroke();
		// fill(255);
		// ellipse(x, mouseY, 50, 50);		
		// x ++;

		drawPlayer(playerX, playerY, playerWidth);
		drawBug(bugX, bugY, bugWidth);
	}

	public void drawPlayer(float x, float y, float w)
	{
		// h for height
		float h = w/2;

		rect(x, y, w, h); // tlx, tly, w, h
		stroke(55, 55, 55);


		if(playerLaser == true)
		{

			float midOfObj= ((playerX + playerWidth)- playerX)/2;
			float x1 = playerX + midOfObj;
			line(x1, playerY, x1, playerY-200);		// x1, y1, x2, y2

		}
	}

	public void drawBug(float x, float y, float w)
	{
		// h for height
		float h = w/2;

		// rect(x, y, w, h); // tlx, tly, w, h
		// stroke(55, 55, 55);

		x = x + random(-5, 5);
		y = y + random(-5, 5);

		bugX = x;
		bugY = y;

		if(x < 0)
		{
			bugX = 1;
		}
		if(x > 500)
		{
			bugX = 0;
		}
		if(y < 0)
		{
			bugY = 1;
		}
		if(y > 245)
		{
			bugY = 0;
		}

		rect(x, y, w, h); // tlx, tly, w, h
		stroke(55, 55, 55);
		
	}

	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			playerX--;
			if(playerX < 0)
			{
				playerX++;
			}

		}
		if (keyCode == RIGHT)
		{
			playerX++;
			if(playerX > 500)
			{
				playerX--;
			}
		}
		if (key == ' ')
		{
			playerLaser = !playerLaser;
		}
	}
}
