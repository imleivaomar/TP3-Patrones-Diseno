package tp3.adapter;

public class SensorNacional implements SensorTemperatura {

    private final String ubicacion;
    private final double temperatura;

    public SensorNacional(String ubicacion, double temperatura) {
        this.ubicacion = ubicacion;
        this.temperatura = temperatura;
    }

    @Override
    public double leerCelsius() {
        return temperatura;
    }

    @Override
    public String getUbicacion() {
        return ubicacion;
    }
}
