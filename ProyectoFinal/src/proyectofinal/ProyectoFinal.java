
package proyectofinal;

import java.util.Optional;


public class ProyectoFinal {

   
    public static void main(String[] args) throws Exception {
       Bienvenida login = new Bienvenida();
       login.setVisible(true);
       NodoArbolActivos root = new NodoArbolActivos(46);
        root.add(35);
        root.add(74);
        root.add(39);
        root.add(42);
        root.add(49);
        root.add(23);
        root.add(73);
        root.add(80);
        root.add(96);
        
        System.out.println(root);
             
                
        Optional<NodoArbolActivos> result = root.find(46);
        //System.out.println("Result: "+result);
        if (result.isPresent()) {
            System.out.println(result.get());
            //System.out.println("El valor existe en el arbol");
        } else {
            System.out.println("El Valor no fue encontrado en el Arbol");
        }
 
        result = root.find(39);
        //System.out.println("Result: "+result);
        if (result.isPresent()) {
            System.out.println(result.get());
            //System.out.println("El valor existe en el arbol");
        } else {
            System.out.println("El Valor no fue encontrado en el Arbol");
        }
        System.out.println("Print in order");
        root.printInOrder();
        System.out.println("Print pos order");
        root.printPosOrder();
        System.out.println("Print pre order");
        root.printPreOrder();
        
        
        
        
        ListaCircular listaCircular = new ListaCircular();
        
        System.out.println("<<-- Ejemplo de lista circular simple -->>\n");
        
        listaCircular.agregarAlFinal(12);
        listaCircular.agregarAlFinal(15);
        listaCircular.agregarAlFinal(9);
        listaCircular.agregarAlInicio(41);
        listaCircular.agregarAlInicio(6);
        
        System.out.println("<<-- Lista Circular -->>");
        listaCircular.listar();
        
        System.out.println("\n\n<<-- Tamaño -->");
        System.out.println(listaCircular.getTamanio());
        
        System.out.println("\n<<-- Obtener el valor del nodo en la posicion 3 -->>");
        System.out.println(listaCircular.getValor(3));
        
        System.out.println("\nInsrta un nodo con valor 16 despues del 15");
        listaCircular.insertarPorReferencia(15, 16);
        listaCircular.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(listaCircular.getTamanio());        
        
        System.out.println("\n\nInsrta un nodo con valor 44 en la posición 5");
        listaCircular.insrtarPorPosicion(5, 44);
        listaCircular.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(listaCircular.getTamanio());       
        
        System.out.println("\nActualiza el valor 12 del tercer nodo por 13");
        listaCircular.editarPorReferencia(12, 13);
        listaCircular.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(listaCircular.getTamanio());
        
        System.out.println("\nActualiza el valor nodo en la posición 0 por 17");
        listaCircular.editarPorPosicion(0, 17);
        listaCircular.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(listaCircular.getTamanio());
            
        System.out.println("\nElimina el nodo con el valor 41");
        listaCircular.removerPorReferencia(41);        
        listaCircular.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(listaCircular.getTamanio());        
        
        System.out.println("\nElimina el nodo en la posición 4");
        listaCircular.removerPorPosicion(4);        
        listaCircular.listar();
        System.out.print(" | Tamaño: ");
        System.out.println(listaCircular.getTamanio());
        
        System.out.println("\nConsulta si existe el valor 30");
        System.out.println(listaCircular.buscar(30));
        
        System.out.println("\nConsulta la posicion del valor 16");
        System.out.println(listaCircular.getPosicion(16));
        
        System.out.println("\nElimina la lista");
        listaCircular.eliminar();        
      
        System.out.println("\nConsulta si la lista está vacia");
        System.out.println(listaCircular.esVacia());
        
        System.out.println("\n\n<<-- Fin de ejemplo lista simple -->>");
    }
    
}
