/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

/**
 *
 * @author diogenes
 */
public class Ropa extends Producto {
    private String talle;

    public Ropa(String talle, String nombre, int precioUnit, String code, int cantidad, boolean descuento) {
        super(nombre, precioUnit, code, cantidad, descuento);
        this.talle = talle;
    }

    

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    @Override
    public void validarDescuento() {
        if(super.descuento){
            int precio = super.precioUnit - (super.precioUnit/4);  
        }
    }

    @Override
    public void restarProducto() {
        super.restarProducto(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sumarProducto() {
        super.sumarProducto(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
