/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionetflix;
import Contenido.*;
import java.util.Scanner;
public class EjercicioNetflix {
    public static void main(String[] args) {
        PeliculaService servicioPeli = new PeliculaService();
        Pelicula [] pelis;
        
        
        Scanner leer = new Scanner(System.in);
       boolean salida = false;
        while(salida == false){
            System.out.println("Seleccione una opción:");
            System.out.println("1. Cargar pelicula");
            System.out.println("2. Hacer una lista de todas las peliculas disponibles");
            System.out.println("3. Cargar un alquiler");
            System.out.println("4. Realizar una lista de todos los alquileres");
            System.out.println("5. Buscar películas por título o por género");
            System.out.println("6. Buscar alquileres por fecha");
            System.out.println("7. Salir");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Aqui cargamos la pelicula");
                    break;
                case 2:
                    System.out.println("Aqui hacemos una lista de las películas disponibles");
                    break;
                case 3:
                    System.out.println("Aqui cargamos un alquiler");
                    break;
                case 4:
                    System.out.println("Aqui creamos una lista de todos los alquileres");
                    break;
                case 5:
                    System.out.println("Aqui buscamos una peli por título o genero");
                    break;
                case 6:
                    System.out.println("Aqui buscamos por fecha");
                    break;
                case 7:
                    salida = true;
                    System.out.println("Hasta la próxima");
                    break;
                default:
                    System.out.println("Ingresa una opción válida");
                    break;
            }
            
            
        }
     
    }
}

