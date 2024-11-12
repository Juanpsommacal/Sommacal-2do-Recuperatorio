import Model.Jugador;
import Model.Nombre;
import Service.JsonUtiles;
import Service.JugadorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        JSONArray jsonArray;
        ArrayList<Jugador> jugadoresArray = new ArrayList<>();

        try {
            jsonArray = new JSONArray(JsonUtiles.leer("jugadores"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        for(int i = 0; i < jsonArray.length(); i++){
            Jugador jugador = new Jugador();
            JSONObject jsonObject = null;
            try {
                jsonObject = jsonArray.getJSONObject(i);
                jugador.set_id(jsonObject.getString("_id"));
                jugador.setGuid(jsonObject.getString("guid"));
                jugador.setisActive(jsonObject.getBoolean("isActive"));
                jugador.setBalance(jsonObject.getString("balance"));
                jugador.setAge(jsonObject.getInt("age"));
                jugador.setEyeColor(jsonObject.getString("eyeColor"));
                jugador.setName(new Nombre(jsonObject.getJSONObject("name").getString("first"), jsonObject.getJSONObject("name").getString("last")));
                jugador.setEmail(jsonObject.getString("email"));
                jugador.setPhone(jsonObject.getString("phone"));
                jugador.setPosition(jsonObject.getString("position"));

                jugadoresArray.add(jugador);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        JugadorService jugadorService = new JugadorService();
        jugadorService.mapearPorOjos(jugadorService.separarPorColorDeOjos(jugadoresArray, "blue"));
        jugadorService.mapearPorOjos(jugadorService.separarPorColorDeOjos(jugadoresArray, "brown"));
        jugadorService.mapearPorOjos(jugadorService.separarPorColorDeOjos(jugadoresArray, "green"));

        jugadorService.mapearPorPosicion(jugadorService.separarPorPosicion(jugadoresArray, "tanque"));
        jugadorService.mapearPorPosicion(jugadorService.separarPorPosicion(jugadoresArray, "curador"));
        jugadorService.mapearPorPosicion(jugadorService.separarPorPosicion(jugadoresArray, "soporte"));


        System.out.println(jugadorService.getOjosMap().entrySet());
        System.out.println("\n");
        System.out.println(jugadorService.getPosicionMap().entrySet());











    }
}