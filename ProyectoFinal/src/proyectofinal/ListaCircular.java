package proyectofinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class ListaCircular {
    //Definicion de variables, nodos de control de la lista
    private Nodo1 inicio;
    private Nodo1 ultimo;
    private int tamanio;
    private String user;
    private String password;
    
    public void Lista(){
        inicio = null;
        ultimo = null;
        tamanio = 0;
    }
    //Evalua contenido de lista
    public boolean esVacia(){
        return inicio == null;
    }
    
    public int getTamanio(){
        return tamanio;
    }
    
    //Metodo para insertar en el final de la lista
    public void agregarAlFinal(int valor){
        Nodo1 nuevo = new Nodo1();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        } else{
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            ultimo = nuevo;
        }
        tamanio++;
    }
    
    //Metodo para insertar en el inicio de la lista
    public void agregarAlInicio(int valor){
        Nodo1 nuevo = new Nodo1();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
            ultimo = nuevo;  
            ultimo.setSiguiente(inicio);
        } else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            ultimo.setSiguiente(inicio);
        }
        tamanio++;
    }
    
    //Metodo que recibe un valor el cual debera de buscar
    public void insertarPorReferencia(int referencia, int valor){
        Nodo1 nuevo = new Nodo1();
        nuevo.setValor(valor);
        //Verifica que no este vacia
        if (!esVacia()) {
            
            //Busca atraves de la refencia el dato, sino pasa al siguiente nodo
            if (buscar(referencia)) {
                Nodo1 aux = inicio;
                //Atraves del valor lo inserta por medio de la referencia
                while (aux.getValor() != referencia) {
                    aux = aux.getSiguiente();
                }
                if (aux == ultimo) {
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(inicio);
                    ultimo = nuevo;
                } else {
                    Nodo1 siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
                tamanio++;
            }
        }      
    }
    //Inserta valor digitado atravez de una posicion definida por el usuario
    public void insrtarPorPosicion(int posicion, int valor){
        //Valida que la posicion exista
        if(posicion>=0 && posicion<=tamanio){
            Nodo1 nuevo = new Nodo1();
            nuevo.setValor(valor);
            if(posicion == 0){
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                ultimo.setSiguiente(inicio);
            }
            else{
                //Si la posicion es igual al tamanio determina que debe crear un nodo nuevo y agrega el nuevo valor
                if(posicion == tamanio){
                    ultimo.setSiguiente(nuevo);
                    nuevo.setSiguiente(inicio);
                    ultimo = nuevo;     
                }
                else{
                    //Recorre la lista en busca de la posicion
                    Nodo1 aux = inicio;
                    for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getSiguiente();
                    }
                    Nodo1 siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            tamanio++;
        }
    }
    
    //Obtiene el valor por medio de una posicion
    public int getValor(int posicion) throws Exception{
        //Verifica que hayan datos
        if(posicion>=0 && posicion<tamanio){
            if (posicion == 0) {
                return inicio.getValor();
            }else{
                //Recorre la lista en busqueda de la posicion para obtener el valor
                Nodo1 aux = inicio;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                return aux.getValor();
            }
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }
    //Busca por medio de una refencia por lo que lo realiza por medio de una boolean.
    public boolean buscar(int referencia){
        Nodo1 aux = inicio;
        boolean encontrado = false;
        //No se detiene de buscar hasta que sea verdadero
        do{
            if (referencia == aux.getValor()){
                encontrado = true;
            }
            else{
                aux = aux.getSiguiente();
            }
        }while(aux != inicio && encontrado != true);
        return encontrado;
    }
    //Obtiene la posicion de un valor dentro de la lista
    public int getPosicion(int referencia) throws Exception{
        //Lo busca atraves de una refencia y por medio de un contador indica la posicion del valor
        if (buscar(referencia)) {
            Nodo1 aux = inicio;
            int cont = 0;
            while(referencia != aux.getValor()){
                cont ++;
                aux = aux.getSiguiente();
            }
            return cont;
        } else {
            //Si no se encuentra el valor tira error
            throw new Exception("Valor inexistente en la lista.");
        }
    }
    
    //Editar un valor dentro de la lista por medio  de una referencia
    public void editarPorReferencia(int referencia, int valor){
        //Busca el valor que se desea modificar
        if (buscar(referencia)) {
            Nodo1 aux = inicio;
            while(aux.getValor() != referencia){
                aux = aux.getSiguiente();
            }
            //Una vez encontrado lo sustituye por el valor digitado
            aux.setValor(valor);
        }
    }
    //Edita valor por posicion
    public void editarPorPosicion(int posicion , int valor){
        //verifica que no exada el tamamnio de la lista
        if(posicion>=0 && posicion<tamanio){
            if(posicion == 0){
                //Sino hay datos lo agrega al inicio
                inicio.setValor(valor);
            }
            else{
                Nodo1 aux = inicio;
                //Busca en toda la lista la posicion para insertar el valor
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                aux.setValor(valor);
            }
        }
    }
    //Elimina por referencia
    public void removerPorReferencia(int referencia){
        if (buscar(referencia)) {
            //Busca la referencia
            if (inicio.getValor() == referencia) {
                inicio = inicio.getSiguiente();
                ultimo.setSiguiente(inicio); 
            } else{
                Nodo1 aux = inicio;
                //Recorre la lista en busca de la referencia
                while(aux.getSiguiente().getValor() != referencia){
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() == ultimo) {
                    aux.setSiguiente(inicio);
                    ultimo = aux;
                } else {
                    Nodo1 siguiente = aux.getSiguiente();
                    aux.setSiguiente(siguiente.getSiguiente());  
                }
            }
            tamanio--;
        }
    }
    //Elimina un dato por posicion
    public void removerPorPosicion(int posicion){
        //verifica que hayan datos
        if(posicion>=0 && posicion<tamanio){
            if(posicion == 0){
                inicio = inicio.getSiguiente();
                ultimo.setSiguiente(inicio);
            }
            else{
                //Busca la posicion indicada para removerla de la lista
                Nodo1 aux = inicio;
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() == ultimo) {
                    aux.setSiguiente(inicio);
                    ultimo = aux;
                } else {
                    Nodo1 siguiente = aux.getSiguiente();
                    aux.setSiguiente(siguiente.getSiguiente());  
                }
            }
            tamanio--;
        }
    }
    //Vacia toda la lista
    public void eliminar(){
        inicio = null;
        ultimo = null;
        tamanio = 0;
    }  
    //Muestra tos los valores de la lista
    public void listar(){
        if (!esVacia()) {
            Nodo1 aux = inicio;
            int i = 0;
            System.out.print("-> ");
            do{
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                aux = aux.getSiguiente();
                i++;
            }while(aux != inicio);
        }
    }

    public Nodo1 getInicio() {
        return inicio;
    }

    public void setInicio(Nodo1 inicio) {
        this.inicio = inicio;
    }

    public Nodo1 getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo1 ultimo) {
        this.ultimo = ultimo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
