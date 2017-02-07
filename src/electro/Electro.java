/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electro;

/**
 *
 * @author HP
 */
public class Electro implements control{

    /**
     * @param args the command line arguments
     */
    private String marca;
    private String modelo;
    private double precio;
    int cantidad;
    
    public Electro (String marca,String modelo){
        
        this.marca = marca;
        this.modelo = modelo;
        this.precio = 0;
        this.cantidad = 10;      
    }
    public Electro (String marca,String modelo, double precio, int cantidad){
        
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.cantidad = cantidad;
    }   

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Electro{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    @Override
    public int vender(int artvendidos){
        if (artvendidos >= cantidad){
            System.out.println("solo se pueden vender" + cantidad + "arrticulos");
        }
        System.out.println("venta exitosa");
        cantidad =- cantidad; 
        return cantidad;
       }
    
    @Override
    public int existen(){
        
        return cantidad;
    }
}
