package proyectofinal;

import java.util.Optional;

public class NodoArbolAnulados {
    private Productos pedidos;
    private int value;
    private NodoArbolAnulados left;
    private NodoArbolAnulados right;
 
    public NodoArbolAnulados(Integer value) {
        this.value = value;
    }
 
    public int getValue() {
        return value;
    }
 
    public void setValue(Integer value) {
        this.value = value;
    }
 
    public NodoArbolAnulados getLeft() {
        return left;
    }
 
    public void setLeft(NodoArbolAnulados left) {
        this.left = left;
    }
 
    public NodoArbolAnulados getRight() {
        return right;
    }
 
    public void setRight(NodoArbolAnulados right) {
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
                left = new NodoArbolAnulados(value);
            }
        } else {
            if (right != null) {
                right.add(value);
            } else {
                right = new NodoArbolAnulados(value);
            }
        }
    }
 
    public Optional<NodoArbolAnulados> find(Integer value) {
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