/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrlbidimensional;

/**
 *
 * @author ricky_000
 */
public class ArrLBidimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Liga santander = new Liga();
        santander.añadirEquipo();
        santander.añadirJugador("Ceballos",10);
        santander.añadirJugador("Joaquin",17);
        santander.añadirEquipo();
        santander.añadirJugador("Messi",10);
        santander.mostrar();
        
        
    }
    
}
