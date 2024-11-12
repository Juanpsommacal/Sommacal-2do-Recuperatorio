package Service;

import Model.Jugador;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JugadorService {

    private Map<String, ArrayList<Jugador>> ojosMap = new HashMap<>();
    private Map<String, ArrayList<Jugador>> posicionMap = new HashMap<>();





    public JugadorService() {
    }

    public JugadorService(Map<String, ArrayList<Jugador>> ojosMap, Map<String, ArrayList<Jugador>> posicionMap) {
        this.ojosMap = ojosMap;
        this.posicionMap = posicionMap;
    }

    public void mapearPorOjos(ArrayList<Jugador> listaJugadores){
        for(Jugador jugador : listaJugadores){
            ojosMap.put(jugador.getEyeColor(), listaJugadores);
        }
    }

    public void mapearPorPosicion(ArrayList<Jugador> listaJugadores){
        for(Jugador jugador : listaJugadores){
            posicionMap.put(jugador.getPosition(), listaJugadores);
        }

    }

    public ArrayList<Jugador> separarPorPosicion(ArrayList<Jugador> listaJugadores, String posicion){
        ArrayList<Jugador> listaFiltrada = new ArrayList<>();
        for(Jugador jugador : listaJugadores){
            if(jugador.getPosition().equals(posicion)){
                listaFiltrada.add(jugador);
            }
        }
        return listaFiltrada;
    }

    public ArrayList<Jugador> separarPorColorDeOjos(ArrayList<Jugador> listaJugadores, String color){
        ArrayList<Jugador> listaFiltrada = new ArrayList<>();
        for(Jugador jugador : listaJugadores){
            if(jugador.getEyeColor().equals(color)){
                listaFiltrada.add(jugador);
            }
        }
        return listaFiltrada;
    }

    public Map<String, ArrayList<Jugador>> getOjosMap() {
        return ojosMap;
    }

    public void setOjosMap(Map<String, ArrayList<Jugador>> ojosMap) {
        this.ojosMap = ojosMap;
    }

    public Map<String, ArrayList<Jugador>> getPosicionMap() {
        return posicionMap;
    }

    public void setPosicionMap(Map<String, ArrayList<Jugador>> posicionMap) {
        this.posicionMap = posicionMap;
    }


}
