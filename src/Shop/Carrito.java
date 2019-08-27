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
public class Carrito {

    private int total;
    private String[] nombre;
    private int[] precios;
    //hacer una arrays para agregar todos los precios (?

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getPrecios() {
        return precios;
    }

    public void setPrecios(int[] precios) {
        this.precios = precios;
    }

    @Override
    public String toString() {
        return "Carrito{" + "total=" + total + ", nombre=" + nombre + ", precios=" + precios + '}';
    }

    public void calcularTotal() {
        for (int i = 0; i  <  (precios.length); i++) {
            total = total+precios[i];
        }
    }

}
