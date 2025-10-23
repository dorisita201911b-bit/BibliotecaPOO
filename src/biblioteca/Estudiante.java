package biblioteca;

public class Estudiante extends  Usuario {
    private  String carrera;

    public Estudiante(String nombre, String id, String carrera) {
        super(nombre, id);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }
    public  void  prestarLibro (Libro libro) {
        System.out.println("Estudiante " + getNombre() + "solicita el libro para estudiar" + carrera + ".");

    }
}


