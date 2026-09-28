package tp3.facade;

public class ServicioArancel {

    public boolean estaAlDia(Alumno alumno) {
        return !alumno.isTieneDeuda();
    }
}
