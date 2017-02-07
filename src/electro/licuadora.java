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
public class licuadora extends Electro {
    
    private int velocidades;
    
    public licuadora(String marca, String modelo){
        
        super(marca, modelo);
        this.velocidades = 1;
        
    }
    
    public licuadora(String marca, String modelo, double precio, int cantidad){
        
        super(marca, modelo, precio, cantidad);
        this.velocidades = 1;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    @Override
    public String toString() {
        return super.toString()+ " + velocidades :" + velocidades;
    }
    
    
    
}
