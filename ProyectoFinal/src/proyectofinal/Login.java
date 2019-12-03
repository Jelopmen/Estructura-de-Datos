
package proyectofinal;


public class Login {
    private String[] usuario = new String[10];
    private String[] contrasena = new String[10];

    public Login() {
        CargarVector();
        usuario[0] = "Admin";
        contrasena[0] = "admin";
    }
    
    public void Agregar(String user, String pass){
        for (int i = 0; i < 10; i++) {
            if (usuario[i].equals("")) {
                usuario[i] = user;
                contrasena[i] = pass;
            }
        }
        
    }
    
    private void CargarVector(){
        for (int i = 0; i < 10; i++) {
            usuario[i] = "";
            contrasena[i] = "";
        }
    }
    
    public String[] getUsuario() {
        return usuario;
    }

    public void setUsuario(String[] usuario) {
        this.usuario = usuario;
    }

    public String[] getContrasena() {
        return contrasena;
    }

    public void setContrasena(String[] contrasena) {
        this.contrasena = contrasena;
    }
    
    public boolean Verificar(String user, String pass){
        boolean result = false;
        for (int i = 0; i < 10; i++) {
            if (usuario[i].equals(user)) {
                if (contrasena[i].equals(pass)) {
                    result = true;
                }
            }
        }
        return result;
    }
}
