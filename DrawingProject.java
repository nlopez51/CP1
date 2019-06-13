import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.geom.Path2D;    
import javax.swing.*;

public class DrawingProject extends JComponent{

    public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
        
        drawGrid(g2);
        
        Rectangle rectangle = new Rectangle(10, 10, 1425, 885);
        g2.draw(rectangle);

        Rectangle box = new Rectangle(300, 300, 400, 400);
        g2.setColor(Color.red);
		g2.draw(box);
        
        Rectangle square = new Rectangle(301, 300, 399, 399);
        g2.setColor(Color.blue);
        g2.fill(square);
        
        Rectangle square3 = new Rectangle(600, 450, 60, 60);
        g2.setColor(Color.white);
        g2.fill(square3);
        
        Rectangle square4 = new Rectangle(350, 450, 60, 60);
        g2.setColor(Color.white);
        g2.fill(square4);
        
        Rectangle square5 = new Rectangle(500, 600, 70, 100);
        g2.setColor(Color.white);
        g2.fill(square5);
    

        Ellipse2D.Double circle = new Ellipse2D.Double(800, 70, 200, 200);
        
        g2.setColor(Color.orange);
        g2.fill(circle);

	}
    
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < 1500; x += 50){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);
        }
            
            // Draw horizontal lines
            for(int y = 50; y < 1500; y += 50){
                g2.drawLine(0, y, 1000, y);
                g2.drawString("" + y, 0, y);
                
            }
            
        }
} 
