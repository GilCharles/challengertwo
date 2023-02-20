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


            }

        }
    }
}