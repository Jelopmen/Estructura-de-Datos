package proyectofinal;

import java.util.Optional;

public class NodoArbolActivos {
    private Productos pedidos;
    private int value;
    private NodoArbolActivos left;
    private NodoArbolActivos right;
 
    public NodoArbolActivos(Integer value) {
        this.value = value;
    }
 
    public int getValue() {
        return value;
    }
 
    public void setValue(Integer value) {
        this.value = value;
    }
 
    public NodoArbolActivos getLeft() {
        return left;
    }
 
    public void setLeft(NodoArbolActivos left) {
        this.left = left;
    }
 
    public NodoArbolActivos getRight() {
        return right;
    }
 
    public void setRight(NodoArbolActivos right) {
        this.right = right;
    }
    
    public Productos getPedidos() {
        return pedidos;
    }

    public void setPedidos(Productos pedidos) {
        this.pedidos = pedidos;
    }
    
    public void add(int value) {
        if (value < this.value) {
            if (left != null) {
                left.add(value);
            } else {
                left = new NodoArbolActivos(value);
            }
        } else {
            if (right != null) {
                right.add(value);
            } else {
                right = new NodoArbolActivos(value);
            }
        }
    }
 
    public Optional<NodoArbolActivos> find(Integer value) {
        if (value == this.value) {
            return Optional.of(this);
        } else if (value < this.value) {
            if (this.left != null) {
                return this.left.find(value);
            } else {
                return Optional.empty();
            }
        } else {
            if (this.right != null) {
                return this.right.find(value);
            } else {
                return Optional.empty();
            }
        }
    }
 
    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(value);
        if (right != null) {
            right.printInOrder();
        }
    }
 
    public void printPreOrder() {
        System.out.println(value);
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }
 
    public void printPosOrder() {
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
        System.out.println(value);
    }
 
    public String toString() {
        return "Nodo [value=" + value + ", left=" + left + ", right=" + right + "]";
    }
}