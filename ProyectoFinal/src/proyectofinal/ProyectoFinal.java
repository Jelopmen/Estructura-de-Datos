
package proyectofinal;

import java.util.Optional;


public class ProyectoFinal {

   
    public static void main(String[] args) throws Exception {
       Bienvenida login = new Bienvenida();
//       login.setVisible(true);
       NodoArbolActivos root = new NodoArbolActivos(0);
       root.add(1);
       root.add(2);
       root.add(3);
        System.out.println(root);
        
    }
    
}
