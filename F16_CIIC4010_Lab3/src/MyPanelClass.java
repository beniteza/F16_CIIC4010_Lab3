import java.awt.Color;

import java.awt.Graphics;

import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;



public class MyPanelClass extends JPanel 

{

	/**

	 * 

	 */

	private static final long serialVersionUID = 7057541440811488699L;



	public void paintComponent(Graphics g) 

	{

		super.paintComponent(g);



		//Compute interior coordinates

		Insets myInsets = this.getInsets();

		int x1 = myInsets.left;

		int y1 = myInsets.top;

		int x2 = getWidth() - myInsets.right - 1;

		int y2 = getHeight() - myInsets.bottom - 1;

		int width = x2 - x1;

		int height = y2 - y1;



		//Paint the background

		g.setColor(Color.RED);

		g.fillRect(x1, y1, width+1, height+1);


		//        //Draw a border

		//        g.setColor(Color.YELLOW);

		//        g.drawRect(x1, y1, width, height);

		//        

		//        //Draw an inside border

		//        g.setColor(Color.BLACK);

		//        g.drawRect(x1+5, y1+5, width-10, height-10);

		//        

		//        //Draw a line

		//        g.setColor(Color.WHITE);

		//        g.drawLine(x1, y1, x2, y2);

		//        

		//        //Draw another line

		//        g.setColor(Color.BLUE);

		//        g.drawLine(x1, y1+getHeight(), x2, y2-getHeight());


		//g.setColor(Color.LIGHT_GRAY);

		//g.fillOval(getWidth()/2-22, getHeight()/2-22, 55, 55);
		//g.fillOval((x2-(55/2))/2, (y2-(55/2))/2, 55, 55);
		
//        Polygon p = new Polygon();
//        p.addPoint(x1 + 5, y1 + 25);
//        p.addPoint(x1 + 20, y1 + 10);
//        p.addPoint(x1 + 35, y1 + 25);
//        p.addPoint(x1 + 25, y1 + 25);
//        p.addPoint(x1 + 25, y1 + 45);
//        p.addPoint(x1 + 15, y1 + 45);
//        p.addPoint(x1 + 15, y1 + 25);
//        g.setColor(Color.YELLOW);
//        g.fillPolygon(p);
//        
//        Polygon p2 = new Polygon();
//        p2.addPoint(x1 + 25, y1 + 73);
//        p2.addPoint(x1 + 41, y1 + 73);
//        p2.addPoint(x1 + 47, y1 + 58);
//        p2.addPoint(x1 + 53, y1 + 73);
//        p2.addPoint(x1 + 69, y1 + 73);
//        p2.addPoint(x1 + 56, y1 + 83);
//        p2.addPoint(x1 + 61, y1 + 98);
//        p2.addPoint(x1 + 47, y1 + 88);
//        p2.addPoint(x1 + 34, y1 + 98);
//        p2.addPoint(x1 + 38, y1 + 83);
//        g.setColor(Color.WHITE);
//        g.drawPolygon(p2);
		
		
		g.setColor(Color.RED); 
		g.fillRect(x1,y1,x2,y2/5); //topRedStrip
		g.setColor(Color.WHITE); 
		g.fillRect(x1,y2/5,x2,y2/5); //topWhiteStrip
		g.setColor(Color.RED);
		g.fillRect(x1,y2*2/5,x2,y2/5); //middleRedStrip
		g.setColor(Color.WHITE);
		g.fillRect(x1,y2*3/5,x2,y2/5); //bottomWhiteStrip
		g.setColor(Color.RED);
		g.fillRect(x1,y2*4/5,x2,y2/5); //bottomRedStrip
		
		Polygon triangle = new Polygon();
		triangle.addPoint(x1, y1);
		triangle.addPoint(x2/2, y2/2);
		triangle.addPoint(x1,y2);
		g.setColor(Color.BLUE);
		g.fillPolygon(triangle);

		Polygon star = new Polygon();
		star.addPoint(x1+x2/4, y1+y2*2/5);
		star.addPoint(x1+x2*5/16, y1+y2*12/25); //Change here
		star.addPoint(x1+x2*3/8, y1+y2/2);
		star.addPoint(x1+x2*5/16, y1+y2*11/20);
		star.addPoint(x1+x2*3/8, y1+y2*3/5);
		star.addPoint(x1+x2/4, y1+y2*11/20);
		star.addPoint(x1+x2/8, y1+y2*3/5);
		star.addPoint(x1+x2*3/16, y1+y2*11/20); 
		star.addPoint(x1+x2/8, y1+y2/2);
		star.addPoint(x1+x2*3/16, y1+y2*12/25); //Change here
		g.setColor(Color.WHITE);
		g.fillPolygon(star);
		

	}

}