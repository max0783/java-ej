/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenido;

/**
 *
 * @author max72
 */
public class PeliculaService {
    Pelicula nueva;

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
    
    
}
