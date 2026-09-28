package tp3.singleton;

public class Turno {

    private final int numero;
    private final String paciente;
    private final String especialidad;

    public Turno(int numero, String paciente, String especialidad) {
        this.numero = numero;
        this.paciente = paciente;
        this.especialidad = especialidad;
    }

    public int getNumero() {
        return numero;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Turno N° " + numero + " - " + paciente + " (" + especialidad + ")";
    }
}
