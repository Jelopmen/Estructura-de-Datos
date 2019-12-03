/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ulacit
 */

public class ColaAnulados {
    private Pedido pedido;
    private Queue<Integer> cola = new LinkedList();
    private Queue<Integer> colaE = new LinkedList();

    public ColaAnulados() {
    }

    public Queue<Integer> getCola() {
        return cola;
    }

    public void setCola(Queue<Integer> cola) {
        this.cola = cola;
    }

    public Queue<Integer> getColaE() {
        return colaE;
    }

    public void setColaE(Queue<Integer> colaE) {
        this.colaE = colaE;
    }
    
    public void BuscaAnulado(Queue Cola, int indice){
        Scanner v = new Scanner(System.in);
        int dat;
        int cont = 0;
        dat = v.nextInt();
        for (int buscar : cola) {
            if (dat == buscar) {
            } else if (cont <= cola.size()) {
                cont++;
            }
        }
    }
    
    public void AgregarAnulado(Queue Cola, int indice){
        Scanner v = new Scanner(System.in);
        int dato;
        dato = v.nextInt();
        cola.offer(dato);
        System.out.println();
    }
    
    public void FiltrarAnulado(Queue Cola, int indice){
        Scanner v = new Scanner(System.in);
        indice = v.nextInt();

        if (cola != null) {
            while (cola.peek() != null) {
                if (cola.peek() != indice && cola.size() == 20) {
                    colaE.offer(cola.peek());
                    cola.poll();
                } else {
                    cola.poll();
                }
            }

            while (colaE.peek() != null) {
                cola.offer(colaE.peek());
                colaE.poll();
            }
        }
    }
}
