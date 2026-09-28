package tp3.adapter;

public class TermometroImportado {

    private final String modelo;
    private final float gradosFahrenheit;

    public TermometroImportado(String modelo, float gradosFahrenheit) {
        this.modelo = modelo;
        this.gradosFahrenheit = gradosFahrenheit;
    }

    public float getTempFahrenheit() {
        return gradosFahrenheit;
    }

    public String getModelo() {
        return modelo;
    }
}
