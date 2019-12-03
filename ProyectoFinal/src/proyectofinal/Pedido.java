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
public class Pedido {
    private String vectorPedidos [] = new String [3];
    private String matrizProductos[][] = new String[10][2];
    private int value;
    public Pedido() {
    }

    public String[][] getMatrizProductos() {
        return matrizProductos;
    }
    
    public void setMatrizProductos(String[][] matrizProductos) {
        this.matrizProductos = matrizProductos;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String[] getVectorPedidos() {
        return vectorPedidos;
    }

    public void setVectorPedidos(String[] vectorPedidos) {
        this.vectorPedidos = vectorPedidos;
    }
}
