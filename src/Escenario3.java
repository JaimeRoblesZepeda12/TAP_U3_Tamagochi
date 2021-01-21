
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Robles
 */
public class Escenario3 extends Canvas{
    Lienzo li;
    

    

    
    
    public void Escenario3(Graphics2D g2) {
        g2.setColor(Color.pink);
        g2.fillRect(0, 0, 800, 120);
        
        g2.setColor(Color.pink);
        g2.fillRect(550, 100, 250, 800);
        
        g2.setColor(Color.GREEN);
        g2.fillRect(0, 490, 550, 500);
        
        g2.setColor(Color.yellow);
        g2.fillOval(50, 150, 100, 100);
        
        g2.setColor(Color.black);
        g2.fillRect(200, 150, 10, 10);
        g2.fillRect(210, 140, 10, 10);
        g2.fillRect(220, 130, 30, 10);
        g2.fillRect(250, 140, 10, 10);
        g2.fillRect(260, 130, 30, 10);
        g2.fillRect(290, 140, 10, 10);
        g2.fillRect(300, 150, 10, 10);
        
        g2.fillRect(300, 200, 10, 10);
        g2.fillRect(310, 190, 10, 10);
        g2.fillRect(320, 180, 30, 10);
        g2.fillRect(350, 190, 10, 10);
        g2.fillRect(360, 180, 30, 10);
        g2.fillRect(390, 190, 10, 10);
        g2.fillRect(400, 200, 10, 10);
        
    }
    
}
