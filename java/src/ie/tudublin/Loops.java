package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{
	public void settings()
	{
		size(500, 500);
	}

	public void setup()
	{
		colorMode(HSB);
	}


	public void keyPressed()
	{

	}


	public void draw()
	{
		//first();
		//seconddraw();
		//third();
		//fourth();
		fifth();
	}

	public void first(){
		background(255);
		int numlines = 100;
		float gap = width/(float)numlines;
		for ( int i = 0; i <= numlines; i++) {
			stroke(0);
			float x = i* gap;
			line(x,0 ,width-x, height);
			line(0,x ,width, height-x);

		}
	}

	public void seconddraw(){
		background(150);
		int x =25;
		int y = 250;
		while ( x<500) {
			stroke(0);
			ellipse(x, y, 50, 50); // cx, cy, w, h

			x= x +50;
		}
	}

	public void third() {
		background(150);
		int x =0;
		int y =0;
		while ( x<500) {
			stroke(0);
			fill(y,10000 ,1000);
			rect(x, 0, 50, 500); // tlx, tly, w, h
			y +=20;
			x += 50;
		}
	}

	public void fourth() {
		background(150);
		int numcircles = 5;
		int circlegap = width/(numcircles*2);
		int x =circlegap;
		int y = height/2;
		int h = 0;
		while ( x<width) {
			stroke(0);
			fill(h,255,255);
			ellipse(x, y, circlegap, circlegap); // cx, cy, w, h
			h +=20;
			x += circlegap;
		}
	}

	public void fifth() {
		/*int x =25;
		int y = 25;
		int i = -5;
		background(0);
		stroke(124,10000,1000);
		while ( y<height) {
			line(25,y,475,y);
			line(x,25,x,475);


			textSize(10);
			text(i, x, 15);
			text(i, 10, y);
			fill(124, 10000, 1000);
			i++;
			x += 45;
			y += 45;*/

			float gap = width * 0.1f;
			float halfgap = gap/2.0f;
			background(0);
			colorMode(RGB);
			stroke(0,255,0);
			textAlign(CENTER, CENTER);
			for (int i = -5; i < 5; i++) {
				stroke(0,255,0);
				float x = map(i,-5,5,gap,width-gap);
				line(x, gap, x, height- gap);
				line(gap, x, width-gap, x);
				fill(255);
				text(i,x,halfgap);
				text(i, halfgap, x);
			}


		}

}
