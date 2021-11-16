
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonel
 */
public class LienzoP3U3 extends Canvas{
    Random rand = new Random();
    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    Color randomColor = new Color(r, g, b);
    public LienzoP3U3() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        Graphics2D g2=(Graphics2D)g;
        
        g.setColor(randomColor);
        g.fillRect(100, 200, 200, 100);
        g.setColor(Color.white);
        g.fillRect(250, 210, 10, 80);
        g.setColor(Color.white);
        g.fillRect(135, 210, 10, 80);
        g.setColor(Color.white);
        g.fillRect(278, 215, 13, 13);
        g.setColor(Color.white);
        g.fillRect(278, 270, 13, 13);
        g.setColor(Color.black);
        g.fillRect(255, 187, 30, 15);
        g.setColor(Color.black);
        g.fillRect(115, 187, 30, 15);
        g.fillRect(255, 300, 30, 15);
        g.setColor(Color.black);
        g.fillRect(115, 300, 30, 15);
        
    }
    
    
    
    
}
