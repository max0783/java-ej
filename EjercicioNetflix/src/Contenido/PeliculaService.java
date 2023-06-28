/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenido;

import java.util.Scanner;

/**
 *
 * @author max72
 */
public class PeliculaService {
    

    public Pelicula PeliculaService() {
        return new Pelicula();
    }
    
    public boolean buscarPorGenero(Pelicula nueva,String genero){
            return nueva.getGenero().contains(genero);
    }
    
    public boolean buscarPorGenero(Pelicula [] nueva, String genero){
        for (int i = 0; i< nueva.length; i++){
            if (nueva[i].getGenero().contains(genero))
                return true;
        }
        return false;
    }
    
    public Pelicula crearPelicula(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los detalles de la película: ");

            System.out.print("Título: ");
            String titulo = leer.nextLine();

            System.out.print("Género: ");
            String genero = leer.nextLine();

            System.out.print("Año: ");
            int anio = leer.nextInt();

            System.out.print("Duración (en minutos): ");
            int duracion = leer.nextInt();

            return new Pelicula(titulo, genero, anio, duracion);
        
    }
    
     public  Pelicula[] crearPelicula(int cantidad) {
        Pelicula[] peliculas = new Pelicula[cantidad];
        for (int i = 0; i < cantidad; i++) {
            peliculas[i] = crearPelicula();
        }
        return peliculas;
    }
    
     public String [] mostrarPeliculas(Pelicula [] setDePelis){
         String [] nombreDePelis = new String [setDePelis.length];
         for (int i = 0; i<setDePelis.length; i++){
             nombreDePelis[i] = mostrarPelicula(setDePelis[i]);
         }
         return nombreDePelis;
     }
     
     public String mostrarPelicula(Pelicula unica){
         return unica.toString();
     }
     
     public boolean buscarPorTitulo(Pelicula nueva,String titulo){
        return nueva.getTitulo().contains(titulo);
    }

    public boolean buscarPorTitulo(Pelicula [] nueva, String titulo){
        for (int i = 0; i< nueva.length; i++){
            if (nueva[i].getTitulo().contains(titulo))
                return true;
        }
        return false;
    }
}
