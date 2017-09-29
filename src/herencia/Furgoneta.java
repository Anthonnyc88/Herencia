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
    public String disponible;

    public Furgoneta(int capasidadPersonas, String disponible, String marca, String color, String matricula, double precio) {
        super(marca, color, matricula, precio);
        this.capasidadPersonas = capasidadPersonas;
        this.disponible = disponible;
    }

    public Furgoneta() {

    }

    public int getCapasidadPersonas() {
        return capasidadPersonas;
    }

    public void setCapasidadPersonas(int capasidadPersonas) {
        this.capasidadPersonas = capasidadPersonas;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public String getAtributos() {
        return "Marca: " + marca
                + "\nColor: " + color
                + "\nMatricula:" + matricula
                + "\nPrecio: " + precio
                + "\nCapasidad Personas: " + capasidadPersonas
                + "\nDisponible: " + disponible;

    }

}
