package tp3.decorator;

public abstract class ExtraAlquiler implements Alquiler {

    protected final Alquiler alquiler;

    protected ExtraAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    @Override
    public String getDescripcion() {
        return alquiler.getDescripcion();
    }

    @Override
    public double getCostoDiario() {
        return alquiler.getCostoDiario();
    }
}
