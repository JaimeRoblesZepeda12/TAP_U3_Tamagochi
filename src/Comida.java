
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
public class Comida extends Canvas{
    public void plato(Graphics2D g2) {
        g2.setColor(Color.black);
        g2.fillRect(250, 480, 5, 10);
        g2.fillRect(255, 470, 5, 10);
        g2.fillRect(260, 450, 5, 20);
        g2.fillRect(255, 490, 20, 5);
        g2.fillRect(275, 495, 65, 5);
        g2.fillRect(340, 490, 20, 5);
        g2.fillRect(360, 480, 5, 10);
        g2.fillRect(355, 470, 5, 10);
        g2.fillRect(350, 450, 5, 20);
        g2.fillRect(265, 445, 5, 5);
        g2.fillRect(270, 450, 75, 5);
        g2.fillRect(345, 445, 5, 5);
        g2.setColor(Color.red);
        g2.fillRect(255, 480,105,10);
        g2.fillRect(275, 490, 65, 5);
        g2.fillRect(260, 470, 95, 10);
        g2.fillRect(265, 455, 85, 15);
        g2.fillRect(265, 450, 5, 5);
        g2.fillRect(345, 450, 5, 5);
    }
    public void foodLayer1(Graphics2D g2) {
        g2.setColor(Color.black);
        g2.fillRect(270, 440, 5, 5);
        g2.fillRect(335, 440, 10, 5);
        g2.fillRect(330, 445, 5, 5);
        g2.fillRect(275, 445, 5, 5);
        g2.fillRect(285, 440, 5, 5);
        g2.fillRect(290, 445, 5, 5);
        g2.fillRect(295, 440, 5, 5);
        g2.fillRect(310, 440, 5, 5);
        g2.setColor(Color.ORANGE);
        g2.fillRect(295, 445, 50, 5);
        g2.fillRect(300, 440, 10, 5);
        g2.fillRect(315, 440, 20, 5);
        g2.fillRect(290, 440, 5, 5);
        g2.fillRect(275, 440, 10, 5);
        g2.fillRect(280, 445, 10, 5);
        g2.fillRect(270, 445, 5, 5); 
    }
    public void foodLayer2(Graphics2D g2) {
        g2.setColor(Color.orange);
        g2.fillRect(305, 435,20, 5);
        g2.fillRect(280, 435, 20, 5);
        g2.fillRect(285, 430, 30, 5);
        g2.setColor(Color.black);
        g2.fillRect(275, 435, 5, 5);
        g2.fillRect(280, 430, 5, 5);
        g2.fillRect(325, 435, 10, 5);
        g2.fillRect(315, 430, 10, 5);
        g2.fillRect(300, 435, 5, 5);
        g2.fillRect(295, 430, 5, 5);
    }
    public void foodLayer3(Graphics2D g2) {
        g2.setColor(Color.black);
        g2.fillRect(285, 425, 10, 5);
        g2.fillRect(300, 425, 15, 5);
    }
    //--BORRAR
    public void borrarPlato(Graphics2D g2) {
        g2.setColor(Color.white);
        g2.fillRect(250, 480, 5, 10);
        g2.fillRect(255, 470, 5, 10);
        g2.fillRect(260, 450, 5, 20);
        g2.fillRect(255, 490, 20, 5);
        g2.fillRect(275, 495, 65, 5);
        g2.fillRect(340, 490, 20, 5);
        g2.fillRect(360, 480, 5, 10);
        g2.fillRect(355, 470, 5, 10);
        g2.fillRect(350, 450, 5, 20);
        g2.fillRect(265, 445, 5, 5);
        g2.fillRect(270, 450, 75, 5);
        g2.fillRect(345, 445, 5, 5);
        g2.setColor(Color.white);
        g2.fillRect(255, 480,105,10);
        g2.fillRect(275, 490, 65, 5);
        g2.fillRect(260, 470, 95, 10);
        g2.fillRect(265, 455, 85, 15);
        g2.fillRect(265, 450, 5, 5);
        g2.fillRect(345, 450, 5, 5);
    }
    public void borrarFoodLayer1(Graphics2D g2) {
        g2.setColor(Color.white);
        g2.fillRect(270, 440, 5, 5);
        g2.fillRect(335, 440, 10, 5);
        g2.fillRect(330, 445, 5, 5);
        g2.fillRect(275, 445, 5, 5);
        g2.fillRect(285, 440, 5, 5);
        g2.fillRect(290, 445, 5, 5);
        g2.fillRect(295, 440, 5, 5);
        g2.fillRect(310, 440, 5, 5);
        g2.setColor(Color.white);
        g2.fillRect(295, 445, 50, 5);
        g2.fillRect(300, 440, 10, 5);
        g2.fillRect(315, 440, 20, 5);
        g2.fillRect(290, 440, 5, 5);
        g2.fillRect(275, 440, 10, 5);
        g2.fillRect(280, 445, 10, 5);
        g2.fillRect(270, 445, 5, 5); 
    }
    public void borrarFoodLayer2(Graphics2D g2) {
        g2.setColor(Color.white);
        g2.fillRect(305, 435,20, 5);
        g2.fillRect(280, 435, 20, 5);
        g2.fillRect(285, 430, 30, 5);
        g2.setColor(Color.white);
        g2.fillRect(275, 435, 5, 5);
        g2.fillRect(280, 430, 5, 5);
        g2.fillRect(325, 435, 10, 5);
        g2.fillRect(315, 430, 10, 5);
        g2.fillRect(300, 435, 5, 5);
        g2.fillRect(295, 430, 5, 5);
    }
    public void borrarFoodLayer3(Graphics2D g2) {
        g2.setColor(Color.white);
        g2.fillRect(285, 425, 10, 5);
        g2.fillRect(300, 425, 15, 5);
    }
}
