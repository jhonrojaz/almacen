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
public class lavadoras extends Electro{
    
    private int libras;
    
    public lavadoras (String marca, String modelo){
        super (marca, modelo);
        this.libras = 0;
        
    }
    
    public lavadoras (String marca, String modelo, double precio, int cantidades){
        super (marca, modelo, precio, cantidades );
        this.libras = 0;
        
    }

    public int getLibras() {
        return libras;
    }

    public void setLibras(int libras) {
        this.libras = libras;
    }

    @Override
    public String toString() {
        return super.toString() + ",\nlibras: " + libras;
    }
    
    
}
