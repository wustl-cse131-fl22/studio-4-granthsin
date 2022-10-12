package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		//purple
		StdDraw.setPenRadius(0.2);
		Color purple = new Color(150,50,100);
		StdDraw.setPenColor(purple);
		StdDraw.line(0.25, 0, .75, 0);
		StdDraw.line(0.75, 0, .5, .29);
		StdDraw.line(.5, .29, 0.25, 0);
		StdDraw.line(.5, 0, 0.5, 0.29);
		
		//pink
		StdDraw.setPenRadius(0.2);
		StdDraw.setPenColor(Color.PINK);
		StdDraw.line(0, 0.25, 0, 0.75);
		StdDraw.line(0,0.75, .29, .5);
		StdDraw.line(.29, .5, 0, 0.25);
		StdDraw.line(0, 0.5, 0.29, 0.5);
		
		//blue
		StdDraw.setPenRadius(0.2);
		Color blue = new Color(150,215,255);
		StdDraw.setPenColor(blue);
		StdDraw.line(1, 0.25, 1, 0.75);
		StdDraw.line(1,0.75, .71, .5);
		StdDraw.line(.71, .5, 1, 0.25);
		StdDraw.line(1, 0.5, 0.71, 0.5);
		
		//blue
		StdDraw.setPenRadius(0.2);
		Color green = new Color(60,179,113);
		StdDraw.setPenColor(green);
		StdDraw.line(0.25, 1, 0.75, 1);
		StdDraw.line(0.75,1, 0.5, .71);
		StdDraw.line(.5,.71, .25, 1);
		StdDraw.line(0.5, 1, 0.5, 0.71);
		
		
		StdDraw.setPenRadius(0.02);
		Color yellow = new Color(255,229,124);
		StdDraw.setPenColor(yellow);
		StdDraw.line(0, 0, 1, 1);
		StdDraw.line(0, 1, 1, 0);
		
		StdDraw.setPenColor();
		StdDraw.line(0, 0, 1, 0);
		StdDraw.line(1, 0, 1, 1);
		StdDraw.line(1, 1, 0, 1);
		StdDraw.line(0, 1, 0, 0);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.setPenRadius(0.02);
		StdDraw.filledCircle(0.5, 0.18, .12);
		StdDraw.filledCircle(0.18, 0.5, .12);
		StdDraw.filledCircle(0.82, 0.5, .12);
		StdDraw.filledCircle(0.5, 0.82, .12);
		StdDraw.circle(0.5, 0.5, .32);
		//StdDraw.setPenColor();
		//StdDraw.setPenRadius(0.005);
		//StdDraw.circle(0.5, 0.5, .32);
		
	}
}