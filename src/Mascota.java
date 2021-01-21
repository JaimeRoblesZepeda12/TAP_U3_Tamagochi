
import java.awt.Canvas;
import java.awt.Color;
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
public class Mascota extends Canvas{
    Lienzo l;
    //NewJFrame p=new NewJFrame();
    int cx1=150; int cy1=300;
    int cx2=140; int cy2=310;
    int cx3=170; int cy3=310;
    int cx4=180; int cy4=340;
    int cx5=200; int cy5=310;
    int cx6=210; int cy6=300;
    int cx7=230; int cy7=310;
    int cx8=130; int cy8=360;
    int cx9=140; int cy9=410;
    int cx10=240; int cy10=360;
    int cx11=230; int cy11=410;
    int cx12=160; int cy12=420;
    int cx13=170; int cy13=370;
    int cx14=210; int cy14=370;
    
    
    int cx15=160; int cy15=320;
    int cx16=220; int cy16=320;
    int cx17=190; int cy17=400;
    
    int bx1=190; int by1=430;
    int bx2=170; int by2=480;
    int bx3=160; int by3=470;
    int bx4=160; int by4=450;
    int bx5=140; int by5=480;
    int bx6=130; int by6=460;
    int bx7=110; int by7=400;
    int bx8=100; int by8=410;
    int bx9=80; int by9=420;
    int bx10=70; int by10=430;
    int bx11=80; int by11=450;
    int bx12=90; int by12=430;
    int bx13=100; int by13=480;
    int bx14=110; int by14=460;
    int bx15=100; int by15=470;
    
    
    int bx16=220; int by16=320;
    int bx17=190; int by17=400;
    
    public void Cabeza(Graphics2D g2) {
        g2.setColor(Color.black);
        g2.fillRect(cx1,cy1, 20, 10);
        g2.fillRect(cx2, cy2, 10, 50);
        g2.fillRect(cx3, cy3, 10, 40);
        g2.fillRect(cx4, cy4, 40, 10);
        g2.fillRect(cx5, cy5, 10, 40);
        g2.fillRect(cx6, cy6, 20, 10);
        g2.fillRect(cx7, cy7, 10, 50);
        g2.fillRect(cx8, cy8, 10, 50);
        g2.fillRect(cx9, cy9, 10, 10);
        g2.fillRect(cx10, cy10, 10, 50);
        g2.fillRect(cx11, cy11, 10, 10);
        g2.fillRect(cx12, cy12, 70, 10);
        g2.fillRect(cx13, cy13, 10, 30);
        g2.fillRect(cx14,cy14, 10, 30);
        
        g2.setColor(Color.pink);
        g2.fillRect(cx15, cy15, 10, 30);
        g2.fillRect(cx16, cy16, 10, 30);
        g2.fillRect(cx17, cy17, 10, 10);
    }
    public void Cuerpo(Graphics2D g2) {
        g2.setColor(Color.black);
        g2.fillRect(bx1, by1, 10, 60);
        g2.fillRect(bx2, by2, 20, 10);
        g2.fillRect(bx3, by3, 20, 10);
        g2.fillRect(bx4, by4, 10, 20);
        g2.fillRect(bx5, by5, 20, 10);
        g2.fillRect(bx6, by6, 10, 20);
        g2.fillRect(bx7, by7, 20, 10);
        g2.fillRect(bx8, by8, 10, 10);
        g2.fillRect(bx9, by9, 20, 10);
        g2.fillRect(bx10, by10, 10, 20);
        g2.fillRect(bx11, by11, 10, 10);
        g2.fillRect(bx12, by12, 10, 50);
        g2.fillRect(bx13, by13, 20, 10);
        g2.fillRect(bx14, by14, 40, 10);
        g2.fillRect(bx15, by15, 10, 10);
    }
    
    public void brincar(){
        //JOptionPane.showMessageDialog(this,"debe drincar");
        /*
        //brinca 
        cy1-=10;
        cy2-=10;
        cy3-=10;
        cy4-=10;
        cy5-=10;
        cy6-=10;
        cy7-=10;
        cy8-=10;
        cy9-=10;
        cy10-=10;
        cy11-=10;
        cy12-=10;
        cy13-=10;
        cy14-=10;
        cy15-=10;
        cy16-=10;
        cy17-=10;
        by1-=10;
        by2-=10;
        by3-=10;
        by4-=10;
        by5-=10;
        by6-=10;
        by7-=10;
        by8-=10;
        by9-=10;
        by10-=10;
        by11-=10;
        by12-=10;
        by13-=10;
        by14-=10;
        by15-=10;
        
        //se mueve para la derecha
        cx1+=5;
        cx2+=5;
        cx3+=5;
        cx4+=5;
        cx5+=5;
        cx6+=5;
        cx7+=5;
        cx8+=5;
        cx9+=5;
        cx10+=5;
        cx11+=5;
        cx12+=5;
        cx13+=5;
        cx14+=5;
        cx15+=5;
        cx16+=5;
        cx17+=5;
        bx1+=5;
        bx2+=5;
        bx3+=5;
        bx4+=5;
        bx5+=5;
        bx6+=5;
        bx7+=5;
        bx8+=5;
        bx9+=5;
        bx10+=5;
        bx11+=5;
        bx12+=5;
        bx13+=5;
        bx14+=5;
        bx15+=5;
        //cae
        cy1+=10;
        cy2+=10;
        cy3+=10;
        cy4+=10;
        cy5+=10;
        cy6+=10;
        cy7+=10;
        cy8+=10;
        cy9+=10;
        cy10+=10;
        cy11+=10;
        cy12+=10;
        cy13+=10;
        cy14+=10;
        cy15+=10;
        cy16+=10;
        cy17+=10;
        by1+=10;
        by2+=10;
        by3+=10;
        by4+=10;
        by5+=10;
        by6+=10;
        by7+=10;
        by8+=10;
        by9+=10;
        by10+=10;
        by11+=10;
        by12+=10;
        by13+=10;
        by14+=10;
        by15+=10; */
    }
}
