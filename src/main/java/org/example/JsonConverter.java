package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonConverter {


    public class Main {
        public static void main(String[] args) {
            ObjectMapper objectMapper = new ObjectMapper();
            String fileName = "Player.json";
            File file = new File(fileName);
            List<Player> playerList = new ArrayList<>();

            // Primero lee el archivo si existe
            if (file.exists()) {
                try {
                    // Si el archivo ya contiene jugadores, los cargamos
                    playerList = objectMapper.readValue(file, new TypeReference<List<Player>>() {});
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // Agrega un nuevo jugador a la lista
            Player newPlayer = new Player("Nuevo", "Jugador", 1000, new Result(5));
            playerList.add(newPlayer);

            // Ahora guarda la lista actualizada en el archivo
            try {
                objectMapper.writeValue(file, playerList); // Sobreescribe el archivo con el array actualizado
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
