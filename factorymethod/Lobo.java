package tp3.factorymethod;

public class Lobo implements Enemigo {

    private final int vida = 40;

    @Override
    public String getNombre() {
        return "Lobo";
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public String atacar() {
        return "El lobo muerde al jugador (-8 HP)";
    }
}
