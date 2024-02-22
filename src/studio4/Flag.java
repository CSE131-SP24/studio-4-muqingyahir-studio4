package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color skin = new Color(255, 229, 204);
		StdDraw.setPenColor(skin);
		StdDraw.filledCircle(0.81, 0.5,0.03);
		StdDraw.filledCircle(0.19, 0.5,0.03);
		StdDraw.setPenColor(Color.black);
		StdDraw.circle(0.81, 0.5,0.03);
		StdDraw.circle(0.19, 0.5,0.03);
	
		StdDraw.setPenColor(skin);
		StdDraw.filledEllipse(0.5, 0.5, 0.3, 0.2);
		StdDraw.setPenColor(Color.black);
		StdDraw.ellipse(0.5, 0.5, 0.3, 0.2);
		
		StdDraw.setPenColor(Color.white);
		StdDraw.filledCircle(0.35, 0.5,0.05);
		StdDraw.filledCircle(0.65, 0.5,0.05);
		StdDraw.setPenColor(Color.black);
		StdDraw.circle(0.35, 0.5,0.05);
		StdDraw.circle(0.65, 0.5,0.05);
		
		StdDraw.setPenColor(Color.black);
		StdDraw.filledCircle(0.35, 0.5,0.01);
		StdDraw.filledCircle(0.65, 0.5,0.01);
		
		//StdDraw.line(.3, .5, .4, .5);
		
		StdDraw.arc(.5, .4, .05, 210, -30);
		StdDraw.line(.3, .58, .4, .56);
		StdDraw.line(.6, .56, .7, .58);
		StdDraw.line(.5, .5, .525, .45);
		StdDraw.line(.525, .45, .485, .45);
		StdDraw.line(.525, .45, .485, .45);
		StdDraw.arc(.5, .65, .05, 35, 120);
		StdDraw.arc(.31, .6, .05, 45, 120);
		StdDraw.arc(.69, .6, .05, 45, 120);
		StdDraw.arc(.4, .64, .05, 45, 120);
		StdDraw.arc(.6, .64, .05, 45, 120);
	}
	
}