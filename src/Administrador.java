public class Administrador extends Usuario {

    private int Baneo;
    private int papelera;

public Administrador(String nombre,int mensajes,String correo,int papelera,int baneo);

super(nombre,mensajes,correo);
this.baneo=baneo;
this.papelera=papelera;
}

    public int getBaneo() {
        return Baneo;
    }

    public void baneoincrementa() {
        this.Baneo = baneo++;
    }

}