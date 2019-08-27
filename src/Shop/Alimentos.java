/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import java.sql.Date;

/**
 *
 * @author diogenes
 */
public class Alimentos extends Producto {
    private String vencimiento; 

    public Alimentos(String vencimiento, String nombre, int precioUnit, int precio, String code, int cantidad, boolean descuento) {
        super(nombre, precioUnit, precio, code, cantidad, descuento);
        this.vencimiento = vencimiento;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    @Override
    public String toString() {
        return super.toString() + " La fecha de vencimiento es ="+ vencimiento; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aplicarDescuento() {
        if(super.descuento){
            super.precio = super.precio - super.precio/10; 
        }
    }

    @Override
    public void validarDescuento() {
        super.descuento = true;
    }
    
    
}
