/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shop;

import java.util.Arrays;

/**
 *
 * @author diogenes
 */
public class Carrito {

    private int total;
    private String nombre[] = new String[20];
    private int precios[] = new int[20];
    private boolean estoy;
    private int guardar;
    private String texto;
    //hacer una arrays para agregar todos los precios (?

    public Carrito(int total, String[] nombre, int[] precios, boolean estoy, int guardar, String texto) {
        this.total = total;
        this.nombre = nombre;
        this.precios = precios;
        this.estoy = estoy;
        this.guardar = guardar;
        this.texto = texto;
    }

    public Carrito() {
        total = 0;
        texto = "";

    }

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
            if (nombre[i] == null) {
                text = text;
            } else {
                text = text + nombre[i] + " " + Integer.toString(precios[i]) + " \n";
            }
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

    public int rellenar() {
        int i = 0;
        for (i = 0; nombre[i] != null; i++) {
            System.out.println("algo");
            if (i > nombre.length) {
                break;
            }
        }
        return i;
    }

    public void agregarPrecio(int precio) {
        System.out.println("precios");
        if (estoy) {
            precios[guardar] = precio;
            estoy = false;
        } else {

            precios[guardar] = precio;
        }
    }

    public void agregarNombres(String nombres) {
        System.out.println("nombres");
        int n = revisarArrays(nombres);
        if (estoy) {
            nombre[n] = nombres;
            guardar = n;
        } else {
            guardar = rellenar();
            nombre[guardar] = nombres;
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
