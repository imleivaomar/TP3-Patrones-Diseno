package tp3.factorymethod;

public class NivelBosque extends Nivel {

    public NivelBosque() {
        super("Bosque Oscuro");
    }

    @Override
    protected Enemigo crearEnemigo() {
        return new Lobo();
    }
}
