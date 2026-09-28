package tp3.factorymethod;

public class NivelCripta extends Nivel {

    public NivelCripta() {
        super("Cripta Olvidada");
    }

    @Override
    protected Enemigo crearEnemigo() {
        return new Esqueleto();
    }
}
