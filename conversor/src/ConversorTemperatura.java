import javax.swing.*;

public class ConversorTemperatura {

    float celsius;
    float kelvin;

    float fahrenheit;

    public float kelvinCelsius () {

        kelvin = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja converter ?"));
        celsius = kelvin - 273;
        return  celsius;

    }

    public float celsiusKelvin () {

        celsius = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja converter ?"));
        kelvin = celsius + 273;
        return kelvin;
    }

    public float celsiusFahrenheit () {

        celsius = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja converter ?"));
        fahrenheit = (float) (celsius * 1.8 + 32);
        return fahrenheit;
    }

    public float kelvinFahrenheit () {

        kelvin = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja converter ?"));
        fahrenheit = (float) (1.8 *(kelvin - 273) +32);
        return fahrenheit;
    }

    public float fahrenheitKelvin () {

        fahrenheit = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja converter ?"));
        kelvin = (float) ((fahrenheit - 32) * 5/9 + 273);
        return kelvin;
    }

    public float fahrenheitCelsius (){

        fahrenheit = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja converter ?"));
        celsius = (float) ((fahrenheit - 32) / 1.8);
        return celsius;
    }
}
