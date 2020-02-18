package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{
	//float[] rainfall = new float[12];
	float[] rainFall = {45,37,55,27,38,50,79,48,104,31,100,58};
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun","Jul", "Aug","Sep", "Oct", "Nov", "Dec"};

	public void settings()
	{
		size(500, 500);
	}

	public void setup()
	{
		int min = 0;
		int max = 0;

		for (int i = 0; i < rainFall.length; i++) {
			println(months[i] + "\t" + rainFall[i]);

			if(rainFall[i]> rainFall[max]){
				max = i;
			}
			if(rainFall[i]<rainFall[min]){
				min = i;
			}
		}
		println("Max is : " + months[max] + "\t" + rainFall[max]);
		println("Min is : "+ months[min] + "\t" + rainFall[min]);
		/*
		for(float f:rainFall){
			println(f);
		}
		*/
	}



	float offset = 0;



	public void keyPressed()
	{
		if (key == ' ')
		{

		}
	}

	void drawbarchart(){
		float w = width/(float) rainFall.length;
		float cgap = 255/(float) rainFall.length;
		for (int i = 0; i < rainFall.length; i++) {
			float x = i*w;
			fill(i*cgap, 255, 255);
			rect(x,  height, w, -rainFall[i]); // tlx, tly, w, h
		}

	}


	public void draw()
	{
		background(0);
		colorMode(HSB);
		drawbarchart();
	}
}
