/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;
    
    public Vehiculo(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String mostrarDatos(){
        return "Marca: "+ marca+ "modelo: "+modelo+"precio: "+precio;
    }
}
