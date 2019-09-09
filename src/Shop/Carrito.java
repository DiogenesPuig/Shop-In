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
    private boolean estoy;
    private int guardar;
    private String texto;
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

    public boolean isEstoy() {
        return estoy;
    }

    public void setEstoy(boolean estoy) {
        this.estoy = estoy;
    }

    public int getGuardar() {
        return guardar;
    }

    public void setGuardar(int guardar) {
        this.guardar = guardar;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String hacerTxt() {
        String text = "";
        for (int i = 0; i < nombre.length; i++) {
            text = text + nombre[i] + " " + Integer.toString(precios[i]) + " \n";
        }
        return text;
    }

    public int revisarArrays(String producto) {
        System.out.println("estoy aca");
        for (int i = 0; i < nombre.length; i++) {
            if (producto == nombre[i]) {
                estoy = true;
                return i;
            } else {
                estoy = false;
            }
        }
        return -1;
    }

    public int calcularTam() {
        int i;
        for (i = 0; i <= nombre.length; i++) {
            System.out.println("algo");
        }
        return i;
    }

    public void agregarPrecio(int precio) {
        if (estoy) {
            precios[guardar] = precio;
            estoy = false;
        } else {
            int lugar = calcularTam();
            precios[lugar] = precio;
        }
    }

    public void agregarNombres(String nombres) {
        int n = revisarArrays(nombres);
        if (estoy) {
            nombre[n] = nombres;
            guardar = n;
        } else {
            int lugar = calcularTam();
            nombre[lugar] = nombres;
        }
    }

    @Override
    public String toString() {
        return "Carrito{" + "total=" + total + ", nombre=" + nombre + ", precios=" + precios + '}';
    }

    public void calcularTotal() {
        for (int i = 0; i < (precios.length); i++) {
            total = total + precios[i];
        }
    }

}
