package tp3.adapter;

import java.util.ArrayList;
import java.util.List;

public class MonitorInvernadero {

    private static final double TEMP_MAXIMA = 30.0;
    private final List<SensorTemperatura> sensores = new ArrayList<>();

    public void agregarSensor(SensorTemperatura sensor) {
        sensores.add(sensor);
    }

    public void verificarTemperaturas() {
        for (SensorTemperatura sensor : sensores) {
            double temp = sensor.leerCelsius();
            String estado = temp > TEMP_MAXIMA ? "ALERTA: activar ventilación" : "OK";
            System.out.printf("  %-35s %6.1f °C  %s%n", sensor.getUbicacion(), temp, estado);
        }
    }
}
