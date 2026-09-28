package tp3.singleton;

public class GeneradorDeTurnos {

    private static GeneradorDeTurnos instancia;
    private int ultimoNumero;

    private GeneradorDeTurnos() {
        this.ultimoNumero = 0;
    }

    public static synchronized GeneradorDeTurnos getInstancia() {
        if (instancia == null) {
            instancia = new GeneradorDeTurnos();
        }
        return instancia;
    }

    public synchronized Turno generarTurno(String paciente, String especialidad) {
        ultimoNumero++;
        return new Turno(ultimoNumero, paciente, especialidad);
    }

    public int getUltimoNumero() {
        return ultimoNumero;
    }
}
