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
public class Deportivo extends Vehiculo {

    public double velocidadMaxima;
    public double potencia;

    public Deportivo(String marca, String color, String matricula, double precio) {
        super(marca, color, matricula, precio);
    }

    public Deportivo() {

    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getAtributos() {
        return "Marca: " + marca
                + "\nColor: " + color
                + "\nMatricula:" + matricula
                + "\nPrecio: " + precio
                + "\nVelocidad Maxima: " + velocidadMaxima
                + "\nPotencia: " + potencia;

    }

}
