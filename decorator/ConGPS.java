package tp3.decorator;

public class ConGPS extends ExtraAlquiler {

    private static final double COSTO_GPS = 3000;

    public ConGPS(Alquiler alquiler) {
        super(alquiler);
    }

    @Override
    public String getDescripcion() {
        return alquiler.getDescripcion() + " + GPS";
    }

    @Override
    public double getCostoDiario() {
        return alquiler.getCostoDiario() + COSTO_GPS;
    }
}
