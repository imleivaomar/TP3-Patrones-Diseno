package tp3.facade;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== FACADE: Sistema de inscripción a materias ===");

        Materia prog2 = new Materia("PROG2", "Programación II", List.of("PROG1"));

        ControlCupos cupos = new ControlCupos();
        cupos.definirCupo("PROG2", 1);

        Alumno juan = new Alumno(1001, "Juan López", "juan@mail.com", false);
        juan.aprobarMateria("PROG1");
        Alumno carla = new Alumno(1002, "Carla Medina", "carla@mail.com", false);
        Alumno pedro = new Alumno(1003, "Pedro Sosa", "pedro@mail.com", true);
        pedro.aprobarMateria("PROG1");
        Alumno vale = new Alumno(1004, "Valentina Ríos", "vale@mail.com", false);
        vale.aprobarMateria("PROG1");

        InscripcionFacade sistema = new InscripcionFacade(cupos);
        sistema.inscribir(juan, prog2);
        sistema.inscribir(carla, prog2);
        sistema.inscribir(pedro, prog2);
        sistema.inscribir(vale, prog2);

        System.out.println("Cupos restantes en " + prog2.getNombre() + ": " + cupos.getCupos("PROG2"));
        System.out.println();
    }
}
