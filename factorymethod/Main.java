package tp3.factorymethod;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== FACTORY METHOD: Enemigos de cada nivel del juego ===");

        List<Nivel> niveles = List.of(new NivelBosque(), new NivelDesierto(), new NivelCripta());

        int cantidad = 2;
        for (Nivel nivel : niveles) {
            List<Enemigo> oleada = nivel.generarOleada(cantidad);
            int vidaTotal = 0;
            for (Enemigo e : oleada) {
                vidaTotal += e.getVida();
            }
            System.out.println("  Vida total de la oleada: " + vidaTotal);
            cantidad++;
        }
        System.out.println();
    }
}
