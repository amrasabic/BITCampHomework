import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Task03 {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		
		
		for(int i=40; i<=500; i+=48){
			g.setColor(Color.BLACK);
			g.drawRect(i, 60, 48, 48);
		}
		
		for(int j = 55; j<500; j+=48){
			double randomNum = Math.random() * 10 - 1 ;
			g.setColor(Color.BLACK);
			g.setFont(new Font("Cambria", Font.BOLD, 20));
			g.drawString(" " + (int)randomNum, j, 90);
		}
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("Cambria", Font.BOLD, 14));
		g.drawString("An array of numbers", 220, 50);
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("Cambria", Font.BOLD, 14));
		g.drawString("Type: int", 250, 130);
	
		
		// *******************
		w.setImage(img);
	}
}