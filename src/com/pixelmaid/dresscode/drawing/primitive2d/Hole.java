package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;

import processing.core.PApplet;


import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.drawing.datatype.Point;

//class for holes inside of polygons. cannot be called independently
public class Hole extends Polygon {
	
		@Override
		public void draw(Embedded e){
			appearance(e);
			e.fill(210);
		    ArrayList<Point> points = this.getPoints();
		    e.pushMatrix();
			e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
			e.rotate(PApplet.radians((float)getRotation()));
		    e.beginShape();
			
			for(int i=0;i<points.size();i++){
				e.vertex((float)points.get(i).getX(),(float)points.get(i).getY());
			}
			e.endShape(PApplet.CLOSE);
			e.popMatrix();
		}
		
		@Override
		public void print(Embedded e){
			
			appearance(e);
			e.fill(210);
		    ArrayList<Point> points = this.getPoints();
		    e.pushMatrix();
			e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
			e.rotate(PApplet.radians((float)getRotation()));
		    e.beginShape();
			
			for(int i=0;i<points.size();i++){
				e.vertex((float)points.get(i).getX(),(float)points.get(i).getY());
			}
			e.endShape(PApplet.CLOSE);
			e.popMatrix();
		}
		
		
		@Override
		public Hole copy(){
			Hole c =  new Hole();
			copyParameters(this, c);
			
			this.setParent(this.getParent());
			ArrayList<Point> points = this.getPoints();
			for(int i=0;i<points.size();i++){
				c.addPoint(points.get(i).copy());
			}
			
			return c;
		}
	
		
		
}
