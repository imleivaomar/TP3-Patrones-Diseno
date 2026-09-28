package tp3.factorymethod;

public class Escorpion implements Enemigo {

    private final int vida = 30;

    @Override
    public String getNombre() {
        return "Escorpión";
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public String atacar() {
        return "El escorpión envenena al jugador (-5 HP por turno)";
    }
}
