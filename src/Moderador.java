public class Moderador extends Usuario {

    private String Papelera;


    // constructor 
    public Moderador(String nombre,int mensajes,String correo,int papelera);
    
    super(nombre,mensajes,correo);
    this.Papelera=papelera;

    public int getPapelera() {
        return Papelera;
    }


    public void papeleraAumenta() {
        this.Papelera = papelera++;
    }
    
}
