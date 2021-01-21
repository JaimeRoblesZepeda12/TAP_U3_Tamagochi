import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Robles
 */
public class Shower extends Canvas{
    public void agua(Graphics2D g2) {
        g2.setColor(Color.blue);
        g2.fillRect(150,310, 10, 20);
        g2.fillRect(170,280, 10, 20);
        g2.fillRect(250,350, 10, 20);
        g2.fillRect(230,380, 10, 10);
        g2.fillRect(140,270, 10, 10);
        g2.fillRect(200,290, 10, 10);
        g2.fillRect(200,350, 10, 20);
        g2.fillRect(210,430, 10, 20);
        g2.fillRect(190,380, 10, 20);
        g2.fillRect(100,290, 10, 10);
        g2.fillRect(120,300, 10, 20);
        g2.fillRect(110,440, 10, 20);
        g2.fillRect(120,370, 10, 20);
        g2.fillRect(115,420, 10, 20);
        g2.fillRect(225,430, 10, 20);
        g2.fillRect(210,450, 10, 20);
    }
    public void borrarAgua(Graphics2D g2) {
        g2.setColor(Color.white);
        g2.fillRect(150,310, 10, 20);
        g2.fillRect(170,280, 10, 20);
        g2.fillRect(250,350, 10, 20);
        g2.fillRect(230,380, 10, 10);
        g2.fillRect(140,270, 10, 10);
        g2.fillRect(200,290, 10, 10);
        g2.fillRect(200,350, 10, 20);
        g2.fillRect(210,430, 10, 20);
        g2.fillRect(190,380, 10, 20);
        g2.fillRect(100,290, 10, 10);
        g2.fillRect(120,300, 10, 20);
        g2.fillRect(110,440, 10, 20);
        g2.fillRect(120,370, 10, 20);
        g2.fillRect(115,420, 10, 20);
        g2.fillRect(225,430, 10, 20);
        g2.fillRect(210,450, 10, 20);
    }
}
