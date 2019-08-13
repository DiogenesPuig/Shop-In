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
public class Limpieza extends Producto {

    private int cantDeUsos;
    
    public Limpieza(int cantDeUsos, String nombre, int precioUnit, int precio, String code, int cantidad, boolean descuento) {
        super(nombre, precioUnit, precio, code, cantidad, descuento);
        this.cantDeUsos = cantDeUsos;
    }

    public int getCantDeUsos() {
        return cantDeUsos;
    }

    public void setCantDeUsos(int cantDeUsos) {
        this.cantDeUsos = cantDeUsos;
    }

    @Override
    public void validarDescuento() {
        if (super.descuento) {
            int precio = super.precioUnit - (super.precioUnit / 4);
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
    public String toString() {
        return super.toString() + " La cantidad de usos del producto es=" + cantDeUsos; //To change body of generated methods, choose Tools | Templates.
    }
}
