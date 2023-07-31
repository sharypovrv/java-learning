package oop.seminars.seminar007.adapter.meteo;

import java.time.LocalDateTime;

public class ST500Adapter implements MeteoSensor{

    private SensorTemperature st;

    public ST500Adapter(SensorTemperature st) {
        this.st = st;
    }

    @Override
    public int getId() {
        return st.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) st.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(st.year(), 7, 7, 0, 0, 0);
        return dateTime;
    }
}
