package ie.tudublin;

// Hello from Bryan

import processing.core.PApplet;

public class Arrays extends PApplet
{	
	// Ways to create an array: 
	// float[] rainFall = new float[12];
	float[] rainFall = {35.0f, 37.0f, 55.0f, 27.0f, 38.0f, 50.0f,
						 79.0f, 48.0f, 104.0f, 31.0f, 100.0f, 58.0f};

	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June",
						"July", "Aug", "Sep","Oct", "Nov", "Dec"};

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		// length of the array (rainFall)
		for(int i = 0; i < rainFall.length; i++)
		{
			// "/t" --> tap char
			println(months[i] + "\t" + rainFall[i]);
		}

		// type of a for loop but this way i dont have the index
		for(float f:rainFall)
		{
			println(f);
		}

		for(String s:months)
		{
			println(s);
		}

		// Find the minimum rainfall 
		int minIndex = 0; 

		for(int j = 1; j < rainFall.length; j ++)
		{
			if( rainFall[j] < rainFall[minIndex] )
			{
				minIndex = j;
			}
		}
		
		println(months[minIndex] + " had the minimum rainfall of " + rainFall[minIndex] );
		
		
		// Find the maximum rainfall 
		int maxIndex = 0; 

		for(int j = 1; j < rainFall.length; j ++)
		{
			if( rainFall[j] > rainFall[maxIndex] )
			{
				maxIndex = j;
			}
		}
		
		println(months[maxIndex] + " had the maximum rainfall of " + rainFall[maxIndex] );
		

	
	}

	void drawBarChart()
	{
		float w = width / (float)rainFall.length;
		float cGap = 255 / (float)rainFall.length;
		noStroke();
		colorMode(HSB);
		for(int i = 0; i < rainFall.length ; i ++)
		{
			float x = i * w;
			fill(i * cGap, 255, 255);
			rect(x, height, w, -rainFall[i]);

		}



	}

	void test()
	{

	}
	

	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		colorMode(HSB);	

		drawBarChart();
	}
}
