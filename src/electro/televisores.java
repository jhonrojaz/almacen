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
public class televisores extends Electro{
    
    private int pulgadas;
    private String color;
    private boolean smartv;    
    
    public televisores (String marca, String modelo){
        
        super(marca, modelo);
        this.color = "";
        this.pulgadas = 0;
        this.smartv = false;
         
    }
    public televisores (String marca, String modelo, double precio, int cantidad){
        
        super(marca, modelo, precio, cantidad);
        this.color = "";
        this.pulgadas = 0;
        this.smartv = false;
         
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public String getColor() {
        return color;
    }

    public boolean isSmartv() {
        return smartv;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSmartv(boolean smartv) {
        this.smartv = smartv;
    }

    @Override
    public String toString() {
        return super.toString() + ",\npulgadas: " + pulgadas + ",\ncolor: " + color + ",\nsmartv: " + smartv;
    }
   
    
}
