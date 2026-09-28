package tp3.adapter;

public class AdaptadorTermometro implements SensorTemperatura {

    private final TermometroImportado termometro;
    private final String ubicacion;

    public AdaptadorTermometro(TermometroImportado termometro, String ubicacion) {
        this.termometro = termometro;
        this.ubicacion = ubicacion;
    }

    @Override
    public double leerCelsius() {
        return (termometro.getTempFahrenheit() - 32) * 5.0 / 9.0;
    }

    @Override
    public String getUbicacion() {
        return ubicacion + " [" + termometro.getModelo() + "]";
    }
}
