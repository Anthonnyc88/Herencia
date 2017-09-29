/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Anthonny
 */
public class Furgoneta extends Vehiculo {

    public int capasidadPersonas;
    public boolean disponible;

    public Furgoneta(String marca, String color, String matricula, double precio) {
        super(marca, color, matricula, precio);
    }

    public Furgoneta() {

    }

    public int getCapasidadPersonas() {
        return capasidadPersonas;
    }

    public void setCapasidadPersonas(int capasidadPersonas) {
        this.capasidadPersonas = capasidadPersonas;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
