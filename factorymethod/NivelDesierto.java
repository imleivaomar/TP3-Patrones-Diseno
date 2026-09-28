package tp3.factorymethod;

public class NivelDesierto extends Nivel {

    public NivelDesierto() {
        super("Desierto Rojo");
    }

    @Override
    protected Enemigo crearEnemigo() {
        return new Escorpion();
    }
}
