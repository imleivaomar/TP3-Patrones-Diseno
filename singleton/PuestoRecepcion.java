package tp3.singleton;

public class PuestoRecepcion {

    private final String nombre;

    public PuestoRecepcion(String nombre) {
        this.nombre = nombre;
    }

    public Turno atenderPaciente(String paciente, String especialidad) {
        Turno turno = GeneradorDeTurnos.getInstancia().generarTurno(paciente, especialidad);
        System.out.println("[" + nombre + "] emitió -> " + turno);
        return turno;
    }

    public String getNombre() {
        return nombre;
    }
}
