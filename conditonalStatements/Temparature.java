package conditonalStatements;

public class Temparature{
    private double fahrenheit;

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public double toCelsius(){
        return (fahrenheit - 32) * 5/9;
    }
}
