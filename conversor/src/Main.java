// Imports

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Olá, bem vindo ao conversor, qual é o seu nome ?");

        Object[] opcoes = {"Conversor de moedas", "Conversor de temperatura"};
        Object escolha = JOptionPane.showInputDialog(null, "Escolha uma opção " + nome + ":", "Título da janela", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);


        if (escolha == opcoes[0]) {

            Object[] moeda = {"Dolar", "Euro"};
            Object escolhamoeda = JOptionPane.showInputDialog(null, "Qual moeda deseja converter ?", "Título da janela", JOptionPane.QUESTION_MESSAGE, null, moeda, moeda[0]);

            if (escolhamoeda == moeda[0]) {
                String valorstr = JOptionPane.showInputDialog("Digite o valor que deseja converter:");
                float valorfl = Float.parseFloat(valorstr);

                // Atualizar para uma API

<<<<<<< Updated upstream

            }
=======
                ConversorDaMoeda nValor = new ConversorDaMoeda();
                JOptionPane.showMessageDialog(null, nValor.recebeValorDolar());

            }
            if (escolhamoeda == moeda[1]) {

                ConversorDaMoeda nValor = new ConversorDaMoeda();
                JOptionPane.showMessageDialog(null, nValor.receberValorEuro());
            }

        }
        if (escolha == opcoes[1]) {

            Object[] escala = {"Celsius -> Kelvin", "Celsius -> Fahrenheit", "Kelvin -> Celsius", "Kelvin -> " +
                    "Fahrenheit", "Fahrenheit -> Celsius", "Fahrenheit -> Kelvin" };
            Object escolhaescala = JOptionPane.showInputDialog(null, "Qual escala de temperatura você quer usar", "T" +
                    "ítulo da janela", JOptionPane.QUESTION_MESSAGE, null, escala, escala[0]);


            if (escolhaescala == escala[0]) {

                ConversorTemperatura nValor = new ConversorTemperatura();
                JOptionPane.showMessageDialog(null, nValor.celsiusKelvin());
            }

            if (escolhaescala == escala[1]){

                ConversorTemperatura nValor = new ConversorTemperatura();
                JOptionPane.showMessageDialog(null, nValor.celsiusFahrenheit());
            }

            if (escolhaescala == escala[2]){

                ConversorTemperatura nValor = new ConversorTemperatura();
                JOptionPane.showMessageDialog(null, nValor.kelvinCelsius());
            }

            if (escolhaescala == escala[3]){

                ConversorTemperatura nValor = new ConversorTemperatura();
                JOptionPane.showMessageDialog(null, nValor.kelvinFahrenheit());
            }

            if (escolhaescala == escala[4]) {

                ConversorTemperatura nValor = new ConversorTemperatura();
                JOptionPane.showMessageDialog(null, nValor.fahrenheitCelsius());
            }

            if (escolhaescala == escala[5]) {

                ConversorTemperatura nValor = new ConversorTemperatura();
                JOptionPane.showMessageDialog(null, nValor.fahrenheitKelvin());
            }


        }
>>>>>>> Stashed changes

    }
}