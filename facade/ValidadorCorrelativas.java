package tp3.facade;

public class ValidadorCorrelativas {

    public boolean cumpleCorrelativas(Alumno alumno, Materia materia) {
        for (String codigo : materia.getCorrelativas()) {
            if (!alumno.aprobo(codigo)) {
                return false;
            }
        }
        return true;
    }
}
