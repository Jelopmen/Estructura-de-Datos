/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Jeffrey
 */
public class Productos {
    private int matrizProductos[][] = new int[10][3];
    private String descripcion;
    private int id;
    private int cantidad;
    

    public Productos() {
    }

    public Productos(String descripcion, int id, int cantidad) {
        this.descripcion = descripcion;
        this.id = id;
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void editarProducto(){}

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[][] getMatrizProductos() {
        return matrizProductos;
    }

    public void setMatrizProductos(int[][] matrizProductos, int id, String descripcion, int cantidad) {
        this.matrizProductos = matrizProductos;
    }
    
    
    
    
}
