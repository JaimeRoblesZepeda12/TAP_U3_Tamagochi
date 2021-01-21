
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Robles
 */
public class Hilo extends Thread{
    public boolean pausado=false;
    public boolean ejecutar = true;
    NewJFrame puntero;
    int timeCom=0;
    int quitar=0;
    //Escenario3 puntero;
    //Lienzo puntero;
    Mascota mas;
    public Hilo(NewJFrame p){
        puntero=p;
    }
     
    public void pausar(){
        pausado =! pausado;
        
    }
    public void detener(){
        ejecutar = false;
    }
    @Override
    public void run(){
        while(ejecutar){
            try {
                timeCom++;
                if(timeCom>3 && timeCom<=6){
                    quitar=1;
                }
                if(timeCom>6&& timeCom<=9){
                    quitar=2;
                }
                if(timeCom>9 && timeCom<=12){
                    quitar=3;
                }
                
                sleep(1000);
            } catch (InterruptedException ex) {
               
            }
        }
        
    }

    private boolean estaDespausado() {
        return !pausado;
    }
}
