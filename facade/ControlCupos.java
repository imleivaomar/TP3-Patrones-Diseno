package tp3.facade;

import java.util.HashMap;
import java.util.Map;

public class ControlCupos {

    private final Map<String, Integer> cuposDisponibles = new HashMap<>();

    public void definirCupo(String codigoMateria, int cupo) {
        cuposDisponibles.put(codigoMateria, cupo);
    }

    public boolean hayCupo(String codigoMateria) {
        return cuposDisponibles.getOrDefault(codigoMateria, 0) > 0;
    }

    public void reservarCupo(String codigoMateria) {
        cuposDisponibles.put(codigoMateria, cuposDisponibles.get(codigoMateria) - 1);
    }

    public int getCupos(String codigoMateria) {
        return cuposDisponibles.getOrDefault(codigoMateria, 0);
    }
}
