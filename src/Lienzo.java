
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
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
public class Lienzo extends Canvas{
    NewJFrame puntero;
    Hilo h;
    Escenario3 e3=new Escenario3();
    Mascota m=new Mascota();
    Comida c=new Comida();
    Shower s=new Shower();
    Pelota p=new Pelota();
    public int comida=200;
    public int shower=200;
    public int jugar=200;
    Timer t1=new Timer(1000,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    comida--;
    repaint();
    }
});
Timer t2=new Timer(1500,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    shower--;
    }
});
Timer t3=new Timer(1000,new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    jugar--;
    }
});
    public Lienzo(NewJFrame p) {
        puntero=p;
        t1.start();
        t2.start();
        t3.start();
        //h.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2= (Graphics2D)g;
        this.setBackground(Color.white);
        
        e3.Escenario3(g2);
        progresos(g2);
        m.Cabeza(g2);
        m.Cuerpo(g2);
        
        if(puntero.activaCom==true){
            c.plato(g2);
            c.foodLayer1(g2);
            c.foodLayer2(g2);
            c.foodLayer3(g2); 
        }
        if(puntero.activaCom==false){
            c.borrarPlato(g2);
            c.borrarFoodLayer1(g2);
            c.borrarFoodLayer2(g2);
            c.borrarFoodLayer3(g2); 
        }
        if(puntero.activaSho==true){
            s.agua(g2);
        }
        
        else{
            s.borrarAgua(g2);
        }
        if(puntero.activaPel==true){
            p.pelota(g2);
        }
        else{
            p.borrarPelota(g2);
        }
        
    }
    public void progresos(Graphics2D g2){
    g2.setFont(new Font("Cooper Black",Font.PLAIN,30));
    g2.setColor(Color.BLACK);
    g2.drawString("Hambre", 550, 150);
    g2.drawRoundRect(550, 155, 200, 50, 15, 20);
    if(comida>100){
    g2.setColor(Color.green);
    }else{
    g2.setColor(Color.red);
    }
    g2.fillRoundRect(550,155,comida, 50, 15, 20);
    g2.setColor(Color.BLACK);
    g2.drawString("Sucio",550,300);
    g2.drawRoundRect(550, 305, 200, 50, 15, 20);
    if(shower>100){
    g2.setColor(Color.green);
    }else{
    g2.setColor(Color.red);
    }
    g2.fillRoundRect(550, 305, shower, 50, 15, 20);
    g2.setColor(Color.BLACK);
    g2.drawString("Jugar", 550, 450);
    g2.drawRoundRect(550, 455, 200, 50, 15, 20);
    if(jugar>100){
    g2.setColor(Color.green);
    }else{
    g2.setColor(Color.red);
    
    if(comida==0 ||shower==0 ||jugar==0){
            JOptionPane.showMessageDialog(null,"SE MURIO LA MASCOTA \n GRACIAS POR JUGAR");
            System.exit(0);
        }
    }
    g2.fillRoundRect(550, 455, jugar, 50, 15, 20);
    
    
    }
    
}
