public class App {
    public static void main(String[] args) throws Exception {
    Usuario usuario1= new Usuario("5","learnig.java@gmail.com","ricardo");
    System.out.println(usuario1);

    Moderador moderador1= new Moderador("ramon","4","learnig.java@gmail.com",);
    System.out.println(moderador1);

    Administrador administrador1= new Administrador("grace","8","grace@gmail.com","10","3");
    System.out.println(administrador1);

    Usuario.incrementaMensajes();
    System.out.println(usuario);
    
    Administrador.baneoincrementa();
    System.out.println(administrador);

    Moredador.papeleraAumenta();
    System.out.println(Modedador);


    }
}
