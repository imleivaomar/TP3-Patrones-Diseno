package tp3.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Nivel {

    private final String nombre;

    protected Nivel(String nombre) {
        this.nombre = nombre;
    }

    protected abstract Enemigo crearEnemigo();

    public List<Enemigo> generarOleada(int cantidad) {
        System.out.println("Nivel: " + nombre + " - generando " + cantidad + " enemigos");
        List<Enemigo> oleada = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Enemigo enemigo = crearEnemigo();
            oleada.add(enemigo);
            System.out.println("  + " + enemigo.getNombre() + " (vida " + enemigo.getVida() + ") -> " + enemigo.atacar());
        }
        return oleada;
    }

    public String getNombre() {
        return nombre;
    }
}
