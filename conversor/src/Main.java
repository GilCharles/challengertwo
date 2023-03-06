// Imports

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Usuario nUsuario = new Usuario();

        String nome = nUsuario.recebeNome();



        Object[] opcoes = {"Conversor de moedas", "Conversor de temperatura"};
        Object escolha = JOptionPane.showInputDialog(null, "Escolha uma opção " + nome + ":", "Título da janela", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);


        if (escolha == opcoes[0]) {

            Object[] moeda = {"Dolar", "Euro"};
            Object escolhamoeda = JOptionPane.showInputDialog(null, "Qual moeda deseja converter ?", "Título da janela", JOptionPane.QUESTION_MESSAGE, null, moeda, moeda[0]);

            if (escolhamoeda == moeda[0]) {

                ConversorDaMoeda nValor = new ConversorDaMoeda();
                nValor.recebeValor();

            }
            if (escolhamoeda == moeda[1]) {



                // atualizar API
            }

        if (escolha == opcoes[1]) {


        }

        }
    }
}