/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.softprog.gestclientes.model;
import pe.edu.pucp.softprog.rrhh.model.Persona;

/**
 *
 * @author Gino
 */
public class Cliente extends Persona{
    private double lineaCredito;
    private Categoria categoria;

    
    //Getters y Setters
    public double getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(double lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    
}
