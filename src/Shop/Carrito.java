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
    //hacer una arrays para agregar todos los precios (?

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Carrito{" + "total=" + total + '}';
    }
    
    
}
