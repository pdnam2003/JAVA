package Exeption;

public class TemperatureException extends Exception{
    private int temperature; // in Celsius
    public TemperatureException(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
}
TooColdException.java
public class TooColdException extends TemperatureException {
    public TooColdException(int temperature) {
        super(temperature);
    }
}
TooHotException.java
public class TooHotException extends TemperatureException {
    public TooHotException(int temperature) {
        super(temperature);
    }
}
