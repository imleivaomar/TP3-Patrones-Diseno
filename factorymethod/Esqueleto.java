package tp3.factorymethod;

public class Esqueleto implements Enemigo {

    private final int vida = 55;

    @Override
    public String getNombre() {
        return "Esqueleto";
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public String atacar() {
        return "El esqueleto lanza una flecha (-10 HP)";
    }
}
