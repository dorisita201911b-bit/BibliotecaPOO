package biblioteca;

public class Bibliotecario extends  Usuario {
    private String turno;

    public Bibliotecario(String nombre, String id, String turno) {
        super(nombre, id);
        this.turno = turno;
    }
Yiber
    public String getTurno() {
        return turno;
    }

    public void registrarLibro(Libro libro) {
        System.out.println("Bibliotecario " + getNombre() + "registro del libro '" + libro.getTitulo() + "' . ");
    }

    public void prestarLibro(Libro libro) {
        System.out.println("Bibliotecario " + getNombre() + " aprueba el préstamo del libro");
        libro.prestar();
    }

}



