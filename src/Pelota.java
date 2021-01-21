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
public class Pelota extends Canvas{
     public void pelota(Graphics2D g2) {
        g2.setColor(Color.black);
        g2.fillRect(390,480, 30, 5);
        g2.fillRect(385,475, 5, 5);
        g2.fillRect(380,470,5, 5);
        g2.fillRect(375,440, 5, 30);
        g2.fillRect(380,435,5, 5);
        g2.fillRect(385,430,5, 5);
        g2.fillRect(390,425,30, 5);
        g2.fillRect(420,430,5, 5);
        g2.fillRect(425,435,5, 5);
        g2.fillRect(430,440,5, 30);
        g2.fillRect(425,470,5, 5);
        g2.fillRect(420,475,5, 5);
        
        g2.setColor(Color.blue);
        g2.fillRect(390,430, 30, 50);
        g2.fillRect(420,435, 5, 40);
        g2.fillRect(425,440, 5, 30);
        g2.fillRect(385,435, 5, 40);
        g2.fillRect(380,440, 5, 30);
    }
     public void borrarPelota(Graphics2D g2) {
        g2.setColor(Color.white);
        g2.fillRect(390,480, 30, 5);
        g2.fillRect(385,475, 5, 5);
        g2.fillRect(380,470,5, 5);
        g2.fillRect(375,440, 5, 30);
        g2.fillRect(380,435,5, 5);
        g2.fillRect(385,430,5, 5);
        g2.fillRect(390,425,30, 5);
        g2.fillRect(420,430,5, 5);
        g2.fillRect(425,435,5, 5);
        g2.fillRect(430,440,5, 30);
        g2.fillRect(425,470,5, 5);
        g2.fillRect(420,475,5, 5);
        
        g2.setColor(Color.white);
        g2.fillRect(390,430, 30, 50);
        g2.fillRect(420,435, 5, 40);
        g2.fillRect(425,440, 5, 30);
        g2.fillRect(385,435, 5, 40);
        g2.fillRect(380,440, 5, 30);
    }
}
