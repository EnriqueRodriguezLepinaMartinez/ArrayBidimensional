/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrlbidimensional;

import java.util.ArrayList;

/**
 *
 * @author ricky_000
 */
public class Liga {
    //CREO LISTA DE JUGADORES LLAMADA LIGA DONDE SE GUARDARAN LOS EQUIPOS.
     ArrayList<ArrayList<Jugador>> liga = new ArrayList<ArrayList<Jugador>>();
     ArrayList<Jugador> equipo;
    
    
    public void añadirEquipo(){
        equipo = new ArrayList<Jugador>();
        liga.add(equipo);
    }
     
    public ArrayList<Jugador> añadirJugador(String nombre, int dorsal){
        equipo.add(new Jugador(nombre,dorsal));
        return equipo;
    }
    
    public void mostrar(){
           for(int i =0;i< liga.size();i++){ //RECORRO LOS EQUIPOS DE LA LIGA
            System.out.println("\n");
            for (int j=0;j<liga.get(i).size();j++){ //RECORRO LOS JUGADORES DE LOS EQUIPOS
                System.out.print(liga.get(i).get(j));
            }
    }
    }
    
  
}
