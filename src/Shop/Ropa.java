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

    public Ropa(String talle, String nombre, int precioUnit, int precio, String code, int cantidad, boolean descuento) {
        super(nombre, precioUnit, precio, code, cantidad, descuento);
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
        if(super.cantidad>=2){
            super.descuento = true;
        }else{
            super.descuento = false;
        }
    }

    @Override
    public void aplicarDescuento() {
        int cantprob = super.cantidad;
        if (super.descuento) {
            if (super.cantidad % 2 == 0) {
                super.precio = precioUnit * cantidad;
                super.precio = super.precio / 2;
                System.out.println(precio);
            }else{
                super.precio = super.precioUnit * super.cantidad;               
                super.precio = ((super.precio - super.precioUnit)/2);
                super.precio+= super.precioUnit;
            }
            
        }else{
            precio = precioUnit * cantidad;
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
    
    @Override
    public void calcularTotal() {
        validarDescuento();
        aplicarDescuento();
    }

    @Override
    public String toString() {
        return super.toString() + " La talla de la ropa es= " + talle; //To change body of generated methods, choose Tools | Templates.
    }

}
