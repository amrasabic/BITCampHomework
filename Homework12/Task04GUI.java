import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Task04GUI {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		
		// largest one Java
		g.setColor(Color.BLACK);
		g.drawRect(40, 40, 610, 310);
		
		g.setColor(Color.BLUE);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("java", 50, 65);
		
		// lang	
		g.setColor(Color.BLACK);
		g.drawRect(70, 70, 220, 260);
		
		g.setColor(Color.BLUE);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("lang", 80, 85);
		// awt
		g.setColor(Color.BLACK);
		g.drawRect(310, 70, 220, 260);
		
		g.setColor(Color.BLUE);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("awt", 320, 85);
		// util
		g.setColor(Color.BLACK);
		g.drawRect(550, 70, 70, 260);
		
		g.setColor(Color.BLUE);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("util", 560, 85);
		
		// math
		g.setColor(Color.BLACK);
		g.drawRect(90, 90, 180, 120);
		
		g.setColor(Color.GREEN);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("Math", 100, 110);
		// graphics
		g.setColor(Color.BLACK);
		g.drawRect(330, 90, 180, 120);
		
		g.setColor(Color.GREEN);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("Graphics", 340, 110);
		
		// string
		g.setColor(Color.BLACK);
		g.drawRect(90, 220, 180, 40);
		
		g.setColor(Color.GREEN);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("String", 100, 245);
		// color
		g.setColor(Color.BLACK);
		g.drawRect(330, 220, 180, 40);
		
		g.setColor(Color.GREEN);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("Color", 340, 245);
		
		// integer
		g.setColor(Color.BLACK);
		g.drawRect(90, 270, 180, 40);
		
		g.setColor(Color.GREEN);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("Integer", 100, 295);
		// font
		g.setColor(Color.BLACK);
		g.drawRect(330, 270, 180, 40);
		
		g.setColor(Color.GREEN);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("Font", 340, 295);
		
		// sqrt
		g.setColor(Color.BLACK);
		g.drawRect(120, 120, 140, 35);
		
		g.setColor(Color.RED);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("sqrt( )", 155, 143);
		
		// drawRect
		g.setColor(Color.BLACK);
		g.drawRect(360, 120, 140, 35);
		
		g.setColor(Color.RED);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("drawRect( )", 385, 143);
		// random
		g.setColor(Color.BLACK);
		g.drawRect(120, 165, 140, 35);
		
		g.setColor(Color.RED);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("random( )", 155, 188);
		// set color
		g.setColor(Color.BLACK);
		g.drawRect(360, 165, 140, 35);		
		
		g.setColor(Color.RED);
		g.setFont(new Font("Cambria", Font.BOLD, 18));
		g.drawString("getColor( )", 385, 188);
		
		// *******************
		w.setImage(img);
	}
}