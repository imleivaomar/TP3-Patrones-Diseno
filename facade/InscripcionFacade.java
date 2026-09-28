package tp3.facade;

public class InscripcionFacade {

    private final ValidadorCorrelativas validador;
    private final ControlCupos cupos;
    private final ServicioArancel arancel;
    private final NotificadorEmail notificador;

    public InscripcionFacade(ControlCupos cupos) {
        this.validador = new ValidadorCorrelativas();
        this.cupos = cupos;
        this.arancel = new ServicioArancel();
        this.notificador = new NotificadorEmail();
    }

    public boolean inscribir(Alumno alumno, Materia materia) {
        System.out.println("Inscribiendo a " + alumno.getNombre() + " en " + materia.getNombre() + "...");

        if (!arancel.estaAlDia(alumno)) {
            notificador.enviar(alumno.getEmail(), "Rechazado: registra deuda de aranceles.");
            return false;
        }
        if (!validador.cumpleCorrelativas(alumno, materia)) {
            notificador.enviar(alumno.getEmail(), "Rechazado: no cumple las correlativas de " + materia.getNombre() + ".");
            return false;
        }
        if (!cupos.hayCupo(materia.getCodigo())) {
            notificador.enviar(alumno.getEmail(), "Rechazado: no hay cupo en " + materia.getNombre() + ".");
            return false;
        }

        cupos.reservarCupo(materia.getCodigo());
        notificador.enviar(alumno.getEmail(), "Inscripción confirmada en " + materia.getNombre() + ".");
        return true;
    }
}
