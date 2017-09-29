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
public class Vehiculo {
    public String marca;
    public String color;
    public String matricula;
    public double precio;

    public Vehiculo(String marca, String color, String matricula, double precio) {
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.precio = precio;
    }
    
    
     public Vehiculo() {
         
        
    }
     
     
//     public String getAtributos() {
//        return "Marca: " + marca;
//                + "\nColor:" + color
//                + "\nMatricula:" + matricula
//                + "\nPrecio:" + precio;
//
//    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
     
     

}
