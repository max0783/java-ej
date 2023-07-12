/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaextragym.Sources.Classes;

import java.util.ArrayList;

/**
 *
 * @author max72
 */
public class GymClass {
    private Cliente user;
    private ArrayList <Rutina> rutina;

    public GymClass(Cliente user, ArrayList<Rutina> rutina) {
        this.user = user;
        this.rutina = rutina;
    }

    public Cliente getUser() {
        return user;
    }

    public void setUser(Cliente user) {
        this.user = user;
    }

    public ArrayList<Rutina> getRutina() {
        return rutina;
    }

    public void setRutina(ArrayList<Rutina> rutina) {
        this.rutina = rutina;
    }
    
    public void addRutina(Rutina rutina){
        //agregar
    }

    @Override
    public String toString() {
        return "GymClass{" + "user=" + user + ", rutina=" + rutina + '}';
    }
    
    
}
