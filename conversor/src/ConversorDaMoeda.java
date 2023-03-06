import javax.swing.*;

public class ConversorDaMoeda {

    // atributos
    float valor;

    // Construtor


    // Métodos

    public float recebeValor() {

        valor = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja converter ?"));

        return valor;
    }

    // Aplicar a API

}
