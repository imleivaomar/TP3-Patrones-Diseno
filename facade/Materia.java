package tp3.facade;

import java.util.List;

public class Materia {

    private final String codigo;
    private final String nombre;
    private final List<String> correlativas;

    public Materia(String codigo, String nombre, List<String> correlativas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correlativas = List.copyOf(correlativas);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getCorrelativas() {
        return correlativas;
    }
}
