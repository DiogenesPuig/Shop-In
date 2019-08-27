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
public class Factura {
    private Usuario cliente;
    private int total;
    private int ahorraste;

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAhorraste() {
        return ahorraste;
    }

    public void setAhorraste(int ahorraste) {
        this.ahorraste = ahorraste;
    }

    @Override
    public String toString() {
        return "Factura{" + "cliente=" + cliente + ", total=" + total + ", ahorraste=" + ahorraste + '}';
    }
    
    
}
