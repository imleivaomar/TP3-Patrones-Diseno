package tp3.facade;

import java.util.HashSet;
import java.util.Set;

public class Alumno {

    private final int legajo;
    private final String nombre;
    private final String email;
    private final Set<String> materiasAprobadas;
    private boolean tieneDeuda;

    public Alumno(int legajo, String nombre, String email, boolean tieneDeuda) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.email = email;
        this.tieneDeuda = tieneDeuda;
        this.materiasAprobadas = new HashSet<>();
    }

    public void aprobarMateria(String codigoMateria) {
        materiasAprobadas.add(codigoMateria);
    }

    public boolean aprobo(String codigoMateria) {
        return materiasAprobadas.contains(codigoMateria);
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public boolean isTieneDeuda() {
        return tieneDeuda;
    }

    public void setTieneDeuda(boolean tieneDeuda) {
        this.tieneDeuda = tieneDeuda;
    }
}
