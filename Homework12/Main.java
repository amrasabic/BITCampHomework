import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

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
		g.drawRect(50, 50, 600, 300);
		// lang	
		g.setColor(Color.BLACK);
		g.drawRect(80, 80, 200, 240);
		// awt
		g.setColor(Color.BLACK);
		g.drawRect(320, 80, 200, 240);
		// util
		g.setColor(Color.BLACK);
		g.drawRect(570, 80, 50, 240);
		
		// math
		
		// graphics
		
		// string
		// color
		
		// integer
		// font
		
		// sqrt
		// drawRect
		
		// random
		// set color

		// *******************
		w.setImage(img);
	}
}