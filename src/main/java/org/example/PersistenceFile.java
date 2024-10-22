package org.example;

import java.io.*;

public class PersistenceFile {


    public void crearArchivo(String nombre) {
        File archivo = new File(nombre);
        try {
            PrintWriter pw = new PrintWriter(archivo);
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Archivo creado correctamente");
    }

    public void sobreescribirArchivo(String nombreArchivo, String texto) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter pw = new PrintWriter(archivo);
            pw.println(texto);
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Archivo sobreescrito correctamente");
    }

    public void agregarTextoAlArchivo(String nombreArchivo, String texto) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(archivo, true));
            pw.println(texto);
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Archivo Modificado correctamente");
    }

    public String leerArchivo(String nombreArchivo){
        StringBuilder contenido = new StringBuilder();
        File archi = new File(nombreArchivo);

        try {
            BufferedReader buff = new BufferedReader(new FileReader(archi));
            String lineaActual = buff.readLine();
            while(lineaActual!=null){
                contenido.append(lineaActual);
                lineaActual = buff.readLine();
            }
            buff.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contenido.toString();
    }
}
